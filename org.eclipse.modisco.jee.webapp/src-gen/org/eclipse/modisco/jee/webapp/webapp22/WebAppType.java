/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp22;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web App Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getTaglib <em>Taglib</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType()
 * @model extendedMetaData="name='web-app_._type' kind='elementOnly'"
 * @generated
 */
public interface WebAppType extends EObject {
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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='##targetNamespace'"
	 * @generated
	 */
	IconType getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(IconType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDisplayName <em>Display Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Distributable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distributable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributable</em>' containment reference.
	 * @see #setDistributable(DistributableType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_Distributable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributable' namespace='##targetNamespace'"
	 * @generated
	 */
	DistributableType getDistributable();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getDistributable <em>Distributable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributable</em>' containment reference.
	 * @see #getDistributable()
	 * @generated
	 */
	void setDistributable(DistributableType value);

	/**
	 * Returns the value of the '<em><b>Context Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.ContextParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_ContextParam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context-param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextParamType> getContextParam();

	/**
	 * Returns the value of the '<em><b>Servlet</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.ServletType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_Servlet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servlet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServletType> getServlet();

	/**
	 * Returns the value of the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.ServletMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Mapping</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_ServletMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servlet-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServletMappingType> getServletMapping();

	/**
	 * Returns the value of the '<em><b>Session Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Config</em>' containment reference.
	 * @see #setSessionConfig(SessionConfigType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_SessionConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='session-config' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionConfigType getSessionConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getSessionConfig <em>Session Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Config</em>' containment reference.
	 * @see #getSessionConfig()
	 * @generated
	 */
	void setSessionConfig(SessionConfigType value);

	/**
	 * Returns the value of the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.MimeMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Mapping</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_MimeMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mime-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MimeMappingType> getMimeMapping();

	/**
	 * Returns the value of the '<em><b>Welcome File List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome File List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome File List</em>' containment reference.
	 * @see #setWelcomeFileList(WelcomeFileListType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_WelcomeFileList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='welcome-file-list' namespace='##targetNamespace'"
	 * @generated
	 */
	WelcomeFileListType getWelcomeFileList();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getWelcomeFileList <em>Welcome File List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome File List</em>' containment reference.
	 * @see #getWelcomeFileList()
	 * @generated
	 */
	void setWelcomeFileList(WelcomeFileListType value);

	/**
	 * Returns the value of the '<em><b>Error Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Page</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_ErrorPage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error-page' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErrorPageType> getErrorPage();

	/**
	 * Returns the value of the '<em><b>Taglib</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.TaglibType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_Taglib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='taglib' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TaglibType> getTaglib();

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.ResourceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_ResourceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceRefType> getResourceRef();

	/**
	 * Returns the value of the '<em><b>Security Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_SecurityConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityConstraintType> getSecurityConstraint();

	/**
	 * Returns the value of the '<em><b>Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Config</em>' containment reference.
	 * @see #setLoginConfig(LoginConfigType)
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_LoginConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='login-config' namespace='##targetNamespace'"
	 * @generated
	 */
	LoginConfigType getLoginConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getLoginConfig <em>Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Config</em>' containment reference.
	 * @see #getLoginConfig()
	 * @generated
	 */
	void setLoginConfig(LoginConfigType value);

	/**
	 * Returns the value of the '<em><b>Security Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.SecurityRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_SecurityRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityRoleType> getSecurityRole();

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_EnvEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnvEntryType> getEnvEntry();

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp22.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_EjbRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EjbRefType> getEjbRef();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package#getWebAppType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp22.WebAppType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // WebAppType
