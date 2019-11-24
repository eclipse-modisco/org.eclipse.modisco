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
 * A representation of the literals of the enumeration '<em><b>Cmp Version Type Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getCmpVersionTypeBase()
 * @model extendedMetaData="name='cmp-versionType_._base'"
 * @generated
 */
public enum CmpVersionTypeBase implements Enumerator {
	/**
	 * The '<em><b>1X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1X_VALUE
	 * @generated
	 * @ordered
	 */
	_1X(0, "_1X", "1.x"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>2X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2X_VALUE
	 * @generated
	 * @ordered
	 */
	_2X(1, "_2X", "2.x"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>1X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1X
	 * @model literal="1.x"
	 * @generated
	 * @ordered
	 */
	public static final int _1X_VALUE = 0;

	/**
	 * The '<em><b>2X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_2X
	 * @model literal="2.x"
	 * @generated
	 * @ordered
	 */
	public static final int _2X_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cmp Version Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CmpVersionTypeBase[] VALUES_ARRAY =
		new CmpVersionTypeBase[] {
			_1X,
			_2X,
		};

	/**
	 * A public read-only list of all the '<em><b>Cmp Version Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CmpVersionTypeBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cmp Version Type Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmpVersionTypeBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmpVersionTypeBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cmp Version Type Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmpVersionTypeBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmpVersionTypeBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cmp Version Type Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmpVersionTypeBase get(int value) {
		switch (value) {
			case _1X_VALUE: return _1X;
			case _2X_VALUE: return _2X;
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
	private CmpVersionTypeBase(int value, String name, String literal) {
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
	
} //CmpVersionTypeBase
