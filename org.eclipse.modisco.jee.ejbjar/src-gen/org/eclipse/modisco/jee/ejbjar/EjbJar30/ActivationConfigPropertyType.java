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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Config Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The activation-config-propertyType contains a name/value
 * 	configuration property pair for a message-driven bean.
 * 
 * 	The properties that are recognized for a particular
 * 	message-driven bean are determined by the messaging type.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyName <em>Activation Config Property Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyValue <em>Activation Config Property Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getActivationConfigPropertyType()
 * @model extendedMetaData="name='activation-config-propertyType' kind='elementOnly'"
 * @generated
 */
public interface ActivationConfigPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Activation Config Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The activation-config-property-name element contains
	 * 	    the name for an activation configuration property of
	 * 	    a message-driven bean.
	 * 
	 * 	    For JMS message-driven beans, the following property
	 * 	    names are recognized: acknowledgeMode,
	 * 	    messageSelector, destinationType, subscriptionDurability
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Config Property Name</em>' containment reference.
	 * @see #setActivationConfigPropertyName(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getActivationConfigPropertyType_ActivationConfigPropertyName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activation-config-property-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getActivationConfigPropertyName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyName <em>Activation Config Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Config Property Name</em>' containment reference.
	 * @see #getActivationConfigPropertyName()
	 * @generated
	 */
	void setActivationConfigPropertyName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Activation Config Property Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The activation-config-property-value element
	 * 	    contains the value for an activation configuration
	 * 	    property of a message-driven bean.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Config Property Value</em>' containment reference.
	 * @see #setActivationConfigPropertyValue(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getActivationConfigPropertyType_ActivationConfigPropertyValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activation-config-property-value' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getActivationConfigPropertyValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getActivationConfigPropertyValue <em>Activation Config Property Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Config Property Value</em>' containment reference.
	 * @see #getActivationConfigPropertyValue()
	 * @generated
	 */
	void setActivationConfigPropertyValue(XsdStringType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getActivationConfigPropertyType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ActivationConfigPropertyType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ActivationConfigPropertyType
