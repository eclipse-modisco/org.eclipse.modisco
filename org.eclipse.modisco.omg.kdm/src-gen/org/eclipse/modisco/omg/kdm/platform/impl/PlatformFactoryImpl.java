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
package org.eclipse.modisco.omg.kdm.platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.omg.kdm.platform.BindsTo;
import org.eclipse.modisco.omg.kdm.platform.DataManager;
import org.eclipse.modisco.omg.kdm.platform.DefinedBy;
import org.eclipse.modisco.omg.kdm.platform.DeployedComponent;
import org.eclipse.modisco.omg.kdm.platform.DeployedResource;
import org.eclipse.modisco.omg.kdm.platform.DeployedSoftwareSystem;
import org.eclipse.modisco.omg.kdm.platform.ExecutionResource;
import org.eclipse.modisco.omg.kdm.platform.ExternalActor;
import org.eclipse.modisco.omg.kdm.platform.FileResource;
import org.eclipse.modisco.omg.kdm.platform.Loads;
import org.eclipse.modisco.omg.kdm.platform.LockResource;
import org.eclipse.modisco.omg.kdm.platform.Machine;
import org.eclipse.modisco.omg.kdm.platform.ManagesResource;
import org.eclipse.modisco.omg.kdm.platform.MarshalledResource;
import org.eclipse.modisco.omg.kdm.platform.MessagingResource;
import org.eclipse.modisco.omg.kdm.platform.NamingResource;
import org.eclipse.modisco.omg.kdm.platform.PlatformAction;
import org.eclipse.modisco.omg.kdm.platform.PlatformElement;
import org.eclipse.modisco.omg.kdm.platform.PlatformEvent;
import org.eclipse.modisco.omg.kdm.platform.PlatformFactory;
import org.eclipse.modisco.omg.kdm.platform.PlatformModel;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.platform.PlatformRelationship;
import org.eclipse.modisco.omg.kdm.platform.ReadsResource;
import org.eclipse.modisco.omg.kdm.platform.Requires;
import org.eclipse.modisco.omg.kdm.platform.ResourceType;
import org.eclipse.modisco.omg.kdm.platform.RuntimeResource;
import org.eclipse.modisco.omg.kdm.platform.Spawns;
import org.eclipse.modisco.omg.kdm.platform.StreamResource;
import org.eclipse.modisco.omg.kdm.platform.WritesResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatformFactoryImpl extends EFactoryImpl implements PlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatformFactory init() {
		try {
			PlatformFactory thePlatformFactory = (PlatformFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/platform"); //$NON-NLS-1$ 
			if (thePlatformFactory != null) {
				return thePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatformPackage.PLATFORM_MODEL: return createPlatformModel();
			case PlatformPackage.RESOURCE_TYPE: return createResourceType();
			case PlatformPackage.NAMING_RESOURCE: return createNamingResource();
			case PlatformPackage.MARSHALLED_RESOURCE: return createMarshalledResource();
			case PlatformPackage.MESSAGING_RESOURCE: return createMessagingResource();
			case PlatformPackage.FILE_RESOURCE: return createFileResource();
			case PlatformPackage.EXECUTION_RESOURCE: return createExecutionResource();
			case PlatformPackage.LOCK_RESOURCE: return createLockResource();
			case PlatformPackage.STREAM_RESOURCE: return createStreamResource();
			case PlatformPackage.DATA_MANAGER: return createDataManager();
			case PlatformPackage.PLATFORM_EVENT: return createPlatformEvent();
			case PlatformPackage.PLATFORM_ACTION: return createPlatformAction();
			case PlatformPackage.EXTERNAL_ACTOR: return createExternalActor();
			case PlatformPackage.BINDS_TO: return createBindsTo();
			case PlatformPackage.REQUIRES: return createRequires();
			case PlatformPackage.MANAGES_RESOURCE: return createManagesResource();
			case PlatformPackage.READS_RESOURCE: return createReadsResource();
			case PlatformPackage.WRITES_RESOURCE: return createWritesResource();
			case PlatformPackage.DEFINED_BY: return createDefinedBy();
			case PlatformPackage.DEPLOYED_COMPONENT: return createDeployedComponent();
			case PlatformPackage.DEPLOYED_SOFTWARE_SYSTEM: return createDeployedSoftwareSystem();
			case PlatformPackage.MACHINE: return createMachine();
			case PlatformPackage.DEPLOYED_RESOURCE: return createDeployedResource();
			case PlatformPackage.RUNTIME_RESOURCE: return createRuntimeResource();
			case PlatformPackage.PROCESS: return createProcess();
			case PlatformPackage.THREAD: return createThread();
			case PlatformPackage.LOADS: return createLoads();
			case PlatformPackage.SPAWNS: return createSpawns();
			case PlatformPackage.PLATFORM_ELEMENT: return createPlatformElement();
			case PlatformPackage.PLATFORM_RELATIONSHIP: return createPlatformRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformModel createPlatformModel() {
		PlatformModelImpl platformModel = new PlatformModelImpl();
		return platformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requires createRequires() {
		RequiresImpl requires = new RequiresImpl();
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingResource createNamingResource() {
		NamingResourceImpl namingResource = new NamingResourceImpl();
		return namingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarshalledResource createMarshalledResource() {
		MarshalledResourceImpl marshalledResource = new MarshalledResourceImpl();
		return marshalledResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagingResource createMessagingResource() {
		MessagingResourceImpl messagingResource = new MessagingResourceImpl();
		return messagingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileResource createFileResource() {
		FileResourceImpl fileResource = new FileResourceImpl();
		return fileResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionResource createExecutionResource() {
		ExecutionResourceImpl executionResource = new ExecutionResourceImpl();
		return executionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAction createPlatformAction() {
		PlatformActionImpl platformAction = new PlatformActionImpl();
		return platformAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalActor createExternalActor() {
		ExternalActorImpl externalActor = new ExternalActorImpl();
		return externalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataManager createDataManager() {
		DataManagerImpl dataManager = new DataManagerImpl();
		return dataManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindsTo createBindsTo() {
		BindsToImpl bindsTo = new BindsToImpl();
		return bindsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformElement createPlatformElement() {
		PlatformElementImpl platformElement = new PlatformElementImpl();
		return platformElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformRelationship createPlatformRelationship() {
		PlatformRelationshipImpl platformRelationship = new PlatformRelationshipImpl();
		return platformRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformEvent createPlatformEvent() {
		PlatformEventImpl platformEvent = new PlatformEventImpl();
		return platformEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockResource createLockResource() {
		LockResourceImpl lockResource = new LockResourceImpl();
		return lockResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedSoftwareSystem createDeployedSoftwareSystem() {
		DeployedSoftwareSystemImpl deployedSoftwareSystem = new DeployedSoftwareSystemImpl();
		return deployedSoftwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedComponent createDeployedComponent() {
		DeployedComponentImpl deployedComponent = new DeployedComponentImpl();
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployedResource createDeployedResource() {
		DeployedResourceImpl deployedResource = new DeployedResourceImpl();
		return deployedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loads createLoads() {
		LoadsImpl loads = new LoadsImpl();
		return loads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spawns createSpawns() {
		SpawnsImpl spawns = new SpawnsImpl();
		return spawns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeResource createRuntimeResource() {
		RuntimeResourceImpl runtimeResource = new RuntimeResourceImpl();
		return runtimeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.omg.kdm.platform.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.omg.kdm.platform.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadsResource createReadsResource() {
		ReadsResourceImpl readsResource = new ReadsResourceImpl();
		return readsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritesResource createWritesResource() {
		WritesResourceImpl writesResource = new WritesResourceImpl();
		return writesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagesResource createManagesResource() {
		ManagesResourceImpl managesResource = new ManagesResourceImpl();
		return managesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedBy createDefinedBy() {
		DefinedByImpl definedBy = new DefinedByImpl();
		return definedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamResource createStreamResource() {
		StreamResourceImpl streamResource = new StreamResourceImpl();
		return streamResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformPackage getPlatformPackage() {
		return (PlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatformPackage getPackage() {
		return PlatformPackage.eINSTANCE;
	}

} //PlatformFactoryImpl
