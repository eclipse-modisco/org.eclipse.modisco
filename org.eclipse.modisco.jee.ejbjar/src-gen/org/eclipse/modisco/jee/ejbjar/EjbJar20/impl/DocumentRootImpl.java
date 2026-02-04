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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.AbstractSchemaNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CmpVersionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClientJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbQlType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.FieldNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimKeyClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.PrimkeyFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ReentrantType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.UncheckedType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.UseCallerIdentityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getAbstractSchemaName <em>Abstract Schema Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getAcknowledgeMode <em>Acknowledge Mode</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getAssemblyDescriptor <em>Assembly Descriptor</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getCascadeDelete <em>Cascade Delete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getCmpField <em>Cmp Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getCmpVersion <em>Cmp Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getCmrField <em>Cmr Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getCmrFieldName <em>Cmr Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getCmrFieldType <em>Cmr Field Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbClientJar <em>Ejb Client Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbJar <em>Ejb Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbQl <em>Ejb Ql</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRelation <em>Ejb Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRelationName <em>Ejb Relation Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRelationshipRole <em>Ejb Relationship Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getExcludeList <em>Exclude List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMessageDriven <em>Message Driven</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMessageDrivenDestination <em>Message Driven Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMessageSelector <em>Message Selector</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMethodIntf <em>Method Intf</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMethodParam <em>Method Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getQueryMethod <em>Query Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getRelationshipRoleSource <em>Relationship Role Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResourceEnvRefName <em>Resource Env Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResourceEnvRefType <em>Resource Env Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getResultTypeMapping <em>Result Type Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getRoleLink <em>Role Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getSubscriptionDurability <em>Subscription Durability</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getTransAttribute <em>Trans Attribute</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getUnchecked <em>Unchecked</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.DocumentRootImpl#getUseCallerIdentity <em>Use Caller Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EjbJar20Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EjbJar20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EjbJar20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSchemaNameType getAbstractSchemaName() {
		return (AbstractSchemaNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSchemaName(AbstractSchemaNameType newAbstractSchemaName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME, newAbstractSchemaName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractSchemaName(AbstractSchemaNameType newAbstractSchemaName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME, newAbstractSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcknowledgeModeType getAcknowledgeMode() {
		return (AcknowledgeModeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ACKNOWLEDGE_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcknowledgeMode(AcknowledgeModeType newAcknowledgeMode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ACKNOWLEDGE_MODE, newAcknowledgeMode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcknowledgeMode(AcknowledgeModeType newAcknowledgeMode) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ACKNOWLEDGE_MODE, newAcknowledgeMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDescriptorType getAssemblyDescriptor() {
		return (AssemblyDescriptorType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyDescriptor(AssemblyDescriptorType newAssemblyDescriptor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR, newAssemblyDescriptor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyDescriptor(AssemblyDescriptorType newAssemblyDescriptor) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR, newAssemblyDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadeDeleteType getCascadeDelete() {
		return (CascadeDeleteType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CASCADE_DELETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCascadeDelete(CascadeDeleteType newCascadeDelete, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CASCADE_DELETE, newCascadeDelete, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascadeDelete(CascadeDeleteType newCascadeDelete) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CASCADE_DELETE, newCascadeDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpFieldType getCmpField() {
		return (CmpFieldType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CMP_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmpField(CmpFieldType newCmpField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CMP_FIELD, newCmpField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmpField(CmpFieldType newCmpField) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CMP_FIELD, newCmpField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpVersionType getCmpVersion() {
		return (CmpVersionType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CMP_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmpVersion(CmpVersionType newCmpVersion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CMP_VERSION, newCmpVersion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmpVersion(CmpVersionType newCmpVersion) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CMP_VERSION, newCmpVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldType getCmrField() {
		return (CmrFieldType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmrField(CmrFieldType newCmrField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD, newCmrField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmrField(CmrFieldType newCmrField) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD, newCmrField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldNameType getCmrFieldName() {
		return (CmrFieldNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmrFieldName(CmrFieldNameType newCmrFieldName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD_NAME, newCmrFieldName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmrFieldName(CmrFieldNameType newCmrFieldName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD_NAME, newCmrFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeType getCmrFieldType() {
		return (CmrFieldTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmrFieldType(CmrFieldTypeType newCmrFieldType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD_TYPE, newCmrFieldType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmrFieldType(CmrFieldTypeType newCmrFieldType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CMR_FIELD_TYPE, newCmrFieldType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTransactionType getContainerTransaction() {
		return (ContainerTransactionType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__CONTAINER_TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerTransaction(ContainerTransactionType newContainerTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__CONTAINER_TRANSACTION, newContainerTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerTransaction(ContainerTransactionType newContainerTransaction) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__CONTAINER_TRANSACTION, newContainerTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationTypeType getDestinationType() {
		return (DestinationTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__DESTINATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationType(DestinationTypeType newDestinationType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__DESTINATION_TYPE, newDestinationType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationType(DestinationTypeType newDestinationType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__DESTINATION_TYPE, newDestinationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType getDisplayName() {
		return (DisplayNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(DisplayNameType newDisplayName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, newDisplayName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(DisplayNameType newDisplayName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType getEjbClass() {
		return (EjbClassType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClass(EjbClassType newEjbClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_CLASS, newEjbClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(EjbClassType newEjbClass) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_CLASS, newEjbClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClientJarType getEjbClientJar() {
		return (EjbClientJarType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_CLIENT_JAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClientJar(EjbClientJarType newEjbClientJar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_CLIENT_JAR, newEjbClientJar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClientJar(EjbClientJarType newEjbClientJar) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_CLIENT_JAR, newEjbClientJar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJarType getEjbJar() {
		return (EjbJarType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_JAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbJar(EjbJarType newEjbJar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_JAR, newEjbJar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbJar(EjbJarType newEjbJar) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_JAR, newEjbJar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLinkType getEjbLink() {
		return (EjbLinkType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbLink(EjbLinkType newEjbLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_LINK, newEjbLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbLink(EjbLinkType newEjbLink) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_LINK, newEjbLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLocalRefType getEjbLocalRef() {
		return (EjbLocalRefType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_LOCAL_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbLocalRef(EjbLocalRefType newEjbLocalRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_LOCAL_REF, newEjbLocalRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbLocalRef(EjbLocalRefType newEjbLocalRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_LOCAL_REF, newEjbLocalRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbNameType getEjbName() {
		return (EjbNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbName(EjbNameType newEjbName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_NAME, newEjbName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(EjbNameType newEjbName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_NAME, newEjbName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbQlType getEjbQl() {
		return (EjbQlType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_QL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbQl(EjbQlType newEjbQl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_QL, newEjbQl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbQl(EjbQlType newEjbQl) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_QL, newEjbQl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType getEjbRef() {
		return (EjbRefType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRef(EjbRefType newEjbRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF, newEjbRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRef(EjbRefType newEjbRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF, newEjbRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefNameType getEjbRefName() {
		return (EjbRefNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefName(EjbRefNameType newEjbRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, newEjbRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefName(EjbRefNameType newEjbRefName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, newEjbRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeType getEjbRefType() {
		return (EjbRefTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefType(EjbRefTypeType newEjbRefType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, newEjbRefType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefType(EjbRefTypeType newEjbRefType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, newEjbRefType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationType getEjbRelation() {
		return (EjbRelationType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelation(EjbRelationType newEjbRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATION, newEjbRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelation(EjbRelationType newEjbRelation) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATION, newEjbRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationNameType getEjbRelationName() {
		return (EjbRelationNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationName(EjbRelationNameType newEjbRelationName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATION_NAME, newEjbRelationName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationName(EjbRelationNameType newEjbRelationName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATION_NAME, newEjbRelationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleType getEjbRelationshipRole() {
		return (EjbRelationshipRoleType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationshipRole(EjbRelationshipRoleType newEjbRelationshipRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE, newEjbRelationshipRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationshipRole(EjbRelationshipRoleType newEjbRelationshipRole) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE, newEjbRelationshipRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleNameType getEjbRelationshipRoleName() {
		return (EjbRelationshipRoleNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationshipRoleName(EjbRelationshipRoleNameType newEjbRelationshipRoleName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME, newEjbRelationshipRoleName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationshipRoleName(EjbRelationshipRoleNameType newEjbRelationshipRoleName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME, newEjbRelationshipRoleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseBeansType getEnterpriseBeans() {
		return (EnterpriseBeansType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ENTERPRISE_BEANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterpriseBeans(EnterpriseBeansType newEnterpriseBeans, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ENTERPRISE_BEANS, newEnterpriseBeans, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseBeans(EnterpriseBeansType newEnterpriseBeans) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ENTERPRISE_BEANS, newEnterpriseBeans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntity() {
		return (EntityType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(EntityType newEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ENTITY, newEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityType newEntity) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType getEnvEntry() {
		return (EnvEntryType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntry(EnvEntryType newEnvEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, newEnvEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntry(EnvEntryType newEnvEntry) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, newEnvEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryNameType getEnvEntryName() {
		return (EnvEntryNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryName(EnvEntryNameType newEnvEntryName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, newEnvEntryName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryName(EnvEntryNameType newEnvEntryName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, newEnvEntryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeType getEnvEntryType() {
		return (EnvEntryTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryType(EnvEntryTypeType newEnvEntryType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, newEnvEntryType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryType(EnvEntryTypeType newEnvEntryType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, newEnvEntryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryValueType getEnvEntryValue() {
		return (EnvEntryValueType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryValue(EnvEntryValueType newEnvEntryValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, newEnvEntryValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryValue(EnvEntryValueType newEnvEntryValue) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, newEnvEntryValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeListType getExcludeList() {
		return (ExcludeListType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__EXCLUDE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeList(ExcludeListType newExcludeList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__EXCLUDE_LIST, newExcludeList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeList(ExcludeListType newExcludeList) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__EXCLUDE_LIST, newExcludeList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldNameType getFieldName() {
		return (FieldNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__FIELD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldName(FieldNameType newFieldName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__FIELD_NAME, newFieldName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(FieldNameType newFieldName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__FIELD_NAME, newFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType getHome() {
		return (HomeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__HOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(HomeType newHome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__HOME, newHome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(HomeType newHome) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__HOME, newHome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeIconType getLargeIcon() {
		return (LargeIconType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__LARGE_ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeIcon(LargeIconType newLargeIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__LARGE_ICON, newLargeIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeIcon(LargeIconType newLargeIcon) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__LARGE_ICON, newLargeIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType getLocal() {
		return (LocalType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__LOCAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal(LocalType newLocal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__LOCAL, newLocal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(LocalType newLocal) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__LOCAL, newLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType getLocalHome() {
		return (LocalHomeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__LOCAL_HOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalHome(LocalHomeType newLocalHome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__LOCAL_HOME, newLocalHome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHome(LocalHomeType newLocalHome) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__LOCAL_HOME, newLocalHome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenType getMessageDriven() {
		return (MessageDrivenType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_DRIVEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDriven(MessageDrivenType newMessageDriven, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_DRIVEN, newMessageDriven, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDriven(MessageDrivenType newMessageDriven) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_DRIVEN, newMessageDriven);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenDestinationType getMessageDrivenDestination() {
		return (MessageDrivenDestinationType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDrivenDestination(MessageDrivenDestinationType newMessageDrivenDestination, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION, newMessageDrivenDestination, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDrivenDestination(MessageDrivenDestinationType newMessageDrivenDestination) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION, newMessageDrivenDestination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSelectorType getMessageSelector() {
		return (MessageSelectorType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageSelector(MessageSelectorType newMessageSelector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_SELECTOR, newMessageSelector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSelector(MessageSelectorType newMessageSelector) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__MESSAGE_SELECTOR, newMessageSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType getMethod() {
		return (MethodType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodType newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD, newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(MethodType newMethod) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfType getMethodIntf() {
		return (MethodIntfType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_INTF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodIntf(MethodIntfType newMethodIntf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_INTF, newMethodIntf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodIntf(MethodIntfType newMethodIntf) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_INTF, newMethodIntf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNameType getMethodName() {
		return (MethodNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(MethodNameType newMethodName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_NAME, newMethodName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(MethodNameType newMethodName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_NAME, newMethodName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamType getMethodParam() {
		return (MethodParamType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodParam(MethodParamType newMethodParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PARAM, newMethodParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodParam(MethodParamType newMethodParam) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PARAM, newMethodParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamsType getMethodParams() {
		return (MethodParamsType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodParams(MethodParamsType newMethodParams, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PARAMS, newMethodParams, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodParams(MethodParamsType newMethodParams) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PARAMS, newMethodParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPermissionType getMethodPermission() {
		return (MethodPermissionType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PERMISSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodPermission(MethodPermissionType newMethodPermission, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PERMISSION, newMethodPermission, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodPermission(MethodPermissionType newMethodPermission) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__METHOD_PERMISSION, newMethodPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType getMultiplicity() {
		return (MultiplicityType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__MULTIPLICITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(MultiplicityType newMultiplicity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__MULTIPLICITY, newMultiplicity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityType newMultiplicity) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__MULTIPLICITY, newMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType getPersistenceType() {
		return (PersistenceTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__PERSISTENCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceType(PersistenceTypeType newPersistenceType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__PERSISTENCE_TYPE, newPersistenceType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(PersistenceTypeType newPersistenceType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__PERSISTENCE_TYPE, newPersistenceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimKeyClassType getPrimKeyClass() {
		return (PrimKeyClassType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__PRIM_KEY_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimKeyClass(PrimKeyClassType newPrimKeyClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__PRIM_KEY_CLASS, newPrimKeyClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimKeyClass(PrimKeyClassType newPrimKeyClass) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__PRIM_KEY_CLASS, newPrimKeyClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimkeyFieldType getPrimkeyField() {
		return (PrimkeyFieldType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__PRIMKEY_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimkeyField(PrimkeyFieldType newPrimkeyField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__PRIMKEY_FIELD, newPrimkeyField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimkeyField(PrimkeyFieldType newPrimkeyField) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__PRIMKEY_FIELD, newPrimkeyField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType getQuery() {
		return (QueryType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__QUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(QueryType newQuery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__QUERY, newQuery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(QueryType newQuery) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__QUERY, newQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryMethodType getQueryMethod() {
		return (QueryMethodType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__QUERY_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryMethod(QueryMethodType newQueryMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__QUERY_METHOD, newQueryMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryMethod(QueryMethodType newQueryMethod) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__QUERY_METHOD, newQueryMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReentrantType getReentrant() {
		return (ReentrantType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__REENTRANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReentrant(ReentrantType newReentrant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__REENTRANT, newReentrant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(ReentrantType newReentrant) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__REENTRANT, newReentrant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipRoleSourceType getRelationshipRoleSource() {
		return (RelationshipRoleSourceType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshipRoleSource(RelationshipRoleSourceType newRelationshipRoleSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE, newRelationshipRoleSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipRoleSource(RelationshipRoleSourceType newRelationshipRoleSource) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE, newRelationshipRoleSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsType getRelationships() {
		return (RelationshipsType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RELATIONSHIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationships(RelationshipsType newRelationships, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RELATIONSHIPS, newRelationships, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationships(RelationshipsType newRelationships) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RELATIONSHIPS, newRelationships);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType getRemote() {
		return (RemoteType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__REMOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemote(RemoteType newRemote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__REMOTE, newRemote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(RemoteType newRemote) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__REMOTE, newRemote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType getResAuth() {
		return (ResAuthType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_AUTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResAuth(ResAuthType newResAuth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_AUTH, newResAuth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAuth(ResAuthType newResAuth) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_AUTH, newResAuth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefType getResourceEnvRef() {
		return (ResourceEnvRefType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRef(ResourceEnvRefType newResourceEnvRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF, newResourceEnvRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRef(ResourceEnvRefType newResourceEnvRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF, newResourceEnvRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefNameType getResourceEnvRefName() {
		return (ResourceEnvRefNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefName(ResourceEnvRefNameType newResourceEnvRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME, newResourceEnvRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefName(ResourceEnvRefNameType newResourceEnvRefName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME, newResourceEnvRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvRefTypeType getResourceEnvRefType() {
		return (ResourceEnvRefTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceEnvRefType(ResourceEnvRefTypeType newResourceEnvRefType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE, newResourceEnvRefType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvRefType(ResourceEnvRefTypeType newResourceEnvRefType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE, newResourceEnvRefType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRefType getResourceRef() {
		return (ResourceRefType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRef(ResourceRefType newResourceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, newResourceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(ResourceRefType newResourceRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, newResourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResRefNameType getResRefName() {
		return (ResRefNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResRefName(ResRefNameType newResRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, newResRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResRefName(ResRefNameType newResRefName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, newResRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeType getResSharingScope() {
		return (ResSharingScopeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_SHARING_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResSharingScope(ResSharingScopeType newResSharingScope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_SHARING_SCOPE, newResSharingScope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResSharingScope(ResSharingScopeType newResSharingScope) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_SHARING_SCOPE, newResSharingScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResTypeType getResType() {
		return (ResTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResType(ResTypeType newResType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_TYPE, newResType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(ResTypeType newResType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RES_TYPE, newResType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingType getResultTypeMapping() {
		return (ResultTypeMappingType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RESULT_TYPE_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultTypeMapping(ResultTypeMappingType newResultTypeMapping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RESULT_TYPE_MAPPING, newResultTypeMapping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultTypeMapping(ResultTypeMappingType newResultTypeMapping) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RESULT_TYPE_MAPPING, newResultTypeMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleLinkType getRoleLink() {
		return (RoleLinkType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ROLE_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleLink(RoleLinkType newRoleLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ROLE_LINK, newRoleLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleLink(RoleLinkType newRoleLink) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ROLE_LINK, newRoleLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameType getRoleName() {
		return (RoleNameType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__ROLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleName(RoleNameType newRoleName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__ROLE_NAME, newRoleName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(RoleNameType newRoleName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__ROLE_NAME, newRoleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAsType getRunAs() {
		return (RunAsType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__RUN_AS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunAs(RunAsType newRunAs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__RUN_AS, newRunAs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAs(RunAsType newRunAs) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__RUN_AS, newRunAs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityIdentityType getSecurityIdentity() {
		return (SecurityIdentityType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_IDENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityIdentity(SecurityIdentityType newSecurityIdentity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_IDENTITY, newSecurityIdentity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityIdentity(SecurityIdentityType newSecurityIdentity) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_IDENTITY, newSecurityIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleType getSecurityRole() {
		return (SecurityRoleType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRole(SecurityRoleType newSecurityRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, newSecurityRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRole(SecurityRoleType newSecurityRole) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, newSecurityRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleRefType getSecurityRoleRef() {
		return (SecurityRoleRefType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRoleRef(SecurityRoleRefType newSecurityRoleRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, newSecurityRoleRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRoleRef(SecurityRoleRefType newSecurityRoleRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, newSecurityRoleRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionType getSession() {
		return (SessionType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSession(SessionType newSession, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SESSION, newSession, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(SessionType newSession) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SESSION, newSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeType getSessionType() {
		return (SessionTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SESSION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionType(SessionTypeType newSessionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SESSION_TYPE, newSessionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionType(SessionTypeType newSessionType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SESSION_TYPE, newSessionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallIconType getSmallIcon() {
		return (SmallIconType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SMALL_ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmallIcon(SmallIconType newSmallIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SMALL_ICON, newSmallIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallIcon(SmallIconType newSmallIcon) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SMALL_ICON, newSmallIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionDurabilityType getSubscriptionDurability() {
		return (SubscriptionDurabilityType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionDurability(SubscriptionDurabilityType newSubscriptionDurability, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY, newSubscriptionDurability, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionDurability(SubscriptionDurabilityType newSubscriptionDurability) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY, newSubscriptionDurability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return (TransactionTypeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionType(TransactionTypeType newTransactionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, newTransactionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, newTransactionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeType getTransAttribute() {
		return (TransAttributeType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__TRANS_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransAttribute(TransAttributeType newTransAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__TRANS_ATTRIBUTE, newTransAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransAttribute(TransAttributeType newTransAttribute) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__TRANS_ATTRIBUTE, newTransAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncheckedType getUnchecked() {
		return (UncheckedType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__UNCHECKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnchecked(UncheckedType newUnchecked, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__UNCHECKED, newUnchecked, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnchecked(UncheckedType newUnchecked) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__UNCHECKED, newUnchecked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCallerIdentityType getUseCallerIdentity() {
		return (UseCallerIdentityType)getMixed().get(EjbJar20Package.Literals.DOCUMENT_ROOT__USE_CALLER_IDENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCallerIdentity(UseCallerIdentityType newUseCallerIdentity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar20Package.Literals.DOCUMENT_ROOT__USE_CALLER_IDENTITY, newUseCallerIdentity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCallerIdentity(UseCallerIdentityType newUseCallerIdentity) {
		((FeatureMap.Internal)getMixed()).set(EjbJar20Package.Literals.DOCUMENT_ROOT__USE_CALLER_IDENTITY, newUseCallerIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME:
				return basicSetAbstractSchemaName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ACKNOWLEDGE_MODE:
				return basicSetAcknowledgeMode(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				return basicSetAssemblyDescriptor(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CASCADE_DELETE:
				return basicSetCascadeDelete(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CMP_FIELD:
				return basicSetCmpField(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CMP_VERSION:
				return basicSetCmpVersion(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD:
				return basicSetCmrField(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_NAME:
				return basicSetCmrFieldName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_TYPE:
				return basicSetCmrFieldType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				return basicSetContainerTransaction(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__DESTINATION_TYPE:
				return basicSetDestinationType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				return basicSetEjbClientJar(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_JAR:
				return basicSetEjbJar(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LINK:
				return basicSetEjbLink(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				return basicSetEjbLocalRef(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_QL:
				return basicSetEjbQl(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF:
				return basicSetEjbRef(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return basicSetEjbRefName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return basicSetEjbRefType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION:
				return basicSetEjbRelation(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION_NAME:
				return basicSetEjbRelationName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE:
				return basicSetEjbRelationshipRole(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME:
				return basicSetEjbRelationshipRoleName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				return basicSetEnterpriseBeans(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ENTITY:
				return basicSetEntity(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY:
				return basicSetEnvEntry(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return basicSetEnvEntryName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return basicSetEnvEntryType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return basicSetEnvEntryValue(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__EXCLUDE_LIST:
				return basicSetExcludeList(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__FIELD_NAME:
				return basicSetFieldName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__HOME:
				return basicSetHome(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL:
				return basicSetLocal(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL_HOME:
				return basicSetLocalHome(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN:
				return basicSetMessageDriven(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION:
				return basicSetMessageDrivenDestination(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_SELECTOR:
				return basicSetMessageSelector(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__METHOD:
				return basicSetMethod(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_INTF:
				return basicSetMethodIntf(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_NAME:
				return basicSetMethodName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAM:
				return basicSetMethodParam(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAMS:
				return basicSetMethodParams(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				return basicSetMethodPermission(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				return basicSetPersistenceType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				return basicSetPrimKeyClass(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				return basicSetPrimkeyField(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__QUERY:
				return basicSetQuery(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__QUERY_METHOD:
				return basicSetQueryMethod(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__REENTRANT:
				return basicSetReentrant(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE:
				return basicSetRelationshipRoleSource(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIPS:
				return basicSetRelationships(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__REMOTE:
				return basicSetRemote(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RES_AUTH:
				return basicSetResAuth(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				return basicSetResourceEnvRef(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				return basicSetResourceEnvRefName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				return basicSetResourceEnvRefType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_REF:
				return basicSetResourceRef(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RES_REF_NAME:
				return basicSetResRefName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				return basicSetResSharingScope(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RES_TYPE:
				return basicSetResType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RESULT_TYPE_MAPPING:
				return basicSetResultTypeMapping(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_LINK:
				return basicSetRoleLink(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_NAME:
				return basicSetRoleName(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__RUN_AS:
				return basicSetRunAs(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_IDENTITY:
				return basicSetSecurityIdentity(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return basicSetSecurityRole(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return basicSetSecurityRoleRef(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SESSION:
				return basicSetSession(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SESSION_TYPE:
				return basicSetSessionType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY:
				return basicSetSubscriptionDurability(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return basicSetTransactionType(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				return basicSetTransAttribute(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__UNCHECKED:
				return basicSetUnchecked(null, msgs);
			case EjbJar20Package.DOCUMENT_ROOT__USE_CALLER_IDENTITY:
				return basicSetUseCallerIdentity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EjbJar20Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EjbJar20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case EjbJar20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case EjbJar20Package.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME:
				return getAbstractSchemaName();
			case EjbJar20Package.DOCUMENT_ROOT__ACKNOWLEDGE_MODE:
				return getAcknowledgeMode();
			case EjbJar20Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				return getAssemblyDescriptor();
			case EjbJar20Package.DOCUMENT_ROOT__CASCADE_DELETE:
				return getCascadeDelete();
			case EjbJar20Package.DOCUMENT_ROOT__CMP_FIELD:
				return getCmpField();
			case EjbJar20Package.DOCUMENT_ROOT__CMP_VERSION:
				return getCmpVersion();
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD:
				return getCmrField();
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_NAME:
				return getCmrFieldName();
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_TYPE:
				return getCmrFieldType();
			case EjbJar20Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				return getContainerTransaction();
			case EjbJar20Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.DOCUMENT_ROOT__DESTINATION_TYPE:
				return getDestinationType();
			case EjbJar20Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLASS:
				return getEjbClass();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				return getEjbClientJar();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_JAR:
				return getEjbJar();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LINK:
				return getEjbLink();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_NAME:
				return getEjbName();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_QL:
				return getEjbQl();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF:
				return getEjbRef();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return getEjbRefName();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return getEjbRefType();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION:
				return getEjbRelation();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION_NAME:
				return getEjbRelationName();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE:
				return getEjbRelationshipRole();
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME:
				return getEjbRelationshipRoleName();
			case EjbJar20Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				return getEnterpriseBeans();
			case EjbJar20Package.DOCUMENT_ROOT__ENTITY:
				return getEntity();
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return getEnvEntryName();
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return getEnvEntryType();
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return getEnvEntryValue();
			case EjbJar20Package.DOCUMENT_ROOT__EXCLUDE_LIST:
				return getExcludeList();
			case EjbJar20Package.DOCUMENT_ROOT__FIELD_NAME:
				return getFieldName();
			case EjbJar20Package.DOCUMENT_ROOT__HOME:
				return getHome();
			case EjbJar20Package.DOCUMENT_ROOT__LARGE_ICON:
				return getLargeIcon();
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL:
				return getLocal();
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL_HOME:
				return getLocalHome();
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN:
				return getMessageDriven();
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION:
				return getMessageDrivenDestination();
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_SELECTOR:
				return getMessageSelector();
			case EjbJar20Package.DOCUMENT_ROOT__METHOD:
				return getMethod();
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_INTF:
				return getMethodIntf();
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_NAME:
				return getMethodName();
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAM:
				return getMethodParam();
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAMS:
				return getMethodParams();
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				return getMethodPermission();
			case EjbJar20Package.DOCUMENT_ROOT__MULTIPLICITY:
				return getMultiplicity();
			case EjbJar20Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				return getPersistenceType();
			case EjbJar20Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				return getPrimKeyClass();
			case EjbJar20Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				return getPrimkeyField();
			case EjbJar20Package.DOCUMENT_ROOT__QUERY:
				return getQuery();
			case EjbJar20Package.DOCUMENT_ROOT__QUERY_METHOD:
				return getQueryMethod();
			case EjbJar20Package.DOCUMENT_ROOT__REENTRANT:
				return getReentrant();
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE:
				return getRelationshipRoleSource();
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIPS:
				return getRelationships();
			case EjbJar20Package.DOCUMENT_ROOT__REMOTE:
				return getRemote();
			case EjbJar20Package.DOCUMENT_ROOT__RES_AUTH:
				return getResAuth();
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				return getResourceEnvRefName();
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				return getResourceEnvRefType();
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_REF:
				return getResourceRef();
			case EjbJar20Package.DOCUMENT_ROOT__RES_REF_NAME:
				return getResRefName();
			case EjbJar20Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				return getResSharingScope();
			case EjbJar20Package.DOCUMENT_ROOT__RES_TYPE:
				return getResType();
			case EjbJar20Package.DOCUMENT_ROOT__RESULT_TYPE_MAPPING:
				return getResultTypeMapping();
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_LINK:
				return getRoleLink();
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_NAME:
				return getRoleName();
			case EjbJar20Package.DOCUMENT_ROOT__RUN_AS:
				return getRunAs();
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return getSecurityRole();
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar20Package.DOCUMENT_ROOT__SESSION:
				return getSession();
			case EjbJar20Package.DOCUMENT_ROOT__SESSION_TYPE:
				return getSessionType();
			case EjbJar20Package.DOCUMENT_ROOT__SMALL_ICON:
				return getSmallIcon();
			case EjbJar20Package.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY:
				return getSubscriptionDurability();
			case EjbJar20Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType();
			case EjbJar20Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				return getTransAttribute();
			case EjbJar20Package.DOCUMENT_ROOT__UNCHECKED:
				return getUnchecked();
			case EjbJar20Package.DOCUMENT_ROOT__USE_CALLER_IDENTITY:
				return getUseCallerIdentity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbJar20Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME:
				setAbstractSchemaName((AbstractSchemaNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ACKNOWLEDGE_MODE:
				setAcknowledgeMode((AcknowledgeModeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CASCADE_DELETE:
				setCascadeDelete((CascadeDeleteType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMP_FIELD:
				setCmpField((CmpFieldType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMP_VERSION:
				setCmpVersion((CmpVersionType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD:
				setCmrField((CmrFieldType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_NAME:
				setCmrFieldName((CmrFieldNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_TYPE:
				setCmrFieldType((CmrFieldTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				setContainerTransaction((ContainerTransactionType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__DESTINATION_TYPE:
				setDestinationType((DestinationTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				setEjbClientJar((EjbClientJarType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_JAR:
				setEjbJar((EjbJarType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LINK:
				setEjbLink((EjbLinkType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				setEjbLocalRef((EjbLocalRefType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_QL:
				setEjbQl((EjbQlType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF:
				setEjbRef((EjbRefType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION:
				setEjbRelation((EjbRelationType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION_NAME:
				setEjbRelationName((EjbRelationNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE:
				setEjbRelationshipRole((EjbRelationshipRoleType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME:
				setEjbRelationshipRoleName((EjbRelationshipRoleNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENTITY:
				setEntity((EntityType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY:
				setEnvEntry((EnvEntryType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EXCLUDE_LIST:
				setExcludeList((ExcludeListType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__FIELD_NAME:
				setFieldName((FieldNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__HOME:
				setHome((HomeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL_HOME:
				setLocalHome((LocalHomeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN:
				setMessageDriven((MessageDrivenType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION:
				setMessageDrivenDestination((MessageDrivenDestinationType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_SELECTOR:
				setMessageSelector((MessageSelectorType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD:
				setMethod((MethodType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_INTF:
				setMethodIntf((MethodIntfType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_NAME:
				setMethodName((MethodNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAM:
				setMethodParam((MethodParamType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAMS:
				setMethodParams((MethodParamsType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				setMethodPermission((MethodPermissionType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MULTIPLICITY:
				setMultiplicity((MultiplicityType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				setPrimKeyClass((PrimKeyClassType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				setPrimkeyField((PrimkeyFieldType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__QUERY_METHOD:
				setQueryMethod((QueryMethodType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__REENTRANT:
				setReentrant((ReentrantType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE:
				setRelationshipRoleSource((RelationshipRoleSourceType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIPS:
				setRelationships((RelationshipsType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_AUTH:
				setResAuth((ResAuthType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				setResourceEnvRef((ResourceEnvRefType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((ResourceEnvRefNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((ResourceEnvRefTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_REF:
				setResourceRef((ResourceRefType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_REF_NAME:
				setResRefName((ResRefNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_TYPE:
				setResType((ResTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESULT_TYPE_MAPPING:
				setResultTypeMapping((ResultTypeMappingType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_LINK:
				setRoleLink((RoleLinkType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_NAME:
				setRoleName((RoleNameType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RUN_AS:
				setRunAs((RunAsType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE:
				setSecurityRole((SecurityRoleType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				setSecurityRoleRef((SecurityRoleRefType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SESSION:
				setSession((SessionType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SESSION_TYPE:
				setSessionType((SessionTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY:
				setSubscriptionDurability((SubscriptionDurabilityType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				setTransAttribute((TransAttributeType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__UNCHECKED:
				setUnchecked((UncheckedType)newValue);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__USE_CALLER_IDENTITY:
				setUseCallerIdentity((UseCallerIdentityType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EjbJar20Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case EjbJar20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case EjbJar20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME:
				setAbstractSchemaName((AbstractSchemaNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ACKNOWLEDGE_MODE:
				setAcknowledgeMode((AcknowledgeModeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CASCADE_DELETE:
				setCascadeDelete((CascadeDeleteType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMP_FIELD:
				setCmpField((CmpFieldType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMP_VERSION:
				setCmpVersion((CmpVersionType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD:
				setCmrField((CmrFieldType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_NAME:
				setCmrFieldName((CmrFieldNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_TYPE:
				setCmrFieldType((CmrFieldTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				setContainerTransaction((ContainerTransactionType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__DESTINATION_TYPE:
				setDestinationType((DestinationTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				setEjbClientJar((EjbClientJarType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_JAR:
				setEjbJar((EjbJarType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LINK:
				setEjbLink((EjbLinkType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				setEjbLocalRef((EjbLocalRefType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_QL:
				setEjbQl((EjbQlType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF:
				setEjbRef((EjbRefType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION:
				setEjbRelation((EjbRelationType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION_NAME:
				setEjbRelationName((EjbRelationNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE:
				setEjbRelationshipRole((EjbRelationshipRoleType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME:
				setEjbRelationshipRoleName((EjbRelationshipRoleNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENTITY:
				setEntity((EntityType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY:
				setEnvEntry((EnvEntryType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__EXCLUDE_LIST:
				setExcludeList((ExcludeListType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__FIELD_NAME:
				setFieldName((FieldNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__HOME:
				setHome((HomeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL:
				setLocal((LocalType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL_HOME:
				setLocalHome((LocalHomeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN:
				setMessageDriven((MessageDrivenType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION:
				setMessageDrivenDestination((MessageDrivenDestinationType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_SELECTOR:
				setMessageSelector((MessageSelectorType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD:
				setMethod((MethodType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_INTF:
				setMethodIntf((MethodIntfType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_NAME:
				setMethodName((MethodNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAM:
				setMethodParam((MethodParamType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAMS:
				setMethodParams((MethodParamsType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				setMethodPermission((MethodPermissionType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__MULTIPLICITY:
				setMultiplicity((MultiplicityType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				setPrimKeyClass((PrimKeyClassType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				setPrimkeyField((PrimkeyFieldType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__QUERY:
				setQuery((QueryType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__QUERY_METHOD:
				setQueryMethod((QueryMethodType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__REENTRANT:
				setReentrant((ReentrantType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE:
				setRelationshipRoleSource((RelationshipRoleSourceType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIPS:
				setRelationships((RelationshipsType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__REMOTE:
				setRemote((RemoteType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_AUTH:
				setResAuth((ResAuthType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				setResourceEnvRef((ResourceEnvRefType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				setResourceEnvRefName((ResourceEnvRefNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				setResourceEnvRefType((ResourceEnvRefTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_REF:
				setResourceRef((ResourceRefType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_REF_NAME:
				setResRefName((ResRefNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RES_TYPE:
				setResType((ResTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RESULT_TYPE_MAPPING:
				setResultTypeMapping((ResultTypeMappingType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_LINK:
				setRoleLink((RoleLinkType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_NAME:
				setRoleName((RoleNameType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__RUN_AS:
				setRunAs((RunAsType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE:
				setSecurityRole((SecurityRoleType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				setSecurityRoleRef((SecurityRoleRefType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SESSION:
				setSession((SessionType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SESSION_TYPE:
				setSessionType((SessionTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY:
				setSubscriptionDurability((SubscriptionDurabilityType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				setTransAttribute((TransAttributeType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__UNCHECKED:
				setUnchecked((UncheckedType)null);
				return;
			case EjbJar20Package.DOCUMENT_ROOT__USE_CALLER_IDENTITY:
				setUseCallerIdentity((UseCallerIdentityType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EjbJar20Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EjbJar20Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case EjbJar20Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case EjbJar20Package.DOCUMENT_ROOT__ABSTRACT_SCHEMA_NAME:
				return getAbstractSchemaName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ACKNOWLEDGE_MODE:
				return getAcknowledgeMode() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				return getAssemblyDescriptor() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CASCADE_DELETE:
				return getCascadeDelete() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CMP_FIELD:
				return getCmpField() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CMP_VERSION:
				return getCmpVersion() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD:
				return getCmrField() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_NAME:
				return getCmrFieldName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CMR_FIELD_TYPE:
				return getCmrFieldType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				return getContainerTransaction() != null;
			case EjbJar20Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case EjbJar20Package.DOCUMENT_ROOT__DESTINATION_TYPE:
				return getDestinationType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLASS:
				return getEjbClass() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				return getEjbClientJar() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_JAR:
				return getEjbJar() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LINK:
				return getEjbLink() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_LOCAL_REF:
				return getEjbLocalRef() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_NAME:
				return getEjbName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_QL:
				return getEjbQl() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF:
				return getEjbRef() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return getEjbRefName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return getEjbRefType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION:
				return getEjbRelation() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATION_NAME:
				return getEjbRelationName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE:
				return getEjbRelationshipRole() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EJB_RELATIONSHIP_ROLE_NAME:
				return getEjbRelationshipRoleName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				return getEnterpriseBeans() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ENTITY:
				return getEntity() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY:
				return getEnvEntry() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return getEnvEntryName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return getEnvEntryType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return getEnvEntryValue() != null;
			case EjbJar20Package.DOCUMENT_ROOT__EXCLUDE_LIST:
				return getExcludeList() != null;
			case EjbJar20Package.DOCUMENT_ROOT__FIELD_NAME:
				return getFieldName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__HOME:
				return getHome() != null;
			case EjbJar20Package.DOCUMENT_ROOT__LARGE_ICON:
				return getLargeIcon() != null;
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL:
				return getLocal() != null;
			case EjbJar20Package.DOCUMENT_ROOT__LOCAL_HOME:
				return getLocalHome() != null;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN:
				return getMessageDriven() != null;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_DRIVEN_DESTINATION:
				return getMessageDrivenDestination() != null;
			case EjbJar20Package.DOCUMENT_ROOT__MESSAGE_SELECTOR:
				return getMessageSelector() != null;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD:
				return getMethod() != null;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_INTF:
				return getMethodIntf() != null;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_NAME:
				return getMethodName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAM:
				return getMethodParam() != null;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PARAMS:
				return getMethodParams() != null;
			case EjbJar20Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				return getMethodPermission() != null;
			case EjbJar20Package.DOCUMENT_ROOT__MULTIPLICITY:
				return getMultiplicity() != null;
			case EjbJar20Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				return getPersistenceType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				return getPrimKeyClass() != null;
			case EjbJar20Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				return getPrimkeyField() != null;
			case EjbJar20Package.DOCUMENT_ROOT__QUERY:
				return getQuery() != null;
			case EjbJar20Package.DOCUMENT_ROOT__QUERY_METHOD:
				return getQueryMethod() != null;
			case EjbJar20Package.DOCUMENT_ROOT__REENTRANT:
				return getReentrant() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIP_ROLE_SOURCE:
				return getRelationshipRoleSource() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RELATIONSHIPS:
				return getRelationships() != null;
			case EjbJar20Package.DOCUMENT_ROOT__REMOTE:
				return getRemote() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RES_AUTH:
				return getResAuth() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF:
				return getResourceEnvRef() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_NAME:
				return getResourceEnvRefName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_ENV_REF_TYPE:
				return getResourceEnvRefType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RESOURCE_REF:
				return getResourceRef() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RES_REF_NAME:
				return getResRefName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RES_SHARING_SCOPE:
				return getResSharingScope() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RES_TYPE:
				return getResType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RESULT_TYPE_MAPPING:
				return getResultTypeMapping() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_LINK:
				return getRoleLink() != null;
			case EjbJar20Package.DOCUMENT_ROOT__ROLE_NAME:
				return getRoleName() != null;
			case EjbJar20Package.DOCUMENT_ROOT__RUN_AS:
				return getRunAs() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_IDENTITY:
				return getSecurityIdentity() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return getSecurityRole() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return getSecurityRoleRef() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SESSION:
				return getSession() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SESSION_TYPE:
				return getSessionType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SMALL_ICON:
				return getSmallIcon() != null;
			case EjbJar20Package.DOCUMENT_ROOT__SUBSCRIPTION_DURABILITY:
				return getSubscriptionDurability() != null;
			case EjbJar20Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType() != null;
			case EjbJar20Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				return getTransAttribute() != null;
			case EjbJar20Package.DOCUMENT_ROOT__UNCHECKED:
				return getUnchecked() != null;
			case EjbJar20Package.DOCUMENT_ROOT__USE_CALLER_IDENTITY:
				return getUseCallerIdentity() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: "); //$NON-NLS-1$
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
