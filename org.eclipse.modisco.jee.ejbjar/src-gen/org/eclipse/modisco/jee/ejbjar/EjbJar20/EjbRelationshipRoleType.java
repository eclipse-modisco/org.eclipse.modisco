/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejb Relationship Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType()
 * @model extendedMetaData="name='ejb-relationship-role_._type' kind='elementOnly'"
 * @generated
 */
public interface EjbRelationshipRoleType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role Name</em>' containment reference.
	 * @see #setEjbRelationshipRoleName(EjbRelationshipRoleNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_EjbRelationshipRoleName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-relationship-role-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationshipRoleNameType getEjbRelationshipRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role Name</em>' containment reference.
	 * @see #getEjbRelationshipRoleName()
	 * @generated
	 */
	void setEjbRelationshipRoleName(EjbRelationshipRoleNameType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(MultiplicityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_Multiplicity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='multiplicity' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiplicityType getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityType value);

	/**
	 * Returns the value of the '<em><b>Cascade Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Delete</em>' containment reference.
	 * @see #setCascadeDelete(CascadeDeleteType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_CascadeDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-delete' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadeDeleteType getCascadeDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Delete</em>' containment reference.
	 * @see #getCascadeDelete()
	 * @generated
	 */
	void setCascadeDelete(CascadeDeleteType value);

	/**
	 * Returns the value of the '<em><b>Relationship Role Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Role Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Role Source</em>' containment reference.
	 * @see #setRelationshipRoleSource(RelationshipRoleSourceType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_RelationshipRoleSource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship-role-source' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipRoleSourceType getRelationshipRoleSource();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Role Source</em>' containment reference.
	 * @see #getRelationshipRoleSource()
	 * @generated
	 */
	void setRelationshipRoleSource(RelationshipRoleSourceType value);

	/**
	 * Returns the value of the '<em><b>Cmr Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmr Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmr Field</em>' containment reference.
	 * @see #setCmrField(CmrFieldType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_CmrField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmr-field' namespace='##targetNamespace'"
	 * @generated
	 */
	CmrFieldType getCmrField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmr Field</em>' containment reference.
	 * @see #getCmrField()
	 * @generated
	 */
	void setCmrField(CmrFieldType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getEjbRelationshipRoleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EjbRelationshipRoleType
