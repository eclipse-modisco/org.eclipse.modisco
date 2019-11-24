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
package org.eclipse.modisco.jee.webapp.webapp24;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The security-roleType contains the definition of a security
 * 	  role. The definition consists of an optional description of the
 * 	  security role, and the security role name.
 * 
 * 	  Example:
 * 
 * 	      <security-role>
 * 	      <description>
 * 		  This role includes all employees who are authorized
 * 		  to access the employee service application.
 * 	      </description>
 * 	      <role-name>employee</role-name>
 * 	      </security-role>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getSecurityRoleType()
 * @model extendedMetaData="name='security-roleType' kind='elementOnly'"
 * @generated
 */
public interface SecurityRoleType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getSecurityRoleType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' containment reference.
	 * @see #setRoleName(RoleNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getSecurityRoleType_RoleName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	RoleNameType getRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getRoleName <em>Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' containment reference.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(RoleNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getSecurityRoleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SecurityRoleType
