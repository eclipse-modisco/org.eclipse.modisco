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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute Ordering Type</b></em>'.
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
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.AbsoluteOrderingType#getOthers <em>Others</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAbsoluteOrderingType()
 * @model extendedMetaData="name='absoluteOrderingType' kind='elementOnly'"
 * @generated
 */
public interface AbsoluteOrderingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAbsoluteOrderingType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAbsoluteOrderingType_Name()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='http://java.sun.com/xml/ns/javaee' group='#group:0'"
	 * @generated
	 */
	EList<JavaIdentifierType> getName();

	/**
	 * Returns the value of the '<em><b>Others</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.OrderingOthersType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Others</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Others</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAbsoluteOrderingType_Others()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='others' namespace='http://java.sun.com/xml/ns/javaee' group='#group:0'"
	 * @generated
	 */
	EList<OrderingOthersType> getOthers();

} // AbsoluteOrderingType
