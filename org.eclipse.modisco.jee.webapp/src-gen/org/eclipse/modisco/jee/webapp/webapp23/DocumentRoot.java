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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthConstraint <em>Auth Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getContextParam <em>Context Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDistributable <em>Distributable</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterMapping <em>Filter Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormErrorPage <em>Form Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginConfig <em>Form Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginPage <em>Form Login Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getJspFile <em>Jsp File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListener <em>Listener</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListenerClass <em>Listener Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoadOnStartup <em>Load On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoginConfig <em>Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeMapping <em>Mime Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleLink <em>Role Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityConstraint <em>Security Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServlet <em>Servlet</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletClass <em>Servlet Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletMapping <em>Servlet Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionConfig <em>Session Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglib <em>Taglib</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibLocation <em>Taglib Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibUri <em>Taglib Uri</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTransportGuarantee <em>Transport Guarantee</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUserDataConstraint <em>User Data Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebApp <em>Web App</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceCollection <em>Web Resource Collection</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFile <em>Welcome File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFileList <em>Welcome File List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Auth Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Constraint</em>' containment reference.
	 * @see #setAuthConstraint(AuthConstraintType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_AuthConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='auth-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthConstraintType getAuthConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthConstraint <em>Auth Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Constraint</em>' containment reference.
	 * @see #getAuthConstraint()
	 * @generated
	 */
	void setAuthConstraint(AuthConstraintType value);

	/**
	 * Returns the value of the '<em><b>Auth Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Method</em>' containment reference.
	 * @see #setAuthMethod(AuthMethodType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_AuthMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='auth-method' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthMethodType getAuthMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getAuthMethod <em>Auth Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Method</em>' containment reference.
	 * @see #getAuthMethod()
	 * @generated
	 */
	void setAuthMethod(AuthMethodType value);

	/**
	 * Returns the value of the '<em><b>Context Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Param</em>' containment reference.
	 * @see #setContextParam(ContextParamType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ContextParam()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='context-param' namespace='##targetNamespace'"
	 * @generated
	 */
	ContextParamType getContextParam();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getContextParam <em>Context Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Param</em>' containment reference.
	 * @see #getContextParam()
	 * @generated
	 */
	void setContextParam(ContextParamType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_DisplayName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Distributable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='distributable' namespace='##targetNamespace'"
	 * @generated
	 */
	DistributableType getDistributable();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getDistributable <em>Distributable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distributable</em>' containment reference.
	 * @see #getDistributable()
	 * @generated
	 */
	void setDistributable(DistributableType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EjbLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-link' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbLinkType getEjbLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLink <em>Ejb Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Link</em>' containment reference.
	 * @see #getEjbLink()
	 * @generated
	 */
	void setEjbLink(EjbLinkType value);

	/**
	 * Returns the value of the '<em><b>Ejb Local Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Local Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Local Ref</em>' containment reference.
	 * @see #setEjbLocalRef(EjbLocalRefType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EjbLocalRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbLocalRefType getEjbLocalRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbLocalRef <em>Ejb Local Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Local Ref</em>' containment reference.
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	void setEjbLocalRef(EjbLocalRefType value);

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference.
	 * @see #setEjbRef(EjbRefType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EjbRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRefType getEjbRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRef <em>Ejb Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref</em>' containment reference.
	 * @see #getEjbRef()
	 * @generated
	 */
	void setEjbRef(EjbRefType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EjbRefName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRefNameType getEjbRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EjbRefType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref-type' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRefTypeType getEjbRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref Type</em>' containment reference.
	 * @see #getEjbRefType()
	 * @generated
	 */
	void setEjbRefType(EjbRefTypeType value);

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference.
	 * @see #setEnvEntry(EnvEntryType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EnvEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryType getEnvEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntry <em>Env Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry</em>' containment reference.
	 * @see #getEnvEntry()
	 * @generated
	 */
	void setEnvEntry(EnvEntryType value);

	/**
	 * Returns the value of the '<em><b>Env Entry Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry Name</em>' containment reference.
	 * @see #setEnvEntryName(EnvEntryNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EnvEntryName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryNameType getEnvEntryName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Name</em>' containment reference.
	 * @see #getEnvEntryName()
	 * @generated
	 */
	void setEnvEntryName(EnvEntryNameType value);

	/**
	 * Returns the value of the '<em><b>Env Entry Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry Type</em>' containment reference.
	 * @see #setEnvEntryType(EnvEntryTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EnvEntryType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry-type' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryTypeType getEnvEntryType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Type</em>' containment reference.
	 * @see #getEnvEntryType()
	 * @generated
	 */
	void setEnvEntryType(EnvEntryTypeType value);

	/**
	 * Returns the value of the '<em><b>Env Entry Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry Value</em>' containment reference.
	 * @see #setEnvEntryValue(EnvEntryValueType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_EnvEntryValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry-value' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryValueType getEnvEntryValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Value</em>' containment reference.
	 * @see #getEnvEntryValue()
	 * @generated
	 */
	void setEnvEntryValue(EnvEntryValueType value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Code</em>' containment reference.
	 * @see #setErrorCode(ErrorCodeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ErrorCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error-code' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorCodeType getErrorCode();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorCode <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' containment reference.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCodeType value);

	/**
	 * Returns the value of the '<em><b>Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Page</em>' containment reference.
	 * @see #setErrorPage(ErrorPageType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ErrorPage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error-page' namespace='##targetNamespace'"
	 * @generated
	 */
	ErrorPageType getErrorPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getErrorPage <em>Error Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Page</em>' containment reference.
	 * @see #getErrorPage()
	 * @generated
	 */
	void setErrorPage(ErrorPageType value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type</em>' containment reference.
	 * @see #setExceptionType(ExceptionTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ExceptionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exception-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionTypeType getExceptionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExceptionType <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' containment reference.
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(ExceptionTypeType value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(ExtensionType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Extension()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionType getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(ExtensionType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Class</em>' containment reference.
	 * @see #setFilterClass(FilterClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_FilterClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-class' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterClassType getFilterClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterClass <em>Filter Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Class</em>' containment reference.
	 * @see #getFilterClass()
	 * @generated
	 */
	void setFilterClass(FilterClassType value);

	/**
	 * Returns the value of the '<em><b>Filter Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Mapping</em>' containment reference.
	 * @see #setFilterMapping(FilterMappingType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_FilterMapping()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterMappingType getFilterMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterMapping <em>Filter Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Mapping</em>' containment reference.
	 * @see #getFilterMapping()
	 * @generated
	 */
	void setFilterMapping(FilterMappingType value);

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' containment reference.
	 * @see #setFilterName(FilterNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_FilterName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterNameType getFilterName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFilterName <em>Filter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' containment reference.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(FilterNameType value);

	/**
	 * Returns the value of the '<em><b>Form Error Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Error Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Error Page</em>' containment reference.
	 * @see #setFormErrorPage(FormErrorPageType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_FormErrorPage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form-error-page' namespace='##targetNamespace'"
	 * @generated
	 */
	FormErrorPageType getFormErrorPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormErrorPage <em>Form Error Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Error Page</em>' containment reference.
	 * @see #getFormErrorPage()
	 * @generated
	 */
	void setFormErrorPage(FormErrorPageType value);

	/**
	 * Returns the value of the '<em><b>Form Login Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Login Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Login Config</em>' containment reference.
	 * @see #setFormLoginConfig(FormLoginConfigType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_FormLoginConfig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form-login-config' namespace='##targetNamespace'"
	 * @generated
	 */
	FormLoginConfigType getFormLoginConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginConfig <em>Form Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Login Config</em>' containment reference.
	 * @see #getFormLoginConfig()
	 * @generated
	 */
	void setFormLoginConfig(FormLoginConfigType value);

	/**
	 * Returns the value of the '<em><b>Form Login Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Login Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Login Page</em>' containment reference.
	 * @see #setFormLoginPage(FormLoginPageType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_FormLoginPage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form-login-page' namespace='##targetNamespace'"
	 * @generated
	 */
	FormLoginPageType getFormLoginPage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getFormLoginPage <em>Form Login Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Login Page</em>' containment reference.
	 * @see #getFormLoginPage()
	 * @generated
	 */
	void setFormLoginPage(FormLoginPageType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Home()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='home' namespace='##targetNamespace'"
	 * @generated
	 */
	HomeType getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(HomeType value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' containment reference.
	 * @see #setHttpMethod(HttpMethodType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_HttpMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='http-method' namespace='##targetNamespace'"
	 * @generated
	 */
	HttpMethodType getHttpMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getHttpMethod <em>Http Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' containment reference.
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethodType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Icon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='##targetNamespace'"
	 * @generated
	 */
	IconType getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(IconType value);

	/**
	 * Returns the value of the '<em><b>Init Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Param</em>' containment reference.
	 * @see #setInitParam(InitParamType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_InitParam()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='init-param' namespace='##targetNamespace'"
	 * @generated
	 */
	InitParamType getInitParam();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getInitParam <em>Init Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Param</em>' containment reference.
	 * @see #getInitParam()
	 * @generated
	 */
	void setInitParam(InitParamType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_JspFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jsp-file' namespace='##targetNamespace'"
	 * @generated
	 */
	JspFileType getJspFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getJspFile <em>Jsp File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsp File</em>' containment reference.
	 * @see #getJspFile()
	 * @generated
	 */
	void setJspFile(JspFileType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_LargeIcon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='large-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeIconType getLargeIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLargeIcon <em>Large Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Icon</em>' containment reference.
	 * @see #getLargeIcon()
	 * @generated
	 */
	void setLargeIcon(LargeIconType value);

	/**
	 * Returns the value of the '<em><b>Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener</em>' containment reference.
	 * @see #setListener(ListenerType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Listener()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listener' namespace='##targetNamespace'"
	 * @generated
	 */
	ListenerType getListener();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListener <em>Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listener</em>' containment reference.
	 * @see #getListener()
	 * @generated
	 */
	void setListener(ListenerType value);

	/**
	 * Returns the value of the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener Class</em>' containment reference.
	 * @see #setListenerClass(ListenerClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ListenerClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='listener-class' namespace='##targetNamespace'"
	 * @generated
	 */
	ListenerClassType getListenerClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getListenerClass <em>Listener Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listener Class</em>' containment reference.
	 * @see #getListenerClass()
	 * @generated
	 */
	void setListenerClass(ListenerClassType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_LoadOnStartup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='load-on-startup' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadOnStartupType getLoadOnStartup();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoadOnStartup <em>Load On Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load On Startup</em>' containment reference.
	 * @see #getLoadOnStartup()
	 * @generated
	 */
	void setLoadOnStartup(LoadOnStartupType value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference.
	 * @see #setLocal(LocalType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Local()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='local' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalType getLocal();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocal <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' containment reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(LocalType value);

	/**
	 * Returns the value of the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Home</em>' containment reference.
	 * @see #setLocalHome(LocalHomeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_LocalHome()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='local-home' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalHomeType getLocalHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocalHome <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Home</em>' containment reference.
	 * @see #getLocalHome()
	 * @generated
	 */
	void setLocalHome(LocalHomeType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_LoginConfig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='login-config' namespace='##targetNamespace'"
	 * @generated
	 */
	LoginConfigType getLoginConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getLoginConfig <em>Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Config</em>' containment reference.
	 * @see #getLoginConfig()
	 * @generated
	 */
	void setLoginConfig(LoginConfigType value);

	/**
	 * Returns the value of the '<em><b>Mime Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Mapping</em>' containment reference.
	 * @see #setMimeMapping(MimeMappingType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_MimeMapping()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mime-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	MimeMappingType getMimeMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeMapping <em>Mime Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Mapping</em>' containment reference.
	 * @see #getMimeMapping()
	 * @generated
	 */
	void setMimeMapping(MimeMappingType value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' containment reference.
	 * @see #setMimeType(MimeTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_MimeType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mime-type' namespace='##targetNamespace'"
	 * @generated
	 */
	MimeTypeType getMimeType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getMimeType <em>Mime Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' containment reference.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeTypeType value);

	/**
	 * Returns the value of the '<em><b>Param Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name</em>' containment reference.
	 * @see #setParamName(ParamNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ParamName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamNameType getParamName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamName <em>Param Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name</em>' containment reference.
	 * @see #getParamName()
	 * @generated
	 */
	void setParamName(ParamNameType value);

	/**
	 * Returns the value of the '<em><b>Param Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Value</em>' containment reference.
	 * @see #setParamValue(ParamValueType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ParamValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param-value' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamValueType getParamValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getParamValue <em>Param Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Value</em>' containment reference.
	 * @see #getParamValue()
	 * @generated
	 */
	void setParamValue(ParamValueType value);

	/**
	 * Returns the value of the '<em><b>Realm Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realm Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm Name</em>' containment reference.
	 * @see #setRealmName(RealmNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_RealmName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='realm-name' namespace='##targetNamespace'"
	 * @generated
	 */
	RealmNameType getRealmName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRealmName <em>Realm Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realm Name</em>' containment reference.
	 * @see #getRealmName()
	 * @generated
	 */
	void setRealmName(RealmNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Remote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remote' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteType getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRemote <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' containment reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(RemoteType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResAuth()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-auth' namespace='##targetNamespace'"
	 * @generated
	 */
	ResAuthType getResAuth();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResAuth <em>Res Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Auth</em>' containment reference.
	 * @see #getResAuth()
	 * @generated
	 */
	void setResAuth(ResAuthType value);

	/**
	 * Returns the value of the '<em><b>Resource Env Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref</em>' containment reference.
	 * @see #setResourceEnvRef(ResourceEnvRefType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResourceEnvRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefType getResourceEnvRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRef <em>Resource Env Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Env Ref</em>' containment reference.
	 * @see #getResourceEnvRef()
	 * @generated
	 */
	void setResourceEnvRef(ResourceEnvRefType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResourceEnvRefName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefNameType getResourceEnvRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefName <em>Resource Env Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResourceEnvRefType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefTypeType getResourceEnvRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceEnvRefType <em>Resource Env Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Env Ref Type</em>' containment reference.
	 * @see #getResourceEnvRefType()
	 * @generated
	 */
	void setResourceEnvRefType(ResourceEnvRefTypeType value);

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference.
	 * @see #setResourceRef(ResourceRefType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResourceRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceRefType getResourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResourceRef <em>Resource Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Ref</em>' containment reference.
	 * @see #getResourceRef()
	 * @generated
	 */
	void setResourceRef(ResourceRefType value);

	/**
	 * Returns the value of the '<em><b>Res Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Ref Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Ref Name</em>' containment reference.
	 * @see #setResRefName(ResRefNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResRefName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ResRefNameType getResRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResRefName <em>Res Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Ref Name</em>' containment reference.
	 * @see #getResRefName()
	 * @generated
	 */
	void setResRefName(ResRefNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResSharingScope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-sharing-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	ResSharingScopeType getResSharingScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResSharingScope <em>Res Sharing Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Sharing Scope</em>' containment reference.
	 * @see #getResSharingScope()
	 * @generated
	 */
	void setResSharingScope(ResSharingScopeType value);

	/**
	 * Returns the value of the '<em><b>Res Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Type</em>' containment reference.
	 * @see #setResType(ResTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ResType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResTypeType getResType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getResType <em>Res Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Type</em>' containment reference.
	 * @see #getResType()
	 * @generated
	 */
	void setResType(ResTypeType value);

	/**
	 * Returns the value of the '<em><b>Role Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Link</em>' containment reference.
	 * @see #setRoleLink(RoleLinkType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_RoleLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role-link' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleLinkType getRoleLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleLink <em>Role Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Link</em>' containment reference.
	 * @see #getRoleLink()
	 * @generated
	 */
	void setRoleLink(RoleLinkType value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' containment reference.
	 * @see #setRoleName(RoleNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_RoleName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role-name' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleNameType getRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRoleName <em>Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' containment reference.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(RoleNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_RunAs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='run-as' namespace='##targetNamespace'"
	 * @generated
	 */
	RunAsType getRunAs();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getRunAs <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As</em>' containment reference.
	 * @see #getRunAs()
	 * @generated
	 */
	void setRunAs(RunAsType value);

	/**
	 * Returns the value of the '<em><b>Security Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint</em>' containment reference.
	 * @see #setSecurityConstraint(SecurityConstraintType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_SecurityConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityConstraintType getSecurityConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityConstraint <em>Security Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Constraint</em>' containment reference.
	 * @see #getSecurityConstraint()
	 * @generated
	 */
	void setSecurityConstraint(SecurityConstraintType value);

	/**
	 * Returns the value of the '<em><b>Security Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role</em>' containment reference.
	 * @see #setSecurityRole(SecurityRoleType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_SecurityRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-role' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityRoleType getSecurityRole();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRole <em>Security Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Role</em>' containment reference.
	 * @see #getSecurityRole()
	 * @generated
	 */
	void setSecurityRole(SecurityRoleType value);

	/**
	 * Returns the value of the '<em><b>Security Role Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Ref</em>' containment reference.
	 * @see #setSecurityRoleRef(SecurityRoleRefType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_SecurityRoleRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityRoleRefType getSecurityRoleRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Role Ref</em>' containment reference.
	 * @see #getSecurityRoleRef()
	 * @generated
	 */
	void setSecurityRoleRef(SecurityRoleRefType value);

	/**
	 * Returns the value of the '<em><b>Servlet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet</em>' containment reference.
	 * @see #setServlet(ServletType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Servlet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletType getServlet();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServlet <em>Servlet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet</em>' containment reference.
	 * @see #getServlet()
	 * @generated
	 */
	void setServlet(ServletType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ServletClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet-class' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletClassType getServletClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletClass <em>Servlet Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Class</em>' containment reference.
	 * @see #getServletClass()
	 * @generated
	 */
	void setServletClass(ServletClassType value);

	/**
	 * Returns the value of the '<em><b>Servlet Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servlet Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servlet Mapping</em>' containment reference.
	 * @see #setServletMapping(ServletMappingType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ServletMapping()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletMappingType getServletMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletMapping <em>Servlet Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Mapping</em>' containment reference.
	 * @see #getServletMapping()
	 * @generated
	 */
	void setServletMapping(ServletMappingType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_ServletName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='servlet-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ServletNameType getServletName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getServletName <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servlet Name</em>' containment reference.
	 * @see #getServletName()
	 * @generated
	 */
	void setServletName(ServletNameType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_SessionConfig()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='session-config' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionConfigType getSessionConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionConfig <em>Session Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Config</em>' containment reference.
	 * @see #getSessionConfig()
	 * @generated
	 */
	void setSessionConfig(SessionConfigType value);

	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Timeout</em>' containment reference.
	 * @see #setSessionTimeout(SessionTimeoutType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_SessionTimeout()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='session-timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionTimeoutType getSessionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSessionTimeout <em>Session Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' containment reference.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(SessionTimeoutType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_SmallIcon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	SmallIconType getSmallIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getSmallIcon <em>Small Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Icon</em>' containment reference.
	 * @see #getSmallIcon()
	 * @generated
	 */
	void setSmallIcon(SmallIconType value);

	/**
	 * Returns the value of the '<em><b>Taglib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib</em>' containment reference.
	 * @see #setTaglib(TaglibType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_Taglib()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='taglib' namespace='##targetNamespace'"
	 * @generated
	 */
	TaglibType getTaglib();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglib <em>Taglib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib</em>' containment reference.
	 * @see #getTaglib()
	 * @generated
	 */
	void setTaglib(TaglibType value);

	/**
	 * Returns the value of the '<em><b>Taglib Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib Location</em>' containment reference.
	 * @see #setTaglibLocation(TaglibLocationType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_TaglibLocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='taglib-location' namespace='##targetNamespace'"
	 * @generated
	 */
	TaglibLocationType getTaglibLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibLocation <em>Taglib Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib Location</em>' containment reference.
	 * @see #getTaglibLocation()
	 * @generated
	 */
	void setTaglibLocation(TaglibLocationType value);

	/**
	 * Returns the value of the '<em><b>Taglib Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taglib Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taglib Uri</em>' containment reference.
	 * @see #setTaglibUri(TaglibUriType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_TaglibUri()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='taglib-uri' namespace='##targetNamespace'"
	 * @generated
	 */
	TaglibUriType getTaglibUri();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTaglibUri <em>Taglib Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taglib Uri</em>' containment reference.
	 * @see #getTaglibUri()
	 * @generated
	 */
	void setTaglibUri(TaglibUriType value);

	/**
	 * Returns the value of the '<em><b>Transport Guarantee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Guarantee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Guarantee</em>' containment reference.
	 * @see #setTransportGuarantee(TransportGuaranteeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_TransportGuarantee()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transport-guarantee' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportGuaranteeType getTransportGuarantee();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getTransportGuarantee <em>Transport Guarantee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Guarantee</em>' containment reference.
	 * @see #getTransportGuarantee()
	 * @generated
	 */
	void setTransportGuarantee(TransportGuaranteeType value);

	/**
	 * Returns the value of the '<em><b>Url Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Pattern</em>' containment reference.
	 * @see #setUrlPattern(UrlPatternType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_UrlPattern()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='url-pattern' namespace='##targetNamespace'"
	 * @generated
	 */
	UrlPatternType getUrlPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUrlPattern <em>Url Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Pattern</em>' containment reference.
	 * @see #getUrlPattern()
	 * @generated
	 */
	void setUrlPattern(UrlPatternType value);

	/**
	 * Returns the value of the '<em><b>User Data Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Data Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data Constraint</em>' containment reference.
	 * @see #setUserDataConstraint(UserDataConstraintType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_UserDataConstraint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-data-constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	UserDataConstraintType getUserDataConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getUserDataConstraint <em>User Data Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Constraint</em>' containment reference.
	 * @see #getUserDataConstraint()
	 * @generated
	 */
	void setUserDataConstraint(UserDataConstraintType value);

	/**
	 * Returns the value of the '<em><b>Web App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web App</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web App</em>' containment reference.
	 * @see #setWebApp(WebAppType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_WebApp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='web-app' namespace='##targetNamespace'"
	 * @generated
	 */
	WebAppType getWebApp();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebApp <em>Web App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web App</em>' containment reference.
	 * @see #getWebApp()
	 * @generated
	 */
	void setWebApp(WebAppType value);

	/**
	 * Returns the value of the '<em><b>Web Resource Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Resource Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Resource Collection</em>' containment reference.
	 * @see #setWebResourceCollection(WebResourceCollectionType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_WebResourceCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='web-resource-collection' namespace='##targetNamespace'"
	 * @generated
	 */
	WebResourceCollectionType getWebResourceCollection();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceCollection <em>Web Resource Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Resource Collection</em>' containment reference.
	 * @see #getWebResourceCollection()
	 * @generated
	 */
	void setWebResourceCollection(WebResourceCollectionType value);

	/**
	 * Returns the value of the '<em><b>Web Resource Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Resource Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Resource Name</em>' containment reference.
	 * @see #setWebResourceName(WebResourceNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_WebResourceName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='web-resource-name' namespace='##targetNamespace'"
	 * @generated
	 */
	WebResourceNameType getWebResourceName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWebResourceName <em>Web Resource Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Resource Name</em>' containment reference.
	 * @see #getWebResourceName()
	 * @generated
	 */
	void setWebResourceName(WebResourceNameType value);

	/**
	 * Returns the value of the '<em><b>Welcome File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome File</em>' containment reference.
	 * @see #setWelcomeFile(WelcomeFileType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_WelcomeFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='welcome-file' namespace='##targetNamespace'"
	 * @generated
	 */
	WelcomeFileType getWelcomeFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFile <em>Welcome File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome File</em>' containment reference.
	 * @see #getWelcomeFile()
	 * @generated
	 */
	void setWelcomeFile(WelcomeFileType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getDocumentRoot_WelcomeFileList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='welcome-file-list' namespace='##targetNamespace'"
	 * @generated
	 */
	WelcomeFileListType getWelcomeFileList();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot#getWelcomeFileList <em>Welcome File List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome File List</em>' containment reference.
	 * @see #getWelcomeFileList()
	 * @generated
	 */
	void setWelcomeFileList(WelcomeFileListType value);

} // DocumentRoot
