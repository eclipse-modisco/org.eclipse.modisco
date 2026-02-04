/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.platform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.kdm.platform.PlatformPackage
 * @generated
 */
public interface PlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformFactory eINSTANCE = org.eclipse.modisco.omg.kdm.platform.impl.PlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	PlatformModel createPlatformModel();

	/**
	 * Returns a new object of class '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires</em>'.
	 * @generated
	 */
	Requires createRequires();

	/**
	 * Returns a new object of class '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Type</em>'.
	 * @generated
	 */
	ResourceType createResourceType();

	/**
	 * Returns a new object of class '<em>Naming Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Naming Resource</em>'.
	 * @generated
	 */
	NamingResource createNamingResource();

	/**
	 * Returns a new object of class '<em>Marshalled Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marshalled Resource</em>'.
	 * @generated
	 */
	MarshalledResource createMarshalledResource();

	/**
	 * Returns a new object of class '<em>Messaging Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Messaging Resource</em>'.
	 * @generated
	 */
	MessagingResource createMessagingResource();

	/**
	 * Returns a new object of class '<em>File Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Resource</em>'.
	 * @generated
	 */
	FileResource createFileResource();

	/**
	 * Returns a new object of class '<em>Execution Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Resource</em>'.
	 * @generated
	 */
	ExecutionResource createExecutionResource();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	PlatformAction createPlatformAction();

	/**
	 * Returns a new object of class '<em>External Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Actor</em>'.
	 * @generated
	 */
	ExternalActor createExternalActor();

	/**
	 * Returns a new object of class '<em>Data Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Manager</em>'.
	 * @generated
	 */
	DataManager createDataManager();

	/**
	 * Returns a new object of class '<em>Binds To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binds To</em>'.
	 * @generated
	 */
	BindsTo createBindsTo();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	PlatformElement createPlatformElement();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	PlatformRelationship createPlatformRelationship();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	PlatformEvent createPlatformEvent();

	/**
	 * Returns a new object of class '<em>Lock Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lock Resource</em>'.
	 * @generated
	 */
	LockResource createLockResource();

	/**
	 * Returns a new object of class '<em>Deployed Software System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Software System</em>'.
	 * @generated
	 */
	DeployedSoftwareSystem createDeployedSoftwareSystem();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Deployed Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Component</em>'.
	 * @generated
	 */
	DeployedComponent createDeployedComponent();

	/**
	 * Returns a new object of class '<em>Deployed Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployed Resource</em>'.
	 * @generated
	 */
	DeployedResource createDeployedResource();

	/**
	 * Returns a new object of class '<em>Loads</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loads</em>'.
	 * @generated
	 */
	Loads createLoads();

	/**
	 * Returns a new object of class '<em>Spawns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spawns</em>'.
	 * @generated
	 */
	Spawns createSpawns();

	/**
	 * Returns a new object of class '<em>Runtime Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Resource</em>'.
	 * @generated
	 */
	RuntimeResource createRuntimeResource();

	/**
	 * Returns a new object of class '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread</em>'.
	 * @generated
	 */
	Thread createThread();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Reads Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reads Resource</em>'.
	 * @generated
	 */
	ReadsResource createReadsResource();

	/**
	 * Returns a new object of class '<em>Writes Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writes Resource</em>'.
	 * @generated
	 */
	WritesResource createWritesResource();

	/**
	 * Returns a new object of class '<em>Manages Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manages Resource</em>'.
	 * @generated
	 */
	ManagesResource createManagesResource();

	/**
	 * Returns a new object of class '<em>Defined By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defined By</em>'.
	 * @generated
	 */
	DefinedBy createDefinedBy();

	/**
	 * Returns a new object of class '<em>Stream Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Resource</em>'.
	 * @generated
	 */
	StreamResource createStreamResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatformPackage getPlatformPackage();

} //PlatformFactory
