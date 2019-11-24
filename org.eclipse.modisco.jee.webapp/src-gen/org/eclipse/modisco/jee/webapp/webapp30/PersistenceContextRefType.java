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

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Context Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         <![CDATA[[
 *         The persistence-context-ref element contains a declaration
 *         of Deployment Component's reference to a persistence context
 *         associated within a Deployment Component's
 *         environment. It consists of:
 *         
 *         - an optional description
 *         - the persistence context reference name
 *         - an optional persistence unit name.  If not specified,
 *         the default persistence unit is assumed.
 *         - an optional specification as to whether
 *         the persistence context type is Transaction or
 *         Extended.  If not specified, Transaction is assumed.
 *         - an optional list of persistence properties
 *         - optional injection targets
 *         
 *         Examples:
 *         
 *         <persistence-context-ref>
 *         <persistence-context-ref-name>myPersistenceContext
 *         </persistence-context-ref-name>
 *         </persistence-context-ref>
 *         
 *         <persistence-context-ref>
 *         <persistence-context-ref-name>myPersistenceContext
 *         </persistence-context-ref-name>
 *         <persistence-unit-name>PersistenceUnit1
 *         </persistence-unit-name>
 *         <persistence-context-type>Extended</persistence-context-type>
 *         </persistence-context-ref>
 *         
 *         ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextRefName <em>Persistence Context Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceUnitName <em>Persistence Unit Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextType <em>Persistence Context Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceProperty <em>Persistence Property</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType()
 * @model extendedMetaData="name='persistence-context-refType' kind='elementOnly'"
 * @generated
 */
public interface PersistenceContextRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Persistence Context Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The persistence-context-ref-name element specifies
	 *             the name of a persistence context reference; its
	 *             value is the environment entry name used in
	 *             Deployment Component code.  The name is a JNDI name
	 *             relative to the java:comp/env context.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Context Ref Name</em>' containment reference.
	 * @see #setPersistenceContextRefName(JndiNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_PersistenceContextRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persistence-context-ref-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JndiNameType getPersistenceContextRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextRefName <em>Persistence Context Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Context Ref Name</em>' containment reference.
	 * @see #getPersistenceContextRefName()
	 * @generated
	 */
	void setPersistenceContextRefName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The Application Assembler(or BeanProvider) may use the
	 *             following syntax to avoid the need to rename persistence
	 *             units to have unique names within a Java EE application.
	 *             
	 *             The Application Assembler specifies the pathname of the
	 *             root of the persistence.xml file for the referenced
	 *             persistence unit and appends the name of the persistence
	 *             unit separated from the pathname by #. The pathname is
	 *             relative to the referencing application component jar file. 
	 *             In this manner, multiple persistence units with the same
	 *             persistence unit name may be uniquely identified when the 
	 *             Application Assembler cannot change persistence unit names.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Unit Name</em>' containment reference.
	 * @see #setPersistenceUnitName(org.eclipse.modisco.jee.webapp.webapp30.String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_PersistenceUnitName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-unit-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.webapp.webapp30.String getPersistenceUnitName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceUnitName <em>Persistence Unit Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit Name</em>' containment reference.
	 * @see #getPersistenceUnitName()
	 * @generated
	 */
	void setPersistenceUnitName(org.eclipse.modisco.jee.webapp.webapp30.String value);

	/**
	 * Returns the value of the '<em><b>Persistence Context Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Context Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Context Type</em>' containment reference.
	 * @see #setPersistenceContextType(PersistenceContextTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_PersistenceContextType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-context-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	PersistenceContextTypeType getPersistenceContextType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getPersistenceContextType <em>Persistence Context Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Context Type</em>' containment reference.
	 * @see #getPersistenceContextType()
	 * @generated
	 */
	void setPersistenceContextType(PersistenceContextTypeType value);

	/**
	 * Returns the value of the '<em><b>Persistence Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Used to specify properties for the container or persistence
	 *             provider.  Vendor-specific properties may be included in
	 *             the set of properties.  Properties that are not recognized
	 *             by a vendor must be ignored.  Entries that make use of the 
	 *             namespace javax.persistence and its subnamespaces must not
	 *             be used for vendor-specific properties.  The namespace
	 *             javax.persistence is reserved for use by the specification.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Property</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_PersistenceProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-property' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PropertyType> getPersistenceProperty();

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             A product specific name that this resource should be
	 *             mapped to.  The name of this resource, as defined by the
	 *             resource's name element or defaulted, is a name that is
	 *             local to the application component using the resource.
	 *             (It's a name in the JNDI java:comp/env namespace.)  Many
	 *             application servers provide a way to map these local
	 *             names to names of resources known to the application
	 *             server.  This mapped name is often a global JNDI name,
	 *             but may be a name of any form.
	 *             
	 *             Application servers are not required to support any
	 *             particular form or type of mapped name, nor the ability
	 *             to use mapped names.  The mapped name is
	 *             product-dependent and often installation-dependent.  No
	 *             use of a mapped name is portable.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped Name</em>' containment reference.
	 * @see #setMappedName(XsdStringType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getMappedName <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' containment reference.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Injection Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Target</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_InjectionTarget()
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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getPersistenceContextRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.PersistenceContextRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PersistenceContextRefType
