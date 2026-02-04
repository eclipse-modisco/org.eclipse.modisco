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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servlet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletClass <em>Servlet Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getJspFile <em>Jsp File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType()
 * @model extendedMetaData="name='servlet_._type' kind='elementOnly'"
 * @generated
 */
public interface ServletType extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(IconType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='##targetNamespace'"
	 * @generated
	 */
	IconType getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(IconType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_ServletName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='servlet-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletNameType getServletName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletName <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Name</em>' containment reference.
	 * @see #getServletName()
	 * @generated
	 */
	void setServletName(ServletNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Servlet Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Class</em>' containment reference.
	 * @see #setServletClass(ServletClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_ServletClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servlet-class' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletClassType getServletClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getServletClass <em>Servlet Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Class</em>' containment reference.
	 * @see #getServletClass()
	 * @generated
	 */
	void setServletClass(ServletClassType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_JspFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jsp-file' namespace='##targetNamespace'"
	 * @generated
	 */
	JspFileType getJspFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getJspFile <em>Jsp File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsp File</em>' containment reference.
	 * @see #getJspFile()
	 * @generated
	 */
	void setJspFile(JspFileType value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp23.InitParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_InitParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='init-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InitParamType> getInitParam();

	/**
	 * Returns the value of the '<em><b>Load On Startup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load On Startup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load On Startup</em>' containment reference.
	 * @see #setLoadOnStartup(LoadOnStartupType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_LoadOnStartup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='load-on-startup' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadOnStartupType getLoadOnStartup();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getLoadOnStartup <em>Load On Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load On Startup</em>' containment reference.
	 * @see #getLoadOnStartup()
	 * @generated
	 */
	void setLoadOnStartup(LoadOnStartupType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_RunAs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='run-as' namespace='##targetNamespace'"
	 * @generated
	 */
	RunAsType getRunAs();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getRunAs <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As</em>' containment reference.
	 * @see #getRunAs()
	 * @generated
	 */
	void setRunAs(RunAsType value);

	/**
	 * Returns the value of the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp23.SecurityRoleRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_SecurityRoleRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='##targetNamespace'"
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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getServletType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ServletType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServletType
