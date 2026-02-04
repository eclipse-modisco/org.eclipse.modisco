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
package org.eclipse.modisco.jee.webapp.webapp30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         Please see section 8.2.2 of the specification for details.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getBefore <em>Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getOrderingType()
 * @model extendedMetaData="name='orderingType' kind='elementOnly'"
 * @generated
 */
public interface OrderingType extends EObject {
	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' containment reference.
	 * @see #setAfter(OrderingOrderingType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getOrderingType_After()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='after' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	OrderingOrderingType getAfter();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getAfter <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' containment reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OrderingOrderingType value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' containment reference.
	 * @see #setBefore(OrderingOrderingType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getOrderingType_Before()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='before' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	OrderingOrderingType getBefore();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingType#getBefore <em>Before</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' containment reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OrderingOrderingType value);

} // OrderingType
