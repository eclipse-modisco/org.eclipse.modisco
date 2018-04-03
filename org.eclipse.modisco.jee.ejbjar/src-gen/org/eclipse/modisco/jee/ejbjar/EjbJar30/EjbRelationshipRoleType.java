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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ejb Relationship Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The ejb-relationship-roleType describes a role within a
 * 	  relationship. There are two roles in each relationship.
 * 
 * 	  The ejb-relationship-roleType contains an optional
 * 	  description; an optional name for the relationship role; a
 * 	  specification of the multiplicity of the role; an optional
 * 	  specification of cascade-delete functionality for the role;
 * 	  the role source; and a declaration of the cmr-field, if any,
 * 	  by means of which the other side of the relationship is
 * 	  accessed from the perspective of the role source.
 * 
 * 	  The multiplicity and role-source element are mandatory.
 * 
 * 	  The relationship-role-source element designates an entity
 * 	  bean by means of an ejb-name element. For bidirectional
 * 	  relationships, both roles of a relationship must declare a
 * 	  relationship-role-source element that specifies a cmr-field
 * 	  in terms of which the relationship is accessed. The lack of
 * 	  a cmr-field element in an ejb-relationship-role specifies
 * 	  that the relationship is unidirectional in navigability and
 * 	  the entity bean that participates in the relationship is
 * 	  "not aware" of the relationship.
 * 
 * 	  Example:
 * 
 * 	  <ejb-relation>
 * 	      <ejb-relation-name>Product-LineItem</ejb-relation-name>
 * 	      <ejb-relationship-role>
 * 		  <ejb-relationship-role-name>product-has-lineitems
 * 		  </ejb-relationship-role-name>
 * 		  <multiplicity>One</multiplicity>
 * 		  <relationship-role-source>
 * 		  <ejb-name>ProductEJB</ejb-name>
 * 		  </relationship-role-source>
 * 	       </ejb-relationship-role>
 * 	  </ejb-relation>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType()
 * @model extendedMetaData="name='ejb-relationship-roleType' kind='elementOnly'"
 * @generated
 */
public interface EjbRelationshipRoleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The ejb-relationship-role-name element defines a
	 * 	    name for a role that is unique within an
	 * 	    ejb-relation. Different relationships can use the
	 * 	    same name for a role.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ejb Relationship Role Name</em>' containment reference.
	 * @see #setEjbRelationshipRoleName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_EjbRelationshipRoleName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-relationship-role-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar30.String getEjbRelationshipRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role Name</em>' containment reference.
	 * @see #getEjbRelationshipRoleName()
	 * @generated
	 */
	void setEjbRelationshipRoleName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_Multiplicity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='multiplicity' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MultiplicityType getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getMultiplicity <em>Multiplicity</em>}' containment reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The cascade-delete element specifies that, within a
	 * 	    particular relationship, the lifetime of one or more
	 * 	    entity beans is dependent upon the lifetime of
	 * 	    another entity bean. The cascade-delete element can
	 * 	    only be specified for an ejb-relationship-role
	 * 	    element contained in an ejb-relation element in
	 * 	    which the other ejb-relationship-role
	 * 	    element specifies a multiplicity of One.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cascade Delete</em>' containment reference.
	 * @see #setCascadeDelete(EmptyType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_CascadeDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cascade-delete' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EmptyType getCascadeDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCascadeDelete <em>Cascade Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Delete</em>' containment reference.
	 * @see #getCascadeDelete()
	 * @generated
	 */
	void setCascadeDelete(EmptyType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_RelationshipRoleSource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship-role-source' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	RelationshipRoleSourceType getRelationshipRoleSource();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getRelationshipRoleSource <em>Relationship Role Source</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_CmrField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmr-field' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	CmrFieldType getCmrField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getCmrField <em>Cmr Field</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getEjbRelationshipRoleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EjbRelationshipRoleType
