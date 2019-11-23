/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.catalog;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discoverer Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDiscoverer <em>Discoverer</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#isRequiredInput <em>Required Input</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getGetter <em>Getter</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getSetter <em>Setter</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter()
 * @model
 * @generated
 */
public interface DiscovererParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Discoverer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getParameterDefinitions <em>Parameter Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoverer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoverer</em>' container reference.
	 * @see #setDiscoverer(DiscovererDescription)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Discoverer()
	 * @see org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription#getParameterDefinitions
	 * @model opposite="parameterDefinitions" required="true" transient="false"
	 * @generated
	 */
	DiscovererDescription getDiscoverer();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDiscoverer <em>Discoverer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discoverer</em>' container reference.
	 * @see #getDiscoverer()
	 * @generated
	 */
	void setDiscoverer(DiscovererDescription value);

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
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.infra.discovery.catalog.DirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DirectionKind
	 * @see #setDirection(DirectionKind)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Direction()
	 * @model transient="true"
	 * @generated
	 */
	DirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.modisco.infra.discovery.catalog.DirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionKind value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Description()
	 * @model transient="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Required Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Input</em>' attribute.
	 * @see #setRequiredInput(boolean)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_RequiredInput()
	 * @model transient="true"
	 * @generated
	 */
	boolean isRequiredInput();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#isRequiredInput <em>Required Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Input</em>' attribute.
	 * @see #isRequiredInput()
	 * @generated
	 */
	void setRequiredInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Type()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(Field)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Field()
	 * @model dataType="org.eclipse.modisco.infra.discovery.catalog.Field" transient="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' attribute.
	 * @see #setGetter(Method)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Getter()
	 * @model dataType="org.eclipse.modisco.infra.discovery.catalog.Method" transient="true"
	 * @generated
	 */
	Method getGetter();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getGetter <em>Getter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' attribute.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(Method value);

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' attribute.
	 * @see #setSetter(Method)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Setter()
	 * @model dataType="org.eclipse.modisco.infra.discovery.catalog.Method" transient="true"
	 * @generated
	 */
	Method getSetter();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getSetter <em>Setter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' attribute.
	 * @see #getSetter()
	 * @generated
	 */
	void setSetter(Method value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' attribute.
	 * @see #setInitializer(Method)
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererParameter_Initializer()
	 * @model dataType="org.eclipse.modisco.infra.discovery.catalog.Method" transient="true"
	 * @generated
	 */
	Method getInitializer();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter#getInitializer <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' attribute.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Method value);

} // DiscovererParameter
