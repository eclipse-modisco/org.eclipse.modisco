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

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web App Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getFilterMapping <em>Filter Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getWelcomeFileList <em>Welcome File List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getJspConfig <em>Jsp Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getMessageDestination <em>Message Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getLocaleEncodingMappingList <em>Locale Encoding Mapping List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType()
 * @model extendedMetaData="name='web-appType' kind='elementOnly'"
 * @generated
 */
public interface WebAppType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Description()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_DisplayName()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Icon()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Distributable</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.EmptyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distributable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distributable</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Distributable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='distributable' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<EmptyType> getDistributable();

	/**
	 * Returns the value of the '<em><b>Context Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ParamValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The context-param element contains the declaration
	 * 	    of a web application's servlet context
	 * 	    initialization parameters.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Param</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_ContextParam()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='context-param' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ParamValueType> getContextParam();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.FilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Filter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<FilterType> getFilter();

	/**
	 * Returns the value of the '<em><b>Filter Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Mapping</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_FilterMapping()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-mapping' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<FilterMappingType> getFilterMapping();

	/**
	 * Returns the value of the '<em><b>Listener</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ListenerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Listener()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listener' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ListenerType> getListener();

	/**
	 * Returns the value of the '<em><b>Servlet</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ServletType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Servlet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ServletType> getServlet();

	/**
	 * Returns the value of the '<em><b>Servlet Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ServletMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Mapping</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_ServletMapping()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet-mapping' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ServletMappingType> getServletMapping();

	/**
	 * Returns the value of the '<em><b>Session Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.SessionConfigType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Config</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_SessionConfig()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='session-config' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<SessionConfigType> getSessionConfig();

	/**
	 * Returns the value of the '<em><b>Mime Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.MimeMappingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Mapping</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_MimeMapping()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mime-mapping' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<MimeMappingType> getMimeMapping();

	/**
	 * Returns the value of the '<em><b>Welcome File List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.WelcomeFileListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome File List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome File List</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_WelcomeFileList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='welcome-file-list' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<WelcomeFileListType> getWelcomeFileList();

	/**
	 * Returns the value of the '<em><b>Error Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Page</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_ErrorPage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error-page' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ErrorPageType> getErrorPage();

	/**
	 * Returns the value of the '<em><b>Jsp Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.JspConfigType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jsp Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsp Config</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_JspConfig()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jsp-config' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<JspConfigType> getJspConfig();

	/**
	 * Returns the value of the '<em><b>Security Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_SecurityConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-constraint' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<SecurityConstraintType> getSecurityConstraint();

	/**
	 * Returns the value of the '<em><b>Login Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.LoginConfigType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Config</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_LoginConfig()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='login-config' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<LoginConfigType> getLoginConfig();

	/**
	 * Returns the value of the '<em><b>Security Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.SecurityRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_SecurityRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-role' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<SecurityRoleType> getSecurityRole();

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_EnvEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<EnvEntryType> getEnvEntry();

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_EjbRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<EjbRefType> getEjbRef();

	/**
	 * Returns the value of the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Local Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Local Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_EjbLocalRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<EjbLocalRefType> getEjbLocalRef();

	/**
	 * Returns the value of the '<em><b>Service Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ServiceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_ServiceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service-ref' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ServiceRefType> getServiceRef();

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_ResourceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ResourceRefType> getResourceRef();

	/**
	 * Returns the value of the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.ResourceEnvRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_ResourceEnvRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<ResourceEnvRefType> getResourceEnvRef();

	/**
	 * Returns the value of the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_MessageDestinationRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-destination-ref' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<MessageDestinationRefType> getMessageDestinationRef();

	/**
	 * Returns the value of the '<em><b>Message Destination</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_MessageDestination()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-destination' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<MessageDestinationType> getMessageDestination();

	/**
	 * Returns the value of the '<em><b>Locale Encoding Mapping List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.LocaleEncodingMappingListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale Encoding Mapping List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale Encoding Mapping List</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_LocaleEncodingMappingList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locale-encoding-mapping-list' namespace='http://java.sun.com/xml/ns/j2ee' group='#group:0'"
	 * @generated
	 */
	EList<LocaleEncodingMappingListType> getLocaleEncodingMappingList();

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(WebAppVersionType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getWebAppType_Version()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	WebAppVersionType getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.WebAppVersionType
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(WebAppVersionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(WebAppVersionType)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.WebAppType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(WebAppVersionType)
	 * @generated
	 */
	boolean isSetVersion();

} // WebAppType
