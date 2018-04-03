/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

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
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAbstractSchemaName <em>Abstract Schema Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAcknowledgeMode <em>Acknowledge Mode</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAssemblyDescriptor <em>Assembly Descriptor</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCascadeDelete <em>Cascade Delete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpField <em>Cmp Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpVersion <em>Cmp Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrField <em>Cmr Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldName <em>Cmr Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldType <em>Cmr Field Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClientJar <em>Ejb Client Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbJar <em>Ejb Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbQl <em>Ejb Ql</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelation <em>Ejb Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationName <em>Ejb Relation Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRole <em>Ejb Relationship Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getExcludeList <em>Exclude List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDriven <em>Message Driven</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDrivenDestination <em>Message Driven Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageSelector <em>Message Selector</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodIntf <em>Method Intf</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParam <em>Method Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQueryMethod <em>Query Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationshipRoleSource <em>Relationship Role Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResultTypeMapping <em>Result Type Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleLink <em>Role Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSubscriptionDurability <em>Subscription Durability</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransAttribute <em>Trans Attribute</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUnchecked <em>Unchecked</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUseCallerIdentity <em>Use Caller Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot()
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Schema Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Schema Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Schema Name</em>' containment reference.
	 * @see #setAbstractSchemaName(AbstractSchemaNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_AbstractSchemaName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-schema-name' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractSchemaNameType getAbstractSchemaName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAbstractSchemaName <em>Abstract Schema Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Schema Name</em>' containment reference.
	 * @see #getAbstractSchemaName()
	 * @generated
	 */
	void setAbstractSchemaName(AbstractSchemaNameType value);

	/**
	 * Returns the value of the '<em><b>Acknowledge Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acknowledge Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acknowledge Mode</em>' containment reference.
	 * @see #setAcknowledgeMode(AcknowledgeModeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_AcknowledgeMode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acknowledge-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	AcknowledgeModeType getAcknowledgeMode();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAcknowledgeMode <em>Acknowledge Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledge Mode</em>' containment reference.
	 * @see #getAcknowledgeMode()
	 * @generated
	 */
	void setAcknowledgeMode(AcknowledgeModeType value);

	/**
	 * Returns the value of the '<em><b>Assembly Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Descriptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Descriptor</em>' containment reference.
	 * @see #setAssemblyDescriptor(AssemblyDescriptorType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_AssemblyDescriptor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assembly-descriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	AssemblyDescriptorType getAssemblyDescriptor();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getAssemblyDescriptor <em>Assembly Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Descriptor</em>' containment reference.
	 * @see #getAssemblyDescriptor()
	 * @generated
	 */
	void setAssemblyDescriptor(AssemblyDescriptorType value);

	/**
	 * Returns the value of the '<em><b>Cascade Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade Delete</em>' containment reference.
	 * @see #setCascadeDelete(CascadeDeleteType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_CascadeDelete()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cascade-delete' namespace='##targetNamespace'"
	 * @generated
	 */
	CascadeDeleteType getCascadeDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCascadeDelete <em>Cascade Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade Delete</em>' containment reference.
	 * @see #getCascadeDelete()
	 * @generated
	 */
	void setCascadeDelete(CascadeDeleteType value);

	/**
	 * Returns the value of the '<em><b>Cmp Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmp Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmp Field</em>' containment reference.
	 * @see #setCmpField(CmpFieldType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_CmpField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmp-field' namespace='##targetNamespace'"
	 * @generated
	 */
	CmpFieldType getCmpField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpField <em>Cmp Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmp Field</em>' containment reference.
	 * @see #getCmpField()
	 * @generated
	 */
	void setCmpField(CmpFieldType value);

	/**
	 * Returns the value of the '<em><b>Cmp Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmp Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmp Version</em>' containment reference.
	 * @see #setCmpVersion(CmpVersionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_CmpVersion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmp-version' namespace='##targetNamespace'"
	 * @generated
	 */
	CmpVersionType getCmpVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmpVersion <em>Cmp Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmp Version</em>' containment reference.
	 * @see #getCmpVersion()
	 * @generated
	 */
	void setCmpVersion(CmpVersionType value);

	/**
	 * Returns the value of the '<em><b>Cmr Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmr Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmr Field</em>' containment reference.
	 * @see #setCmrField(CmrFieldType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_CmrField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmr-field' namespace='##targetNamespace'"
	 * @generated
	 */
	CmrFieldType getCmrField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrField <em>Cmr Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmr Field</em>' containment reference.
	 * @see #getCmrField()
	 * @generated
	 */
	void setCmrField(CmrFieldType value);

	/**
	 * Returns the value of the '<em><b>Cmr Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmr Field Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmr Field Name</em>' containment reference.
	 * @see #setCmrFieldName(CmrFieldNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_CmrFieldName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmr-field-name' namespace='##targetNamespace'"
	 * @generated
	 */
	CmrFieldNameType getCmrFieldName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldName <em>Cmr Field Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmr Field Name</em>' containment reference.
	 * @see #getCmrFieldName()
	 * @generated
	 */
	void setCmrFieldName(CmrFieldNameType value);

	/**
	 * Returns the value of the '<em><b>Cmr Field Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmr Field Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmr Field Type</em>' containment reference.
	 * @see #setCmrFieldType(CmrFieldTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_CmrFieldType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cmr-field-type' namespace='##targetNamespace'"
	 * @generated
	 */
	CmrFieldTypeType getCmrFieldType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getCmrFieldType <em>Cmr Field Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmr Field Type</em>' containment reference.
	 * @see #getCmrFieldType()
	 * @generated
	 */
	void setCmrFieldType(CmrFieldTypeType value);

	/**
	 * Returns the value of the '<em><b>Container Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Transaction</em>' containment reference.
	 * @see #setContainerTransaction(ContainerTransactionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ContainerTransaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='container-transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	ContainerTransactionType getContainerTransaction();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getContainerTransaction <em>Container Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Transaction</em>' containment reference.
	 * @see #getContainerTransaction()
	 * @generated
	 */
	void setContainerTransaction(ContainerTransactionType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Type</em>' containment reference.
	 * @see #setDestinationType(DestinationTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_DestinationType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='destination-type' namespace='##targetNamespace'"
	 * @generated
	 */
	DestinationTypeType getDestinationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDestinationType <em>Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Type</em>' containment reference.
	 * @see #getDestinationType()
	 * @generated
	 */
	void setDestinationType(DestinationTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_DisplayName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-class' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbClassType getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClass <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' containment reference.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(EjbClassType value);

	/**
	 * Returns the value of the '<em><b>Ejb Client Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Client Jar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Client Jar</em>' containment reference.
	 * @see #setEjbClientJar(EjbClientJarType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbClientJar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-client-jar' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbClientJarType getEjbClientJar();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbClientJar <em>Ejb Client Jar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Client Jar</em>' containment reference.
	 * @see #getEjbClientJar()
	 * @generated
	 */
	void setEjbClientJar(EjbClientJarType value);

	/**
	 * Returns the value of the '<em><b>Ejb Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Jar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Jar</em>' containment reference.
	 * @see #setEjbJar(EjbJarType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbJar()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-jar' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbJarType getEjbJar();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbJar <em>Ejb Jar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Jar</em>' containment reference.
	 * @see #getEjbJar()
	 * @generated
	 */
	void setEjbJar(EjbJarType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-link' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbLinkType getEjbLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLink <em>Ejb Link</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbLocalRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbLocalRefType getEjbLocalRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbLocalRef <em>Ejb Local Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Local Ref</em>' containment reference.
	 * @see #getEjbLocalRef()
	 * @generated
	 */
	void setEjbLocalRef(EjbLocalRefType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Ejb Ql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ql</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ql</em>' containment reference.
	 * @see #setEjbQl(EjbQlType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbQl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ql' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbQlType getEjbQl();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbQl <em>Ejb Ql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ql</em>' containment reference.
	 * @see #getEjbQl()
	 * @generated
	 */
	void setEjbQl(EjbQlType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRefType getEjbRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRef <em>Ejb Ref</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRefName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRefNameType getEjbRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefName <em>Ejb Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRefType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-ref-type' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRefTypeType getEjbRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRefType <em>Ejb Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Ref Type</em>' containment reference.
	 * @see #getEjbRefType()
	 * @generated
	 */
	void setEjbRefType(EjbRefTypeType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relation</em>' containment reference.
	 * @see #setEjbRelation(EjbRelationType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRelation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-relation' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationType getEjbRelation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelation <em>Ejb Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relation</em>' containment reference.
	 * @see #getEjbRelation()
	 * @generated
	 */
	void setEjbRelation(EjbRelationType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relation Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relation Name</em>' containment reference.
	 * @see #setEjbRelationName(EjbRelationNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRelationName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-relation-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationNameType getEjbRelationName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationName <em>Ejb Relation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relation Name</em>' containment reference.
	 * @see #getEjbRelationName()
	 * @generated
	 */
	void setEjbRelationName(EjbRelationNameType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role</em>' containment reference.
	 * @see #setEjbRelationshipRole(EjbRelationshipRoleType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRelationshipRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-relationship-role' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationshipRoleType getEjbRelationshipRole();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRole <em>Ejb Relationship Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role</em>' containment reference.
	 * @see #getEjbRelationshipRole()
	 * @generated
	 */
	void setEjbRelationshipRole(EjbRelationshipRoleType value);

	/**
	 * Returns the value of the '<em><b>Ejb Relationship Role Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Relationship Role Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Relationship Role Name</em>' containment reference.
	 * @see #setEjbRelationshipRoleName(EjbRelationshipRoleNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EjbRelationshipRoleName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-relationship-role-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbRelationshipRoleNameType getEjbRelationshipRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Relationship Role Name</em>' containment reference.
	 * @see #getEjbRelationshipRoleName()
	 * @generated
	 */
	void setEjbRelationshipRoleName(EjbRelationshipRoleNameType value);

	/**
	 * Returns the value of the '<em><b>Enterprise Beans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enterprise Beans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Beans</em>' containment reference.
	 * @see #setEnterpriseBeans(EnterpriseBeansType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EnterpriseBeans()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='enterprise-beans' namespace='##targetNamespace'"
	 * @generated
	 */
	EnterpriseBeansType getEnterpriseBeans();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnterpriseBeans <em>Enterprise Beans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enterprise Beans</em>' containment reference.
	 * @see #getEnterpriseBeans()
	 * @generated
	 */
	void setEnterpriseBeans(EnterpriseBeansType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Entity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityType getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EnvEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryType getEnvEntry();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntry <em>Env Entry</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EnvEntryName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryNameType getEnvEntryName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryName <em>Env Entry Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EnvEntryType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry-type' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryTypeType getEnvEntryType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryType <em>Env Entry Type</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_EnvEntryValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='env-entry-value' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvEntryValueType getEnvEntryValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getEnvEntryValue <em>Env Entry Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Entry Value</em>' containment reference.
	 * @see #getEnvEntryValue()
	 * @generated
	 */
	void setEnvEntryValue(EnvEntryValueType value);

	/**
	 * Returns the value of the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude List</em>' containment reference.
	 * @see #setExcludeList(ExcludeListType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ExcludeList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exclude-list' namespace='##targetNamespace'"
	 * @generated
	 */
	ExcludeListType getExcludeList();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getExcludeList <em>Exclude List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude List</em>' containment reference.
	 * @see #getExcludeList()
	 * @generated
	 */
	void setExcludeList(ExcludeListType value);

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' containment reference.
	 * @see #setFieldName(FieldNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_FieldName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='field-name' namespace='##targetNamespace'"
	 * @generated
	 */
	FieldNameType getFieldName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getFieldName <em>Field Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' containment reference.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(FieldNameType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Home()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='home' namespace='##targetNamespace'"
	 * @generated
	 */
	HomeType getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(HomeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_LargeIcon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='large-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeIconType getLargeIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLargeIcon <em>Large Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Icon</em>' containment reference.
	 * @see #getLargeIcon()
	 * @generated
	 */
	void setLargeIcon(LargeIconType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Local()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='local' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalType getLocal();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocal <em>Local</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_LocalHome()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='local-home' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalHomeType getLocalHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getLocalHome <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Home</em>' containment reference.
	 * @see #getLocalHome()
	 * @generated
	 */
	void setLocalHome(LocalHomeType value);

	/**
	 * Returns the value of the '<em><b>Message Driven</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Driven</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Driven</em>' containment reference.
	 * @see #setMessageDriven(MessageDrivenType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MessageDriven()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-driven' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageDrivenType getMessageDriven();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDriven <em>Message Driven</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Driven</em>' containment reference.
	 * @see #getMessageDriven()
	 * @generated
	 */
	void setMessageDriven(MessageDrivenType value);

	/**
	 * Returns the value of the '<em><b>Message Driven Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Driven Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Driven Destination</em>' containment reference.
	 * @see #setMessageDrivenDestination(MessageDrivenDestinationType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MessageDrivenDestination()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-driven-destination' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageDrivenDestinationType getMessageDrivenDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageDrivenDestination <em>Message Driven Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Driven Destination</em>' containment reference.
	 * @see #getMessageDrivenDestination()
	 * @generated
	 */
	void setMessageDrivenDestination(MessageDrivenDestinationType value);

	/**
	 * Returns the value of the '<em><b>Message Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Selector</em>' containment reference.
	 * @see #setMessageSelector(MessageSelectorType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MessageSelector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-selector' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSelectorType getMessageSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMessageSelector <em>Message Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Selector</em>' containment reference.
	 * @see #getMessageSelector()
	 * @generated
	 */
	void setMessageSelector(MessageSelectorType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(MethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Method()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodType getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodType value);

	/**
	 * Returns the value of the '<em><b>Method Intf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Intf</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Intf</em>' containment reference.
	 * @see #setMethodIntf(MethodIntfType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MethodIntf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method-intf' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodIntfType getMethodIntf();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodIntf <em>Method Intf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Intf</em>' containment reference.
	 * @see #getMethodIntf()
	 * @generated
	 */
	void setMethodIntf(MethodIntfType value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' containment reference.
	 * @see #setMethodName(MethodNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MethodName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method-name' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodNameType getMethodName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodName <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' containment reference.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(MethodNameType value);

	/**
	 * Returns the value of the '<em><b>Method Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Param</em>' containment reference.
	 * @see #setMethodParam(MethodParamType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MethodParam()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method-param' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodParamType getMethodParam();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParam <em>Method Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Param</em>' containment reference.
	 * @see #getMethodParam()
	 * @generated
	 */
	void setMethodParam(MethodParamType value);

	/**
	 * Returns the value of the '<em><b>Method Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Params</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Params</em>' containment reference.
	 * @see #setMethodParams(MethodParamsType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MethodParams()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method-params' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodParamsType getMethodParams();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodParams <em>Method Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Params</em>' containment reference.
	 * @see #getMethodParams()
	 * @generated
	 */
	void setMethodParams(MethodParamsType value);

	/**
	 * Returns the value of the '<em><b>Method Permission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Permission</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Permission</em>' containment reference.
	 * @see #setMethodPermission(MethodPermissionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_MethodPermission()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method-permission' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodPermissionType getMethodPermission();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMethodPermission <em>Method Permission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Permission</em>' containment reference.
	 * @see #getMethodPermission()
	 * @generated
	 */
	void setMethodPermission(MethodPermissionType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(MultiplicityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Multiplicity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiplicity' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiplicityType getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_PersistenceType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='persistence-type' namespace='##targetNamespace'"
	 * @generated
	 */
	PersistenceTypeType getPersistenceType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPersistenceType <em>Persistence Type</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_PrimKeyClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prim-key-class' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimKeyClassType getPrimKeyClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimKeyClass <em>Prim Key Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prim Key Class</em>' containment reference.
	 * @see #getPrimKeyClass()
	 * @generated
	 */
	void setPrimKeyClass(PrimKeyClassType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_PrimkeyField()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primkey-field' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimkeyFieldType getPrimkeyField();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getPrimkeyField <em>Primkey Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primkey Field</em>' containment reference.
	 * @see #getPrimkeyField()
	 * @generated
	 */
	void setPrimkeyField(PrimkeyFieldType value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(QueryType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Query()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryType getQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(QueryType value);

	/**
	 * Returns the value of the '<em><b>Query Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Method</em>' containment reference.
	 * @see #setQueryMethod(QueryMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_QueryMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query-method' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryMethodType getQueryMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getQueryMethod <em>Query Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Method</em>' containment reference.
	 * @see #getQueryMethod()
	 * @generated
	 */
	void setQueryMethod(QueryMethodType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Reentrant()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reentrant' namespace='##targetNamespace'"
	 * @generated
	 */
	ReentrantType getReentrant();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getReentrant <em>Reentrant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reentrant</em>' containment reference.
	 * @see #getReentrant()
	 * @generated
	 */
	void setReentrant(ReentrantType value);

	/**
	 * Returns the value of the '<em><b>Relationship Role Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Role Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Role Source</em>' containment reference.
	 * @see #setRelationshipRoleSource(RelationshipRoleSourceType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_RelationshipRoleSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relationship-role-source' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipRoleSourceType getRelationshipRoleSource();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationshipRoleSource <em>Relationship Role Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Role Source</em>' containment reference.
	 * @see #getRelationshipRoleSource()
	 * @generated
	 */
	void setRelationshipRoleSource(RelationshipRoleSourceType value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference.
	 * @see #setRelationships(RelationshipsType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Relationships()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relationships' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipsType getRelationships();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRelationships <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationships</em>' containment reference.
	 * @see #getRelationships()
	 * @generated
	 */
	void setRelationships(RelationshipsType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Remote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='remote' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteType getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRemote <em>Remote</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResAuth()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-auth' namespace='##targetNamespace'"
	 * @generated
	 */
	ResAuthType getResAuth();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResAuth <em>Res Auth</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResourceEnvRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefType getResourceEnvRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRef <em>Resource Env Ref</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResourceEnvRefName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefNameType getResourceEnvRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefName <em>Resource Env Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResourceEnvRefType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceEnvRefTypeType getResourceEnvRefType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceEnvRefType <em>Resource Env Ref Type</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResourceRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceRefType getResourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResourceRef <em>Resource Ref</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResRefName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-ref-name' namespace='##targetNamespace'"
	 * @generated
	 */
	ResRefNameType getResRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResRefName <em>Res Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResSharingScope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-sharing-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	ResSharingScopeType getResSharingScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResSharingScope <em>Res Sharing Scope</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='res-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ResTypeType getResType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResType <em>Res Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Type</em>' containment reference.
	 * @see #getResType()
	 * @generated
	 */
	void setResType(ResTypeType value);

	/**
	 * Returns the value of the '<em><b>Result Type Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type Mapping</em>' containment reference.
	 * @see #setResultTypeMapping(ResultTypeMappingType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_ResultTypeMapping()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='result-type-mapping' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultTypeMappingType getResultTypeMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getResultTypeMapping <em>Result Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type Mapping</em>' containment reference.
	 * @see #getResultTypeMapping()
	 * @generated
	 */
	void setResultTypeMapping(ResultTypeMappingType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_RoleLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role-link' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleLinkType getRoleLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleLink <em>Role Link</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_RoleName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='role-name' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleNameType getRoleName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRoleName <em>Role Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_RunAs()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='run-as' namespace='##targetNamespace'"
	 * @generated
	 */
	RunAsType getRunAs();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getRunAs <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run As</em>' containment reference.
	 * @see #getRunAs()
	 * @generated
	 */
	void setRunAs(RunAsType value);

	/**
	 * Returns the value of the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Identity</em>' containment reference.
	 * @see #setSecurityIdentity(SecurityIdentityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_SecurityIdentity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-identity' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityIdentityType getSecurityIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityIdentity <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Identity</em>' containment reference.
	 * @see #getSecurityIdentity()
	 * @generated
	 */
	void setSecurityIdentity(SecurityIdentityType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_SecurityRole()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-role' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityRoleType getSecurityRole();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRole <em>Security Role</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_SecurityRoleRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityRoleRefType getSecurityRoleRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSecurityRoleRef <em>Security Role Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Role Ref</em>' containment reference.
	 * @see #getSecurityRoleRef()
	 * @generated
	 */
	void setSecurityRoleRef(SecurityRoleRefType value);

	/**
	 * Returns the value of the '<em><b>Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' containment reference.
	 * @see #setSession(SessionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Session()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='session' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionType getSession();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSession <em>Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' containment reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(SessionType value);

	/**
	 * Returns the value of the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Type</em>' containment reference.
	 * @see #setSessionType(SessionTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_SessionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='session-type' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionTypeType getSessionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSessionType <em>Session Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Type</em>' containment reference.
	 * @see #getSessionType()
	 * @generated
	 */
	void setSessionType(SessionTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_SmallIcon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	SmallIconType getSmallIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSmallIcon <em>Small Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Icon</em>' containment reference.
	 * @see #getSmallIcon()
	 * @generated
	 */
	void setSmallIcon(SmallIconType value);

	/**
	 * Returns the value of the '<em><b>Subscription Durability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Durability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Durability</em>' containment reference.
	 * @see #setSubscriptionDurability(SubscriptionDurabilityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_SubscriptionDurability()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subscription-durability' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionDurabilityType getSubscriptionDurability();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getSubscriptionDurability <em>Subscription Durability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Durability</em>' containment reference.
	 * @see #getSubscriptionDurability()
	 * @generated
	 */
	void setSubscriptionDurability(SubscriptionDurabilityType value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' containment reference.
	 * @see #setTransactionType(TransactionTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_TransactionType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransactionType <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' containment reference.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionTypeType value);

	/**
	 * Returns the value of the '<em><b>Trans Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Attribute</em>' containment reference.
	 * @see #setTransAttribute(TransAttributeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_TransAttribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='trans-attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	TransAttributeType getTransAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getTransAttribute <em>Trans Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Attribute</em>' containment reference.
	 * @see #getTransAttribute()
	 * @generated
	 */
	void setTransAttribute(TransAttributeType value);

	/**
	 * Returns the value of the '<em><b>Unchecked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchecked</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchecked</em>' containment reference.
	 * @see #setUnchecked(UncheckedType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_Unchecked()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unchecked' namespace='##targetNamespace'"
	 * @generated
	 */
	UncheckedType getUnchecked();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUnchecked <em>Unchecked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unchecked</em>' containment reference.
	 * @see #getUnchecked()
	 * @generated
	 */
	void setUnchecked(UncheckedType value);

	/**
	 * Returns the value of the '<em><b>Use Caller Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Caller Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Caller Identity</em>' containment reference.
	 * @see #setUseCallerIdentity(UseCallerIdentityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getDocumentRoot_UseCallerIdentity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='use-caller-identity' namespace='##targetNamespace'"
	 * @generated
	 */
	UseCallerIdentityType getUseCallerIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot#getUseCallerIdentity <em>Use Caller Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Caller Identity</em>' containment reference.
	 * @see #getUseCallerIdentity()
	 * @generated
	 */
	void setUseCallerIdentity(UseCallerIdentityType value);

} // DocumentRoot
