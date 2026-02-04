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
 * 	  connection factory reference name, the indication of the
 * 	  resource manager connection factory type expected by the
 * 	  Deployment Component code, the type of authentication
 * 	  (Application or Container), and an optional specification of
 * 	  the shareability of connections obtained from the resource
 * 	  (Shareable or Unshareable).
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
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType()
 * @model extendedMetaData="name='resource-refType' kind='elementOnly'"
 * @generated
 */
public interface ResourceRefType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType_ResRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='res-ref-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	JndiNameType getResRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResRefName <em>Res Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType_ResType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='res-type' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	FullyQualifiedClassType getResType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResType <em>Res Type</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType_ResAuth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='res-auth' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	ResAuthType getResAuth();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResAuth <em>Res Auth</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType_ResSharingScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='res-sharing-scope' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	ResSharingScopeType getResSharingScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getResSharingScope <em>Res Sharing Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Sharing Scope</em>' containment reference.
	 * @see #getResSharingScope()
	 * @generated
	 */
	void setResSharingScope(ResSharingScopeType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getResourceRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ResourceRefType
