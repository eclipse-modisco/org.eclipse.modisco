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
package org.eclipse.modisco.jee.webapp.webapp25;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The resource-refType contains a declaration of a
 * 	  Deployment Component's reference to an external resource. It
 * 	  consists of an optional description, the resource manager
 * 	  connection factory reference name, an optional indication of
 * 	  the resource manager connection factory type expected by the
 * 	  Deployment Component code, an optional type of authentication
 * 	  (Application or Container), and an optional specification of
 * 	  the shareability of connections obtained from the resource
 * 	  (Shareable or Unshareable).
 * 
 * 	  It also includes optional elements to define injection of
 * 	  the named resource into fields or JavaBeans properties.
 * 
 * 	  The connection factory type must be supplied unless an
 * 	  injection target is specified, in which case the type
 * 	  of the target is used.  If both are specified, the type
 * 	  must be assignment compatible with the type of the injection
 * 	  target.
 * 
 * 	  Example:
 * 
 * 	  <resource-ref>
 * 	      <res-ref-name>jdbc/EmployeeAppDB</res-ref-name>
 * 	      <res-type>javax.sql.DataSource</res-type>
 * 	      <res-auth>Container</res-auth>
 * 	      <res-sharing-scope>Shareable</res-sharing-scope>
 * 	  </resource-ref>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType()
 * @model extendedMetaData="name='resource-refType' kind='elementOnly'"
 * @generated
 */
public interface ResourceRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The res-ref-name element specifies the name of a
	 * 	    resource manager connection factory reference.
	 * 	    The name is a JNDI name relative to the
	 * 	    java:comp/env context.
	 * 	    The name must be unique within a Deployment File.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res Ref Name</em>' containment reference.
	 * @see #setResRefName(JndiNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_ResRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='res-ref-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JndiNameType getResRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResRefName <em>Res Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Ref Name</em>' containment reference.
	 * @see #getResRefName()
	 * @generated
	 */
	void setResRefName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The res-type element specifies the type of the data
	 * 	    source. The type is specified by the fully qualified
	 * 	    Java language class or interface
	 * 	    expected to be implemented by the data source.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res Type</em>' containment reference.
	 * @see #setResType(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_ResType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='res-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getResType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResType <em>Res Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Type</em>' containment reference.
	 * @see #getResType()
	 * @generated
	 */
	void setResType(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Res Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Auth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Auth</em>' containment reference.
	 * @see #setResAuth(ResAuthType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_ResAuth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='res-auth' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ResAuthType getResAuth();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResAuth <em>Res Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Auth</em>' containment reference.
	 * @see #getResAuth()
	 * @generated
	 */
	void setResAuth(ResAuthType value);

	/**
	 * Returns the value of the '<em><b>Res Sharing Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Sharing Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Sharing Scope</em>' containment reference.
	 * @see #setResSharingScope(ResSharingScopeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_ResSharingScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='res-sharing-scope' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ResSharingScopeType getResSharingScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Sharing Scope</em>' containment reference.
	 * @see #getResSharingScope()
	 * @generated
	 */
	void setResSharingScope(ResSharingScopeType value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      A product specific name that this resource should be
	 * 	      mapped to.  The name of this resource, as defined by the
	 * 	      resource's name element or defaulted, is a name that is
	 * 	      local to the application component using the resource.
	 * 	      (It's a name in the JNDI java:comp/env namespace.)  Many
	 * 	      application servers provide a way to map these local
	 * 	      names to names of resources known to the application
	 * 	      server.  This mapped name is often a global JNDI name,
	 * 	      but may be a name of any form.
	 * 
	 * 	      Application servers are not required to support any
	 * 	      particular form or type of mapped name, nor the ability
	 * 	      to use mapped names.  The mapped name is
	 * 	      product-dependent and often installation-dependent.  No
	 * 	      use of a mapped name is portable.
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped Name</em>' containment reference.
	 * @see #setMappedName(XsdStringType)
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getMappedName <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' containment reference.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Injection Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp25.InjectionTargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Target</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_InjectionTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='injection-target' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<InjectionTargetType> getInjectionTarget();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package#getResourceRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp25.ResourceRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ResourceRefType
