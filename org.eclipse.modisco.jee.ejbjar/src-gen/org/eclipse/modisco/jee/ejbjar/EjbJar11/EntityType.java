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
package org.eclipse.modisco.jee.ejbjar.EjbJar11;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getCmpField <em>Cmp Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType()
 * @model extendedMetaData="name='entity_._type' kind='elementOnly'"
 * @generated
 */
public interface EntityType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(DisplayNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

	/**
	 * Returns the value of the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Icon</em>' containment reference.
	 * @see #setSmallIcon(SmallIconType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_SmallIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='small-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	SmallIconType getSmallIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getSmallIcon <em>Small Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Icon</em>' containment reference.
	 * @see #getSmallIcon()
	 * @generated
	 */
	void setSmallIcon(SmallIconType value);

	/**
	 * Returns the value of the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Large Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Icon</em>' containment reference.
	 * @see #setLargeIcon(LargeIconType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_LargeIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='large-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeIconType getLargeIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getLargeIcon <em>Large Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Icon</em>' containment reference.
	 * @see #getLargeIcon()
	 * @generated
	 */
	void setLargeIcon(LargeIconType value);

	/**
	 * Returns the value of the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Name</em>' containment reference.
	 * @see #setEjbName(EjbNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(HomeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_Home()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='home' namespace='##targetNamespace'"
	 * @generated
	 */
	HomeType getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(HomeType value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' containment reference.
	 * @see #setRemote(RemoteType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_Remote()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remote' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteType getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getRemote <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' containment reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(RemoteType value);

	/**
	 * Returns the value of the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Class</em>' containment reference.
	 * @see #setEjbClass(EjbClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_EjbClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-class' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbClassType getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getEjbClass <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' containment reference.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(EjbClassType value);

	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Type</em>' containment reference.
	 * @see #setPersistenceType(PersistenceTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_PersistenceType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persistence-type' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceTypeType getPersistenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPersistenceType <em>Persistence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' containment reference.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(PersistenceTypeType value);

	/**
	 * Returns the value of the '<em><b>Prim Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prim Key Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prim Key Class</em>' containment reference.
	 * @see #setPrimKeyClass(PrimKeyClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_PrimKeyClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='prim-key-class' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimKeyClassType getPrimKeyClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimKeyClass <em>Prim Key Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prim Key Class</em>' containment reference.
	 * @see #getPrimKeyClass()
	 * @generated
	 */
	void setPrimKeyClass(PrimKeyClassType value);

	/**
	 * Returns the value of the '<em><b>Reentrant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reentrant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reentrant</em>' containment reference.
	 * @see #setReentrant(ReentrantType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_Reentrant()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reentrant' namespace='##targetNamespace'"
	 * @generated
	 */
	ReentrantType getReentrant();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getReentrant <em>Reentrant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reentrant</em>' containment reference.
	 * @see #getReentrant()
	 * @generated
	 */
	void setReentrant(ReentrantType value);

	/**
	 * Returns the value of the '<em><b>Cmp Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmp Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmp Field</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_CmpField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmp-field' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CmpFieldType> getCmpField();

	/**
	 * Returns the value of the '<em><b>Primkey Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primkey Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primkey Field</em>' containment reference.
	 * @see #setPrimkeyField(PrimkeyFieldType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_PrimkeyField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primkey-field' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimkeyFieldType getPrimkeyField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getPrimkeyField <em>Primkey Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primkey Field</em>' containment reference.
	 * @see #getPrimkeyField()
	 * @generated
	 */
	void setPrimkeyField(PrimkeyFieldType value);

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_EnvEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnvEntryType> getEnvEntry();

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_EjbRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EjbRefType> getEjbRef();

	/**
	 * Returns the value of the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_SecurityRoleRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityRoleRefType> getSecurityRoleRef();

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_ResourceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceRefType> getResourceRef();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package#getEntityType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EntityType
