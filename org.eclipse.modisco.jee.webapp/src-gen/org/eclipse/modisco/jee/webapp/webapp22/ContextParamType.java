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
package org.eclipse.modisco.jee.webapp.webapp22;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getContextParamType()
 * @model extendedMetaData="name='context-param_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextParamType extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name</em>' containment reference.
	 * @see #setParamName(ParamNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getContextParamType_ParamName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='param-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamNameType getParamName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamName <em>Param Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name</em>' containment reference.
	 * @see #getParamName()
	 * @generated
	 */
	void setParamName(ParamNameType value);

	/**
	 * Returns the value of the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Value</em>' containment reference.
	 * @see #setParamValue(ParamValueType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getContextParamType_ParamValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='param-value' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamValueType getParamValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getParamValue <em>Param Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Value</em>' containment reference.
	 * @see #getParamValue()
	 * @generated
	 */
	void setParamValue(ParamValueType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getContextParamType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getContextParamType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ContextParamType
