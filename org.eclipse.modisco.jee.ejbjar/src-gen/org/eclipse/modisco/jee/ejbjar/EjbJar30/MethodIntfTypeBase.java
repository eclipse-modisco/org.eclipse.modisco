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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Method Intf Type Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMethodIntfTypeBase()
 * @model extendedMetaData="name='method-intfType_._base'"
 * @generated
 */
public enum MethodIntfTypeBase implements Enumerator {
	/**
	 * The '<em><b>Home</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(0, "Home", "Home"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Remote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE(1, "Remote", "Remote"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Local Home</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_HOME_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_HOME(2, "LocalHome", "LocalHome"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Local</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL(3, "Local", "Local"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Service Endpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_ENDPOINT(4, "ServiceEndpoint", "ServiceEndpoint"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Home</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Home</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOME
	 * @model name="Home"
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 0;

	/**
	 * The '<em><b>Remote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE
	 * @model name="Remote"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_VALUE = 1;

	/**
	 * The '<em><b>Local Home</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Home</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_HOME
	 * @model name="LocalHome"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_HOME_VALUE = 2;

	/**
	 * The '<em><b>Local</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL
	 * @model name="Local"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VALUE = 3;

	/**
	 * The '<em><b>Service Endpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Endpoint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ENDPOINT
	 * @model name="ServiceEndpoint"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_ENDPOINT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Method Intf Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MethodIntfTypeBase[] VALUES_ARRAY =
		new MethodIntfTypeBase[] {
			HOME,
			REMOTE,
			LOCAL_HOME,
			LOCAL,
			SERVICE_ENDPOINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Method Intf Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MethodIntfTypeBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Method Intf Type Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodIntfTypeBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodIntfTypeBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Intf Type Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodIntfTypeBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodIntfTypeBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Intf Type Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodIntfTypeBase get(int value) {
		switch (value) {
			case HOME_VALUE: return HOME;
			case REMOTE_VALUE: return REMOTE;
			case LOCAL_HOME_VALUE: return LOCAL_HOME;
			case LOCAL_VALUE: return LOCAL;
			case SERVICE_ENDPOINT_VALUE: return SERVICE_ENDPOINT;
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
	private MethodIntfTypeBase(int value, String name, String literal) {
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
	
} //MethodIntfTypeBase
