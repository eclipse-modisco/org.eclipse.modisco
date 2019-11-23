/**
 *   Copyright (c) 2010 Mia-Software.
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
 * A representation of the model object '<em><b>Addressing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         This specifies the WS-Addressing requirements for a JAX-WS web service.
 *         It corresponds to javax.xml.ws.soap.Addressing annotation or its
 *         feature javax.xml.ws.soap.AddressingFeature.
 *         
 *         If the "enabled" element is "true", WS-Addressing is enabled.
 *         It means that the endpoint supports WS-Addressing but does not require
 *         its use. The default value for "enabled" is "true".
 *         
 *         If the WS-Addressing is enabled and the "required" element is "true",
 *         it means that the endpoint requires WS-Addressing. The default value
 *         for "required" is "false".
 *         
 *         If WS-Addressing is enabled, the "responses" element determines
 *         if an endpoint requires the use of only anonymous responses,
 *         or only non-anonymous responses, or all. The value of the "responses"
 *         element must be one of the following:
 *         
 *         ANONYMOUS
 *         NON_ANONYMOUS
 *         ALL
 *         
 *         The default value for the "responses" is ALL.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getResponses <em>Responses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAddressingType()
 * @model extendedMetaData="name='addressingType' kind='elementOnly'"
 * @generated
 */
public interface AddressingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' containment reference.
	 * @see #setEnabled(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAddressingType_Enabled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enabled' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getEnabled <em>Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' containment reference.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(TrueFalseType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAddressingType_Required()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='required' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference.
	 * @see #setResponses(AddressingResponsesType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getAddressingType_Responses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responses' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	AddressingResponsesType getResponses();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.AddressingType#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(AddressingResponsesType value);

} // AddressingType
