/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The env-entryType is used to declare an application's
 * 	environment entry. The declaration consists of an optional
 * 	description, the name of the environment entry, and an
 * 	optional value.  If a value is not specified, one must be
 * 	supplied during deployment.
 * 
 * 	It is used by env-entry elements.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEnvEntryType()
 * @model extendedMetaData="name='env-entryType' kind='elementOnly'"
 * @generated
 */
public interface EnvEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEnvEntryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      The env-entry-name element contains the name of a
	 * 	      Deployment Component's environment entry.  The name
	 * 	      is a JNDI name relative to the java:comp/env
	 * 	      context.  The name must be unique within a
	 * 	      Deployment Component. The uniqueness
	 * 	      constraints must be defined within the declared
	 * 	      context.
	 * 
	 * 	      Example:
	 * 
	 * 	      <env-entry-name>minAmount</env-entry-name>
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env Entry Name</em>' containment reference.
	 * @see #setEnvEntryName(JndiNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEnvEntryType_EnvEntryName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='env-entry-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	JndiNameType getEnvEntryName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Name</em>' containment reference.
	 * @see #getEnvEntryName()
	 * @generated
	 */
	void setEnvEntryName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry Type</em>' containment reference.
	 * @see #setEnvEntryType(EnvEntryTypeValuesType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEnvEntryType_EnvEntryType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='env-entry-type' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EnvEntryTypeValuesType getEnvEntryType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Type</em>' containment reference.
	 * @see #getEnvEntryType()
	 * @generated
	 */
	void setEnvEntryType(EnvEntryTypeValuesType value);

	/**
	 * Returns the value of the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      The env-entry-value designates the value of a
	 * 	      Deployment Component's environment entry. The value
	 * 	      must be a String that is valid for the
	 * 	      constructor of the specified type that takes a
	 * 	      single String parameter, or for java.lang.Character,
	 * 	      a single character.
	 * 
	 * 	      Example:
	 * 
	 * 	      <env-entry-value>100.00</env-entry-value>
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env Entry Value</em>' containment reference.
	 * @see #setEnvEntryValue(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEnvEntryType_EnvEntryValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry-value' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	XsdStringType getEnvEntryValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Value</em>' containment reference.
	 * @see #getEnvEntryValue()
	 * @generated
	 */
	void setEnvEntryValue(XsdStringType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getEnvEntryType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.EnvEntryType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EnvEntryType
