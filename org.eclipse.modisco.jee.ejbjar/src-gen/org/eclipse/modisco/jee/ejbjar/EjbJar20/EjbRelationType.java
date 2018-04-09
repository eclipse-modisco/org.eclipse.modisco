/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejb Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationName <em>Ejb Relation Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole <em>Ejb Relationship Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationType()
 * @model extendedMetaData="name='ejb-relation_._type' kind='elementOnly'"
 * @generated
 */
public interface EjbRelationType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relation Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relation Name</em>' containment reference.
	 * @see #setEjbRelationName(EjbRelationNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationType_EjbRelationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-relation-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationNameType getEjbRelationName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationName <em>Ejb Relation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relation Name</em>' containment reference.
	 * @see #getEjbRelationName()
	 * @generated
	 */
	void setEjbRelationName(EjbRelationNameType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role</em>' containment reference.
	 * @see #setEjbRelationshipRole(EjbRelationshipRoleType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationType_EjbRelationshipRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-relationship-role' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationshipRoleType getEjbRelationshipRole();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole <em>Ejb Relationship Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role</em>' containment reference.
	 * @see #getEjbRelationshipRole()
	 * @generated
	 */
	void setEjbRelationshipRole(EjbRelationshipRoleType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role1</em>' containment reference.
	 * @see #setEjbRelationshipRole1(EjbRelationshipRoleType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationType_EjbRelationshipRole1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-relationship-role' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationshipRoleType getEjbRelationshipRole1();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role1</em>' containment reference.
	 * @see #getEjbRelationshipRole1()
	 * @generated
	 */
	void setEjbRelationshipRole1(EjbRelationshipRoleType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EjbRelationType
