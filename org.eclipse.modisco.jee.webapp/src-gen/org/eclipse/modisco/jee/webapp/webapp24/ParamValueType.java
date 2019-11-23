/**
 *   Copyright (c) 2010, 2019 Mia-Software.
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	This type is a general type that can be used to declare
 * 	parameter/value lists.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getParamValueType()
 * @model extendedMetaData="name='param-valueType' kind='elementOnly'"
 * @generated
 */
public interface ParamValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getParamValueType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The param-name element contains the name of a
	 * 	    parameter.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Name</em>' containment reference.
	 * @see #setParamName(org.eclipse.modisco.jee.webapp.webapp24.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getParamValueType_ParamName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='param-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp24.String getParamName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamName <em>Param Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name</em>' containment reference.
	 * @see #getParamName()
	 * @generated
	 */
	void setParamName(org.eclipse.modisco.jee.webapp.webapp24.String value);

	/**
	 * Returns the value of the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The param-value element contains the value of a
	 * 	    parameter.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Value</em>' containment reference.
	 * @see #setParamValue(XsdStringType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getParamValueType_ParamValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='param-value' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	XsdStringType getParamValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getParamValue <em>Param Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Value</em>' containment reference.
	 * @see #getParamValue()
	 * @generated
	 */
	void setParamValue(XsdStringType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getParamValueType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ParamValueType
