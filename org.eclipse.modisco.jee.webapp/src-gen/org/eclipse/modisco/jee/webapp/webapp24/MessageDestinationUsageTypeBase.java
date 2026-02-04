/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp24;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Destination Usage Type Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationUsageTypeBase()
 * @model extendedMetaData="name='message-destination-usageType_._base'"
 * @generated
 */
public enum MessageDestinationUsageTypeBase implements Enumerator {
	/**
	 * The '<em><b>Consumes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMES_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMES(0, "Consumes", "Consumes"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Produces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCES_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCES(1, "Produces", "Produces"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Consumes Produces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMES_PRODUCES_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMES_PRODUCES(2, "ConsumesProduces", "ConsumesProduces"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>Consumes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consumes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMES
	 * @model name="Consumes"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMES_VALUE = 0;

	/**
	 * The '<em><b>Produces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Produces</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCES
	 * @model name="Produces"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCES_VALUE = 1;

	/**
	 * The '<em><b>Consumes Produces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consumes Produces</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMES_PRODUCES
	 * @model name="ConsumesProduces"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMES_PRODUCES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Message Destination Usage Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageDestinationUsageTypeBase[] VALUES_ARRAY =
		new MessageDestinationUsageTypeBase[] {
			CONSUMES,
			PRODUCES,
			CONSUMES_PRODUCES,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Destination Usage Type Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageDestinationUsageTypeBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Destination Usage Type Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageDestinationUsageTypeBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageDestinationUsageTypeBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Destination Usage Type Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageDestinationUsageTypeBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageDestinationUsageTypeBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Destination Usage Type Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageDestinationUsageTypeBase get(int value) {
		switch (value) {
			case CONSUMES_VALUE: return CONSUMES;
			case PRODUCES_VALUE: return PRODUCES;
			case CONSUMES_PRODUCES_VALUE: return CONSUMES_PRODUCES;
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
	private MessageDestinationUsageTypeBase(int value, String name, String literal) {
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
	
} //MessageDestinationUsageTypeBase
