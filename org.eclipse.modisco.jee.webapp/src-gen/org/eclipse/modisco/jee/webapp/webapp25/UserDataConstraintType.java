/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp25;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The user-data-constraintType is used to indicate how
 * 	data communicated between the client and container should be
 * 	protected.
 * 
 * 	Used in: security-constraint
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType#getTransportGuarantee <em>Transport Guarantee</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getUserDataConstraintType()
 * @model extendedMetaData="name='user-data-constraintType' kind='elementOnly'"
 * @generated
 */
public interface UserDataConstraintType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getUserDataConstraintType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Transport Guarantee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Guarantee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Guarantee</em>' containment reference.
	 * @see #setTransportGuarantee(TransportGuaranteeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getUserDataConstraintType_TransportGuarantee()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transport-guarantee' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TransportGuaranteeType getTransportGuarantee();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType#getTransportGuarantee <em>Transport Guarantee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Guarantee</em>' containment reference.
	 * @see #getTransportGuarantee()
	 * @generated
	 */
	void setTransportGuarantee(TransportGuaranteeType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getUserDataConstraintType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.UserDataConstraintType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // UserDataConstraintType
