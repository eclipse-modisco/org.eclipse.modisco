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
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cmr Field Type Type Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getCmrFieldTypeTypeBase()
 * @model extendedMetaData="name='cmr-field-typeType_._base'"
 * @generated
 */
public enum CmrFieldTypeTypeBase implements Enumerator {
	/**
	 * The '<em><b>Java Util Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_UTIL_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_UTIL_COLLECTION(0, "javaUtilCollection", "java.util.Collection"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Java Util Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_UTIL_SET_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_UTIL_SET(1, "javaUtilSet", "java.util.Set"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Java Util Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java Util Collection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_UTIL_COLLECTION
	 * @model name="javaUtilCollection" literal="java.util.Collection"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_UTIL_COLLECTION_VALUE = 0;

	/**
	 * The '<em><b>Java Util Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java Util Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_UTIL_SET
	 * @model name="javaUtilSet" literal="java.util.Set"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_UTIL_SET_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cmr Field Type Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CmrFieldTypeTypeBase[] VALUES_ARRAY =
		new CmrFieldTypeTypeBase[] {
			JAVA_UTIL_COLLECTION,
			JAVA_UTIL_SET,
		};

	/**
	 * A public read-only list of all the '<em><b>Cmr Field Type Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CmrFieldTypeTypeBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cmr Field Type Type Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmrFieldTypeTypeBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmrFieldTypeTypeBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cmr Field Type Type Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmrFieldTypeTypeBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmrFieldTypeTypeBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cmr Field Type Type Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CmrFieldTypeTypeBase get(int value) {
		switch (value) {
			case JAVA_UTIL_COLLECTION_VALUE: return JAVA_UTIL_COLLECTION;
			case JAVA_UTIL_SET_VALUE: return JAVA_UTIL_SET;
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
	private CmrFieldTypeTypeBase(int value, String name, String literal) {
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
	
} //CmrFieldTypeTypeBase
