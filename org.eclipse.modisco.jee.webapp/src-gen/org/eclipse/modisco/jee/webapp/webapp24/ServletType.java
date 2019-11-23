/**
 *   Copyright (c) 2010, 2019 Mia-Software.
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
 * A representation of the model object '<em><b>Servlet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The servletType is used to declare a servlet.
 * 	It contains the declarative data of a
 * 	servlet. If a jsp-file is specified and the load-on-startup
 * 	element is present, then the JSP should be precompiled and
 * 	loaded.
 * 
 * 	Used in: web-app
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletClass <em>Servlet Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getJspFile <em>Jsp File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType()
 * @model extendedMetaData="name='servletType' kind='elementOnly'"
 * @generated
 */
public interface ServletType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Servlet Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Name</em>' containment reference.
	 * @see #setServletName(ServletNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_ServletName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='servlet-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	ServletNameType getServletName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletName <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Name</em>' containment reference.
	 * @see #getServletName()
	 * @generated
	 */
	void setServletName(ServletNameType value);

	/**
	 * Returns the value of the '<em><b>Servlet Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	      The servlet-class element contains the fully
	 * 	      qualified class name of the servlet.
	 * 
	 * 	    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Servlet Class</em>' containment reference.
	 * @see #setServletClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_ServletClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servlet-class' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	FullyQualifiedClassType getServletClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getServletClass <em>Servlet Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Class</em>' containment reference.
	 * @see #getServletClass()
	 * @generated
	 */
	void setServletClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Jsp File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsp File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsp File</em>' containment reference.
	 * @see #setJspFile(JspFileType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_JspFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsp-file' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	JspFileType getJspFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getJspFile <em>Jsp File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsp File</em>' containment reference.
	 * @see #getJspFile()
	 * @generated
	 */
	void setJspFile(JspFileType value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_InitParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-param' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<ParamValueType> getInitParam();

	/**
	 * Returns the value of the '<em><b>Load On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The load-on-startup element indicates that this
	 * 	    servlet should be loaded (instantiated and have
	 * 	    its init() called) on the startup of the web
	 * 	    application. The optional contents of these
	 * 	    element must be an integer indicating the order in
	 * 	    which the servlet should be loaded. If the value
	 * 	    is a negative integer, or the element is not
	 * 	    present, the container is free to load the servlet
	 * 	    whenever it chooses. If the value is a positive
	 * 	    integer or 0, the container must load and
	 * 	    initialize the servlet as the application is
	 * 	    deployed. The container must guarantee that
	 * 	    servlets marked with lower integers are loaded
	 * 	    before servlets marked with higher integers. The
	 * 	    container may choose the order of loading of
	 * 	    servlets with the same load-on-start-up value.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load On Startup</em>' containment reference.
	 * @see #setLoadOnStartup(XsdIntegerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_LoadOnStartup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='load-on-startup' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	XsdIntegerType getLoadOnStartup();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getLoadOnStartup <em>Load On Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load On Startup</em>' containment reference.
	 * @see #getLoadOnStartup()
	 * @generated
	 */
	void setLoadOnStartup(XsdIntegerType value);

	/**
	 * Returns the value of the '<em><b>Run As</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run As</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run As</em>' containment reference.
	 * @see #setRunAs(RunAsType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_RunAs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='run-as' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	RunAsType getRunAs();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getRunAs <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As</em>' containment reference.
	 * @see #getRunAs()
	 * @generated
	 */
	void setRunAs(RunAsType value);

	/**
	 * Returns the value of the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_SecurityRoleRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<SecurityRoleRefType> getSecurityRoleRef();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getServletType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.ServletType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServletType
