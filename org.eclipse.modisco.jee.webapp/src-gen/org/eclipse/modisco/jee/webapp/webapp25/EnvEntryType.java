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
package org.eclipse.modisco.jee.webapp.webapp25;

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
 * 	description, the name of the environment entry, a type
 * 	(optional if the value is injected, otherwise required), and
 * 	an optional value.
 * 
 * 	It also includes optional elements to define injection of
 * 	the named resource into fields or JavaBeans properties.
 * 
 * 	If a value is not specified and injection is requested,
 * 	no injection will occur and no entry of the specified name
 * 	will be created.  This allows an initial value to be
 * 	specified in the source code without being incorrectly
 * 	changed when no override has been specified.
 * 
 * 	If a value is not specified and no injection is requested,
 * 	a value must be supplied during deployment.
 * 
 * 	This type is used by env-entry elements.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType()
 * @model extendedMetaData="name='env-entryType' kind='elementOnly'"
 * @generated
 */
public interface EnvEntryType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_EnvEntryName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='env-entry-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JndiNameType getEnvEntryName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getEnvEntryName <em>Env Entry Name</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      The env-entry-type element contains the Java language
	 * 	      type of the environment entry.  If an injection target
	 * 	      is specified for the environment entry, the type may
	 * 	      be omitted, or must match the type of the injection
	 * 	      target.  If no injection target is specified, the type
	 * 	      is required.
	 * 
	 * 	      Example:
	 * 
	 * 	      <env-entry-type>java.lang.Integer</env-entry-type>
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env Entry Type</em>' containment reference.
	 * @see #setEnvEntryType(EnvEntryTypeValuesType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_EnvEntryType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EnvEntryTypeValuesType getEnvEntryType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getEnvEntryType <em>Env Entry Type</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_EnvEntryValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry-value' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getEnvEntryValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getEnvEntryValue <em>Env Entry Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Value</em>' containment reference.
	 * @see #getEnvEntryValue()
	 * @generated
	 */
	void setEnvEntryValue(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      A product specific name that this resource should be
	 * 	      mapped to.  The name of this resource, as defined by the
	 * 	      resource's name element or defaulted, is a name that is
	 * 	      local to the application component using the resource.
	 * 	      (It's a name in the JNDI java:comp/env namespace.)  Many
	 * 	      application servers provide a way to map these local
	 * 	      names to names of resources known to the application
	 * 	      server.  This mapped name is often a global JNDI name,
	 * 	      but may be a name of any form.
	 * 
	 * 	      Application servers are not required to support any
	 * 	      particular form or type of mapped name, nor the ability
	 * 	      to use mapped names.  The mapped name is
	 * 	      product-dependent and often installation-dependent.  No
	 * 	      use of a mapped name is portable.
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped Name</em>' containment reference.
	 * @see #setMappedName(XsdStringType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getMappedName <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' containment reference.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Injection Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Target</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_InjectionTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='injection-target' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<InjectionTargetType> getInjectionTarget();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getEnvEntryType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EnvEntryType
