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
package org.eclipse.modisco.jee.ejbjar.EjbJar11.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClientJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryValueType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.FieldNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResRefNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.TransAttributeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.TransactionTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getAssemblyDescriptor <em>Assembly Descriptor</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getCmpField <em>Cmp Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbClientJar <em>Ejb Client Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbJar <em>Ejb Jar</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEnterpriseBeans <em>Enterprise Beans</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMethodIntf <em>Method Intf</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMethodParam <em>Method Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getRoleLink <em>Role Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.DocumentRootImpl#getTransAttribute <em>Trans Attribute</em>}</li>
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
		return EjbJar11Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EjbJar11Package.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EjbJar11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EjbJar11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyDescriptorType getAssemblyDescriptor() {
		return (AssemblyDescriptorType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyDescriptor(AssemblyDescriptorType newAssemblyDescriptor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR, newAssemblyDescriptor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyDescriptor(AssemblyDescriptorType newAssemblyDescriptor) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR, newAssemblyDescriptor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpFieldType getCmpField() {
		return (CmpFieldType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__CMP_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmpField(CmpFieldType newCmpField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__CMP_FIELD, newCmpField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmpField(CmpFieldType newCmpField) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__CMP_FIELD, newCmpField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerTransactionType getContainerTransaction() {
		return (ContainerTransactionType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__CONTAINER_TRANSACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerTransaction(ContainerTransactionType newContainerTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__CONTAINER_TRANSACTION, newContainerTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerTransaction(ContainerTransactionType newContainerTransaction) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__CONTAINER_TRANSACTION, newContainerTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType getDisplayName() {
		return (DisplayNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(DisplayNameType newDisplayName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, newDisplayName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(DisplayNameType newDisplayName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__DISPLAY_NAME, newDisplayName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType getEjbClass() {
		return (EjbClassType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClass(EjbClassType newEjbClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_CLASS, newEjbClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(EjbClassType newEjbClass) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_CLASS, newEjbClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClientJarType getEjbClientJar() {
		return (EjbClientJarType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_CLIENT_JAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClientJar(EjbClientJarType newEjbClientJar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_CLIENT_JAR, newEjbClientJar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClientJar(EjbClientJarType newEjbClientJar) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_CLIENT_JAR, newEjbClientJar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbJarType getEjbJar() {
		return (EjbJarType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_JAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbJar(EjbJarType newEjbJar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_JAR, newEjbJar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbJar(EjbJarType newEjbJar) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_JAR, newEjbJar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLinkType getEjbLink() {
		return (EjbLinkType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbLink(EjbLinkType newEjbLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_LINK, newEjbLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbLink(EjbLinkType newEjbLink) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_LINK, newEjbLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbNameType getEjbName() {
		return (EjbNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbName(EjbNameType newEjbName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_NAME, newEjbName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(EjbNameType newEjbName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_NAME, newEjbName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefType getEjbRef() {
		return (EjbRefType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRef(EjbRefType newEjbRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF, newEjbRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRef(EjbRefType newEjbRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF, newEjbRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefNameType getEjbRefName() {
		return (EjbRefNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefName(EjbRefNameType newEjbRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, newEjbRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefName(EjbRefNameType newEjbRefName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF_NAME, newEjbRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeType getEjbRefType() {
		return (EjbRefTypeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefType(EjbRefTypeType newEjbRefType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, newEjbRefType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefType(EjbRefTypeType newEjbRefType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__EJB_REF_TYPE, newEjbRefType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnterpriseBeansType getEnterpriseBeans() {
		return (EnterpriseBeansType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ENTERPRISE_BEANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterpriseBeans(EnterpriseBeansType newEnterpriseBeans, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ENTERPRISE_BEANS, newEnterpriseBeans, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseBeans(EnterpriseBeansType newEnterpriseBeans) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ENTERPRISE_BEANS, newEnterpriseBeans);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntity() {
		return (EntityType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(EntityType newEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ENTITY, newEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityType newEntity) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryType getEnvEntry() {
		return (EnvEntryType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntry(EnvEntryType newEnvEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, newEnvEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntry(EnvEntryType newEnvEntry) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY, newEnvEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryNameType getEnvEntryName() {
		return (EnvEntryNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryName(EnvEntryNameType newEnvEntryName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, newEnvEntryName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryName(EnvEntryNameType newEnvEntryName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_NAME, newEnvEntryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeType getEnvEntryType() {
		return (EnvEntryTypeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryType(EnvEntryTypeType newEnvEntryType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, newEnvEntryType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryType(EnvEntryTypeType newEnvEntryType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_TYPE, newEnvEntryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryValueType getEnvEntryValue() {
		return (EnvEntryValueType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryValue(EnvEntryValueType newEnvEntryValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, newEnvEntryValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryValue(EnvEntryValueType newEnvEntryValue) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ENV_ENTRY_VALUE, newEnvEntryValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldNameType getFieldName() {
		return (FieldNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__FIELD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldName(FieldNameType newFieldName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__FIELD_NAME, newFieldName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(FieldNameType newFieldName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__FIELD_NAME, newFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType getHome() {
		return (HomeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__HOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(HomeType newHome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__HOME, newHome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(HomeType newHome) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__HOME, newHome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeIconType getLargeIcon() {
		return (LargeIconType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__LARGE_ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeIcon(LargeIconType newLargeIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__LARGE_ICON, newLargeIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeIcon(LargeIconType newLargeIcon) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__LARGE_ICON, newLargeIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType getMethod() {
		return (MethodType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodType newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD, newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(MethodType newMethod) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfType getMethodIntf() {
		return (MethodIntfType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_INTF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodIntf(MethodIntfType newMethodIntf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_INTF, newMethodIntf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodIntf(MethodIntfType newMethodIntf) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_INTF, newMethodIntf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNameType getMethodName() {
		return (MethodNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(MethodNameType newMethodName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_NAME, newMethodName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(MethodNameType newMethodName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_NAME, newMethodName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamType getMethodParam() {
		return (MethodParamType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodParam(MethodParamType newMethodParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PARAM, newMethodParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodParam(MethodParamType newMethodParam) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PARAM, newMethodParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamsType getMethodParams() {
		return (MethodParamsType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PARAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodParams(MethodParamsType newMethodParams, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PARAMS, newMethodParams, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodParams(MethodParamsType newMethodParams) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PARAMS, newMethodParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodPermissionType getMethodPermission() {
		return (MethodPermissionType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PERMISSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodPermission(MethodPermissionType newMethodPermission, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PERMISSION, newMethodPermission, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodPermission(MethodPermissionType newMethodPermission) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__METHOD_PERMISSION, newMethodPermission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType getPersistenceType() {
		return (PersistenceTypeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__PERSISTENCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceType(PersistenceTypeType newPersistenceType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__PERSISTENCE_TYPE, newPersistenceType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(PersistenceTypeType newPersistenceType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__PERSISTENCE_TYPE, newPersistenceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimKeyClassType getPrimKeyClass() {
		return (PrimKeyClassType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__PRIM_KEY_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimKeyClass(PrimKeyClassType newPrimKeyClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__PRIM_KEY_CLASS, newPrimKeyClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimKeyClass(PrimKeyClassType newPrimKeyClass) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__PRIM_KEY_CLASS, newPrimKeyClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimkeyFieldType getPrimkeyField() {
		return (PrimkeyFieldType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__PRIMKEY_FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimkeyField(PrimkeyFieldType newPrimkeyField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__PRIMKEY_FIELD, newPrimkeyField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimkeyField(PrimkeyFieldType newPrimkeyField) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__PRIMKEY_FIELD, newPrimkeyField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReentrantType getReentrant() {
		return (ReentrantType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__REENTRANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReentrant(ReentrantType newReentrant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__REENTRANT, newReentrant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(ReentrantType newReentrant) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__REENTRANT, newReentrant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType getRemote() {
		return (RemoteType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__REMOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemote(RemoteType newRemote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__REMOTE, newRemote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(RemoteType newRemote) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__REMOTE, newRemote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType getResAuth() {
		return (ResAuthType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_AUTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResAuth(ResAuthType newResAuth, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_AUTH, newResAuth, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAuth(ResAuthType newResAuth) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_AUTH, newResAuth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRefType getResourceRef() {
		return (ResourceRefType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRef(ResourceRefType newResourceRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, newResourceRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(ResourceRefType newResourceRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__RESOURCE_REF, newResourceRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResRefNameType getResRefName() {
		return (ResRefNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResRefName(ResRefNameType newResRefName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, newResRefName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResRefName(ResRefNameType newResRefName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_REF_NAME, newResRefName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResTypeType getResType() {
		return (ResTypeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResType(ResTypeType newResType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_TYPE, newResType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(ResTypeType newResType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__RES_TYPE, newResType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleLinkType getRoleLink() {
		return (RoleLinkType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ROLE_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleLink(RoleLinkType newRoleLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ROLE_LINK, newRoleLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleLink(RoleLinkType newRoleLink) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ROLE_LINK, newRoleLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameType getRoleName() {
		return (RoleNameType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__ROLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleName(RoleNameType newRoleName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__ROLE_NAME, newRoleName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(RoleNameType newRoleName) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__ROLE_NAME, newRoleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleType getSecurityRole() {
		return (SecurityRoleType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRole(SecurityRoleType newSecurityRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, newSecurityRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRole(SecurityRoleType newSecurityRole) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE, newSecurityRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRoleRefType getSecurityRoleRef() {
		return (SecurityRoleRefType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityRoleRef(SecurityRoleRefType newSecurityRoleRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, newSecurityRoleRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityRoleRef(SecurityRoleRefType newSecurityRoleRef) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__SECURITY_ROLE_REF, newSecurityRoleRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionType getSession() {
		return (SessionType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSession(SessionType newSession, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__SESSION, newSession, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(SessionType newSession) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__SESSION, newSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeType getSessionType() {
		return (SessionTypeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__SESSION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionType(SessionTypeType newSessionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__SESSION_TYPE, newSessionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionType(SessionTypeType newSessionType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__SESSION_TYPE, newSessionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallIconType getSmallIcon() {
		return (SmallIconType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__SMALL_ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmallIcon(SmallIconType newSmallIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__SMALL_ICON, newSmallIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallIcon(SmallIconType newSmallIcon) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__SMALL_ICON, newSmallIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return (TransactionTypeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionType(TransactionTypeType newTransactionType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, newTransactionType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__TRANSACTION_TYPE, newTransactionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransAttributeType getTransAttribute() {
		return (TransAttributeType)getMixed().get(EjbJar11Package.Literals.DOCUMENT_ROOT__TRANS_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransAttribute(TransAttributeType newTransAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EjbJar11Package.Literals.DOCUMENT_ROOT__TRANS_ATTRIBUTE, newTransAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransAttribute(TransAttributeType newTransAttribute) {
		((FeatureMap.Internal)getMixed()).set(EjbJar11Package.Literals.DOCUMENT_ROOT__TRANS_ATTRIBUTE, newTransAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar11Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				return basicSetAssemblyDescriptor(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__CMP_FIELD:
				return basicSetCmpField(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				return basicSetContainerTransaction(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				return basicSetEjbClientJar(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_JAR:
				return basicSetEjbJar(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_LINK:
				return basicSetEjbLink(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF:
				return basicSetEjbRef(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return basicSetEjbRefName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return basicSetEjbRefType(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				return basicSetEnterpriseBeans(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ENTITY:
				return basicSetEntity(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY:
				return basicSetEnvEntry(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return basicSetEnvEntryName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return basicSetEnvEntryType(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return basicSetEnvEntryValue(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__FIELD_NAME:
				return basicSetFieldName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__HOME:
				return basicSetHome(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__METHOD:
				return basicSetMethod(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_INTF:
				return basicSetMethodIntf(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_NAME:
				return basicSetMethodName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAM:
				return basicSetMethodParam(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAMS:
				return basicSetMethodParams(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				return basicSetMethodPermission(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				return basicSetPersistenceType(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				return basicSetPrimKeyClass(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				return basicSetPrimkeyField(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__REENTRANT:
				return basicSetReentrant(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__REMOTE:
				return basicSetRemote(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__RES_AUTH:
				return basicSetResAuth(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__RESOURCE_REF:
				return basicSetResourceRef(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__RES_REF_NAME:
				return basicSetResRefName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__RES_TYPE:
				return basicSetResType(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_LINK:
				return basicSetRoleLink(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_NAME:
				return basicSetRoleName(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return basicSetSecurityRole(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return basicSetSecurityRoleRef(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__SESSION:
				return basicSetSession(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__SESSION_TYPE:
				return basicSetSessionType(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return basicSetTransactionType(null, msgs);
			case EjbJar11Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				return basicSetTransAttribute(null, msgs);
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
			case EjbJar11Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EjbJar11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case EjbJar11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case EjbJar11Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				return getAssemblyDescriptor();
			case EjbJar11Package.DOCUMENT_ROOT__CMP_FIELD:
				return getCmpField();
			case EjbJar11Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				return getContainerTransaction();
			case EjbJar11Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case EjbJar11Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLASS:
				return getEjbClass();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				return getEjbClientJar();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_JAR:
				return getEjbJar();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_LINK:
				return getEjbLink();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_NAME:
				return getEjbName();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF:
				return getEjbRef();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return getEjbRefName();
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return getEjbRefType();
			case EjbJar11Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				return getEnterpriseBeans();
			case EjbJar11Package.DOCUMENT_ROOT__ENTITY:
				return getEntity();
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return getEnvEntryName();
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return getEnvEntryType();
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return getEnvEntryValue();
			case EjbJar11Package.DOCUMENT_ROOT__FIELD_NAME:
				return getFieldName();
			case EjbJar11Package.DOCUMENT_ROOT__HOME:
				return getHome();
			case EjbJar11Package.DOCUMENT_ROOT__LARGE_ICON:
				return getLargeIcon();
			case EjbJar11Package.DOCUMENT_ROOT__METHOD:
				return getMethod();
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_INTF:
				return getMethodIntf();
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_NAME:
				return getMethodName();
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAM:
				return getMethodParam();
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAMS:
				return getMethodParams();
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				return getMethodPermission();
			case EjbJar11Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				return getPersistenceType();
			case EjbJar11Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				return getPrimKeyClass();
			case EjbJar11Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				return getPrimkeyField();
			case EjbJar11Package.DOCUMENT_ROOT__REENTRANT:
				return getReentrant();
			case EjbJar11Package.DOCUMENT_ROOT__REMOTE:
				return getRemote();
			case EjbJar11Package.DOCUMENT_ROOT__RES_AUTH:
				return getResAuth();
			case EjbJar11Package.DOCUMENT_ROOT__RESOURCE_REF:
				return getResourceRef();
			case EjbJar11Package.DOCUMENT_ROOT__RES_REF_NAME:
				return getResRefName();
			case EjbJar11Package.DOCUMENT_ROOT__RES_TYPE:
				return getResType();
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_LINK:
				return getRoleLink();
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_NAME:
				return getRoleName();
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return getSecurityRole();
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar11Package.DOCUMENT_ROOT__SESSION:
				return getSession();
			case EjbJar11Package.DOCUMENT_ROOT__SESSION_TYPE:
				return getSessionType();
			case EjbJar11Package.DOCUMENT_ROOT__SMALL_ICON:
				return getSmallIcon();
			case EjbJar11Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType();
			case EjbJar11Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				return getTransAttribute();
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
			case EjbJar11Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__CMP_FIELD:
				setCmpField((CmpFieldType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				setContainerTransaction((ContainerTransactionType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				setEjbClientJar((EjbClientJarType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_JAR:
				setEjbJar((EjbJarType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_LINK:
				setEjbLink((EjbLinkType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF:
				setEjbRef((EjbRefType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENTITY:
				setEntity((EntityType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY:
				setEnvEntry((EnvEntryType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__FIELD_NAME:
				setFieldName((FieldNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__HOME:
				setHome((HomeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD:
				setMethod((MethodType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_INTF:
				setMethodIntf((MethodIntfType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_NAME:
				setMethodName((MethodNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAM:
				setMethodParam((MethodParamType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAMS:
				setMethodParams((MethodParamsType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				setMethodPermission((MethodPermissionType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				setPrimKeyClass((PrimKeyClassType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				setPrimkeyField((PrimkeyFieldType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__REENTRANT:
				setReentrant((ReentrantType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RES_AUTH:
				setResAuth((ResAuthType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RESOURCE_REF:
				setResourceRef((ResourceRefType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RES_REF_NAME:
				setResRefName((ResRefNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RES_TYPE:
				setResType((ResTypeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_LINK:
				setRoleLink((RoleLinkType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_NAME:
				setRoleName((RoleNameType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE:
				setSecurityRole((SecurityRoleType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				setSecurityRoleRef((SecurityRoleRefType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SESSION:
				setSession((SessionType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SESSION_TYPE:
				setSessionType((SessionTypeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				setTransAttribute((TransAttributeType)newValue);
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
			case EjbJar11Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case EjbJar11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case EjbJar11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				setAssemblyDescriptor((AssemblyDescriptorType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__CMP_FIELD:
				setCmpField((CmpFieldType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				setContainerTransaction((ContainerTransactionType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				setEjbClientJar((EjbClientJarType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_JAR:
				setEjbJar((EjbJarType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_LINK:
				setEjbLink((EjbLinkType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF:
				setEjbRef((EjbRefType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				setEnterpriseBeans((EnterpriseBeansType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENTITY:
				setEntity((EntityType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY:
				setEnvEntry((EnvEntryType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				setEnvEntryName((EnvEntryNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				setEnvEntryValue((EnvEntryValueType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__FIELD_NAME:
				setFieldName((FieldNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__HOME:
				setHome((HomeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD:
				setMethod((MethodType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_INTF:
				setMethodIntf((MethodIntfType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_NAME:
				setMethodName((MethodNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAM:
				setMethodParam((MethodParamType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAMS:
				setMethodParams((MethodParamsType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				setMethodPermission((MethodPermissionType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				setPrimKeyClass((PrimKeyClassType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				setPrimkeyField((PrimkeyFieldType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__REENTRANT:
				setReentrant((ReentrantType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__REMOTE:
				setRemote((RemoteType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RES_AUTH:
				setResAuth((ResAuthType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RESOURCE_REF:
				setResourceRef((ResourceRefType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RES_REF_NAME:
				setResRefName((ResRefNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__RES_TYPE:
				setResType((ResTypeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_LINK:
				setRoleLink((RoleLinkType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_NAME:
				setRoleName((RoleNameType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE:
				setSecurityRole((SecurityRoleType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				setSecurityRoleRef((SecurityRoleRefType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SESSION:
				setSession((SessionType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SESSION_TYPE:
				setSessionType((SessionTypeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)null);
				return;
			case EjbJar11Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				setTransAttribute((TransAttributeType)null);
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
			case EjbJar11Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EjbJar11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case EjbJar11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case EjbJar11Package.DOCUMENT_ROOT__ASSEMBLY_DESCRIPTOR:
				return getAssemblyDescriptor() != null;
			case EjbJar11Package.DOCUMENT_ROOT__CMP_FIELD:
				return getCmpField() != null;
			case EjbJar11Package.DOCUMENT_ROOT__CONTAINER_TRANSACTION:
				return getContainerTransaction() != null;
			case EjbJar11Package.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case EjbJar11Package.DOCUMENT_ROOT__DISPLAY_NAME:
				return getDisplayName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLASS:
				return getEjbClass() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_CLIENT_JAR:
				return getEjbClientJar() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_JAR:
				return getEjbJar() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_LINK:
				return getEjbLink() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_NAME:
				return getEjbName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF:
				return getEjbRef() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_NAME:
				return getEjbRefName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__EJB_REF_TYPE:
				return getEjbRefType() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ENTERPRISE_BEANS:
				return getEnterpriseBeans() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ENTITY:
				return getEntity() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY:
				return getEnvEntry() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_NAME:
				return getEnvEntryName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_TYPE:
				return getEnvEntryType() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ENV_ENTRY_VALUE:
				return getEnvEntryValue() != null;
			case EjbJar11Package.DOCUMENT_ROOT__FIELD_NAME:
				return getFieldName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__HOME:
				return getHome() != null;
			case EjbJar11Package.DOCUMENT_ROOT__LARGE_ICON:
				return getLargeIcon() != null;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD:
				return getMethod() != null;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_INTF:
				return getMethodIntf() != null;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_NAME:
				return getMethodName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAM:
				return getMethodParam() != null;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PARAMS:
				return getMethodParams() != null;
			case EjbJar11Package.DOCUMENT_ROOT__METHOD_PERMISSION:
				return getMethodPermission() != null;
			case EjbJar11Package.DOCUMENT_ROOT__PERSISTENCE_TYPE:
				return getPersistenceType() != null;
			case EjbJar11Package.DOCUMENT_ROOT__PRIM_KEY_CLASS:
				return getPrimKeyClass() != null;
			case EjbJar11Package.DOCUMENT_ROOT__PRIMKEY_FIELD:
				return getPrimkeyField() != null;
			case EjbJar11Package.DOCUMENT_ROOT__REENTRANT:
				return getReentrant() != null;
			case EjbJar11Package.DOCUMENT_ROOT__REMOTE:
				return getRemote() != null;
			case EjbJar11Package.DOCUMENT_ROOT__RES_AUTH:
				return getResAuth() != null;
			case EjbJar11Package.DOCUMENT_ROOT__RESOURCE_REF:
				return getResourceRef() != null;
			case EjbJar11Package.DOCUMENT_ROOT__RES_REF_NAME:
				return getResRefName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__RES_TYPE:
				return getResType() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_LINK:
				return getRoleLink() != null;
			case EjbJar11Package.DOCUMENT_ROOT__ROLE_NAME:
				return getRoleName() != null;
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE:
				return getSecurityRole() != null;
			case EjbJar11Package.DOCUMENT_ROOT__SECURITY_ROLE_REF:
				return getSecurityRoleRef() != null;
			case EjbJar11Package.DOCUMENT_ROOT__SESSION:
				return getSession() != null;
			case EjbJar11Package.DOCUMENT_ROOT__SESSION_TYPE:
				return getSessionType() != null;
			case EjbJar11Package.DOCUMENT_ROOT__SMALL_ICON:
				return getSmallIcon() != null;
			case EjbJar11Package.DOCUMENT_ROOT__TRANSACTION_TYPE:
				return getTransactionType() != null;
			case EjbJar11Package.DOCUMENT_ROOT__TRANS_ATTRIBUTE:
				return getTransAttribute() != null;
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
