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
 * A representation of the model object '<em><b>Ejb Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The ejb-refType is used by ejb-ref elements for the
 *         declaration of a reference to an enterprise bean's home or
 *         to the remote business interface of a 3.0 bean.  
 *         The declaration consists of:
 *         
 *         - an optional description
 *         - the EJB reference name used in the code of
 *         the Deployment Component that's referencing the enterprise
 *         bean. 
 *         - the optional expected type of the referenced enterprise bean
 *         - the optional remote interface of the referenced enterprise bean
 *         or the remote business interface of the referenced enterprise 
 *         bean
 *         - the optional expected home interface of the referenced 
 *         enterprise bean.  Not applicable if this ejb-ref
 *         refers to the remote business interface of a 3.0 bean.
 *         - optional ejb-link information, used to specify the
 *         referenced enterprise bean
 *         - optional elements to define injection of the named enterprise
 *         bean into a component field or property
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getLookupName <em>Lookup Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType()
 * @model extendedMetaData="name='ejb-refType' kind='elementOnly'"
 * @generated
 */
public interface EjbRefType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Ejb Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref Name</em>' containment reference.
	 * @see #setEjbRefName(EjbRefNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_EjbRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-ref-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbRefNameType getEjbRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefName <em>Ejb Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref Name</em>' containment reference.
	 * @see #getEjbRefName()
	 * @generated
	 */
	void setEjbRefName(EjbRefNameType value);

	/**
	 * Returns the value of the '<em><b>Ejb Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref Type</em>' containment reference.
	 * @see #setEjbRefType(EjbRefTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_EjbRefType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-ref-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbRefTypeType getEjbRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbRefType <em>Ejb Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref Type</em>' containment reference.
	 * @see #getEjbRefType()
	 * @generated
	 */
	void setEjbRefType(EjbRefTypeType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_Home()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='home' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	HomeType getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getHome <em>Home</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_Remote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remote' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	RemoteType getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getRemote <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' containment reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(RemoteType value);

	/**
	 * Returns the value of the '<em><b>Ejb Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Link</em>' containment reference.
	 * @see #setEjbLink(EjbLinkType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_EjbLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-link' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbLinkType getEjbLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getEjbLink <em>Ejb Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Link</em>' containment reference.
	 * @see #getEjbLink()
	 * @generated
	 */
	void setEjbLink(EjbLinkType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getMappedName <em>Mapped Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_InjectionTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='injection-target' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<InjectionTargetType> getInjectionTarget();

	/**
	 * Returns the value of the '<em><b>Lookup Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The JNDI name to be looked up to resolve a resource reference.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lookup Name</em>' containment reference.
	 * @see #setLookupName(XsdStringType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_LookupName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lookup-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getLookupName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getLookupName <em>Lookup Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Name</em>' containment reference.
	 * @see #getLookupName()
	 * @generated
	 */
	void setLookupName(XsdStringType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getEjbRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.EjbRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EjbRefType
