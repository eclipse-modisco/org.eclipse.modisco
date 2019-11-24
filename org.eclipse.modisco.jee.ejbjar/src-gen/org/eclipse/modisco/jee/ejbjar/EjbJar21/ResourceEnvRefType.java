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
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Env Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The resource-env-refType is used to define
 * 	  resource-env-type elements.  It contains a declaration of a
 * 	  Deployment Component's reference to an administered object
 * 	  associated with a resource in the Deployment Component's
 * 	  environment.  It consists of an optional description, the
 * 	  resource environment reference name, and an indication of
 * 	  the resource environment reference type expected by the
 * 	  Deployment Component code.
 * 
 * 	  Example:
 * 
 * 	  <resource-env-ref>
 * 	      <resource-env-ref-name>jms/StockQueue
 * 	      </resource-env-ref-name>
 * 	      <resource-env-ref-type>javax.jms.Queue
 * 	      </resource-env-ref-type>
 * 	  </resource-env-ref>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getResourceEnvRefType()
 * @model extendedMetaData="name='resource-env-refType' kind='elementOnly'"
 * @generated
 */
public interface ResourceEnvRefType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getResourceEnvRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Resource Env Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The resource-env-ref-name element specifies the name
	 * 	    of a resource environment reference; its value is
	 * 	    the environment entry name used in
	 * 	    the Deployment Component code.  The name is a JNDI
	 * 	    name relative to the java:comp/env context and must
	 * 	    be unique within a Deployment Component.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Env Ref Name</em>' containment reference.
	 * @see #setResourceEnvRefName(JndiNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getResourceEnvRefType_ResourceEnvRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	JndiNameType getResourceEnvRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Env Ref Name</em>' containment reference.
	 * @see #getResourceEnvRefName()
	 * @generated
	 */
	void setResourceEnvRefName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Resource Env Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The resource-env-ref-type element specifies the type
	 * 	    of a resource environment reference.  It is the
	 * 	    fully qualified name of a Java language class or
	 * 	    interface.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Env Ref Type</em>' containment reference.
	 * @see #setResourceEnvRefType(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getResourceEnvRefType_ResourceEnvRefType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-type' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	FullyQualifiedClassType getResourceEnvRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Env Ref Type</em>' containment reference.
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	void setResourceEnvRefType(FullyQualifiedClassType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getResourceEnvRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ResourceEnvRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ResourceEnvRefType
