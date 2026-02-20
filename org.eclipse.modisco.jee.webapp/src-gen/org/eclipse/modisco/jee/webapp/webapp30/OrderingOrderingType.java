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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Ordering Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         This element contains a sequence of "name" elements, each of
 *         which
 *         refers to an application configuration resource by the "name"
 *         declared on its web.xml fragment.  This element can also contain
 *         a single "others" element which specifies that this document
 *         comes
 *         before or after other documents within the application.
 *         See section 8.2.2 of the specification for details.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getOthers <em>Others</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getOrderingOrderingType()
 * @model extendedMetaData="name='ordering-orderingType' kind='elementOnly'"
 * @generated
 */
public interface OrderingOrderingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getOrderingOrderingType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<JavaIdentifierType> getName();

	/**
	 * Returns the value of the '<em><b>Others</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Others</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Others</em>' containment reference.
	 * @see #setOthers(OrderingOthersType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getOrderingOrderingType_Others()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='others' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	OrderingOthersType getOthers();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOrderingType#getOthers <em>Others</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Others</em>' containment reference.
	 * @see #getOthers()
	 * @generated
	 */
	void setOthers(OrderingOthersType value);

} // OrderingOrderingType
