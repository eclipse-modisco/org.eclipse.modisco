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
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Env Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getResourceEnvRefType()
 * @model extendedMetaData="name='resource-env-ref_._type' kind='elementOnly'"
 * @generated
 */
public interface ResourceEnvRefType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getResourceEnvRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Resource Env Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref Name</em>' containment reference.
	 * @see #setResourceEnvRefName(ResourceEnvRefNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getResourceEnvRefType_ResourceEnvRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefNameType getResourceEnvRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefName <em>Resource Env Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Env Ref Name</em>' containment reference.
	 * @see #getResourceEnvRefName()
	 * @generated
	 */
	void setResourceEnvRefName(ResourceEnvRefNameType value);

	/**
	 * Returns the value of the '<em><b>Resource Env Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref Type</em>' containment reference.
	 * @see #setResourceEnvRefType(ResourceEnvRefTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getResourceEnvRefType_ResourceEnvRefType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefTypeType getResourceEnvRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getResourceEnvRefType <em>Resource Env Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Env Ref Type</em>' containment reference.
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	void setResourceEnvRefType(ResourceEnvRefTypeType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getResourceEnvRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ResourceEnvRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ResourceEnvRefType
