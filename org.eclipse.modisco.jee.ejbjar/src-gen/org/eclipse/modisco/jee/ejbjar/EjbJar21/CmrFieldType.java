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
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmr Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The cmr-fieldType describes the bean provider's view of
 * 	a relationship. It consists of an optional description, and
 * 	the name and the class type of a field in the source of a
 * 	role of a relationship. The cmr-field-name element
 * 	corresponds to the name used for the get and set accessor
 * 	methods for the relationship. The cmr-field-type element is
 * 	used only for collection-valued cmr-fields. It specifies the
 * 	type of the collection that is used.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldName <em>Cmr Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldType <em>Cmr Field Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getCmrFieldType()
 * @model extendedMetaData="name='cmr-fieldType' kind='elementOnly'"
 * @generated
 */
public interface CmrFieldType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getCmrFieldType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Cmr Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The cmr-field-name element specifies the name of a
	 * 	    logical relationship field in the entity bean
	 * 	    class. The name of the cmr-field must begin with a
	 * 	    lowercase letter. This field is accessed by methods
	 * 	    whose names consist of the name of the field
	 * 	    specified by cmr-field-name in which the first
	 * 	    letter is uppercased, prefixed by "get" or "set".
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmr Field Name</em>' containment reference.
	 * @see #setCmrFieldName(org.eclipse.modisco.jee.ejbjar.EjbJar21.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getCmrFieldType_CmrFieldName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cmr-field-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar21.String getCmrFieldName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldName <em>Cmr Field Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmr Field Name</em>' containment reference.
	 * @see #getCmrFieldName()
	 * @generated
	 */
	void setCmrFieldName(org.eclipse.modisco.jee.ejbjar.EjbJar21.String value);

	/**
	 * Returns the value of the '<em><b>Cmr Field Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmr Field Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmr Field Type</em>' containment reference.
	 * @see #setCmrFieldType(CmrFieldTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getCmrFieldType_CmrFieldType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmr-field-type' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	CmrFieldTypeType getCmrFieldType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getCmrFieldType <em>Cmr Field Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmr Field Type</em>' containment reference.
	 * @see #getCmrFieldType()
	 * @generated
	 */
	void setCmrFieldType(CmrFieldTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getCmrFieldType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.CmrFieldType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CmrFieldType
