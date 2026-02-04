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
package org.eclipse.modisco.omg.kdm.platform.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship;
import org.eclipse.modisco.omg.kdm.core.Element;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.modisco.omg.kdm.core.ModelElement;
import org.eclipse.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.modisco.omg.kdm.platform.AbstractPlatformElement;
import org.eclipse.modisco.omg.kdm.platform.AbstractPlatformRelationship;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.kdm.platform.PlatformPackage
 * @generated
 */
@SuppressWarnings("all")
public class PlatformAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlatformPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformAdapterFactory() {
		if (PlatformAdapterFactory.modelPackage == null) {
			PlatformAdapterFactory.modelPackage = PlatformPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == PlatformAdapterFactory.modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == PlatformAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformSwitch<Adapter> modelSwitch =
		new PlatformSwitch<Adapter>() {
			@Override
			public Adapter casePlatformModel(final PlatformModel object) {
				return createPlatformModelAdapter();
			}
			@Override
			public Adapter caseAbstractPlatformElement(final AbstractPlatformElement object) {
				return createAbstractPlatformElementAdapter();
			}
			@Override
			public Adapter caseAbstractPlatformRelationship(final AbstractPlatformRelationship object) {
				return createAbstractPlatformRelationshipAdapter();
			}
			@Override
			public Adapter caseResourceType(final ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseNamingResource(final NamingResource object) {
				return createNamingResourceAdapter();
			}
			@Override
			public Adapter caseMarshalledResource(final MarshalledResource object) {
				return createMarshalledResourceAdapter();
			}
			@Override
			public Adapter caseMessagingResource(final MessagingResource object) {
				return createMessagingResourceAdapter();
			}
			@Override
			public Adapter caseFileResource(final FileResource object) {
				return createFileResourceAdapter();
			}
			@Override
			public Adapter caseExecutionResource(final ExecutionResource object) {
				return createExecutionResourceAdapter();
			}
			@Override
			public Adapter caseLockResource(final LockResource object) {
				return createLockResourceAdapter();
			}
			@Override
			public Adapter caseStreamResource(final StreamResource object) {
				return createStreamResourceAdapter();
			}
			@Override
			public Adapter caseDataManager(final DataManager object) {
				return createDataManagerAdapter();
			}
			@Override
			public Adapter casePlatformEvent(final PlatformEvent object) {
				return createPlatformEventAdapter();
			}
			@Override
			public Adapter casePlatformAction(final PlatformAction object) {
				return createPlatformActionAdapter();
			}
			@Override
			public Adapter caseExternalActor(final ExternalActor object) {
				return createExternalActorAdapter();
			}
			@Override
			public Adapter caseBindsTo(final BindsTo object) {
				return createBindsToAdapter();
			}
			@Override
			public Adapter caseRequires(final Requires object) {
				return createRequiresAdapter();
			}
			@Override
			public Adapter caseManagesResource(final ManagesResource object) {
				return createManagesResourceAdapter();
			}
			@Override
			public Adapter caseReadsResource(final ReadsResource object) {
				return createReadsResourceAdapter();
			}
			@Override
			public Adapter caseWritesResource(final WritesResource object) {
				return createWritesResourceAdapter();
			}
			@Override
			public Adapter caseDefinedBy(final DefinedBy object) {
				return createDefinedByAdapter();
			}
			@Override
			public Adapter caseDeployedComponent(final DeployedComponent object) {
				return createDeployedComponentAdapter();
			}
			@Override
			public Adapter caseDeployedSoftwareSystem(final DeployedSoftwareSystem object) {
				return createDeployedSoftwareSystemAdapter();
			}
			@Override
			public Adapter caseMachine(final Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseDeployedResource(final DeployedResource object) {
				return createDeployedResourceAdapter();
			}
			@Override
			public Adapter caseRuntimeResource(final RuntimeResource object) {
				return createRuntimeResourceAdapter();
			}
			@Override
			public Adapter caseProcess(final org.eclipse.modisco.omg.kdm.platform.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseThread(final org.eclipse.modisco.omg.kdm.platform.Thread object) {
				return createThreadAdapter();
			}
			@Override
			public Adapter caseLoads(final Loads object) {
				return createLoadsAdapter();
			}
			@Override
			public Adapter caseSpawns(final Spawns object) {
				return createSpawnsAdapter();
			}
			@Override
			public Adapter casePlatformElement(final PlatformElement object) {
				return createPlatformElementAdapter();
			}
			@Override
			public Adapter casePlatformRelationship(final PlatformRelationship object) {
				return createPlatformRelationshipAdapter();
			}
			@Override
			public Adapter caseElement(final Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(final ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseKDMFramework(final KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(final KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMEntity(final KDMEntity object) {
				return createKDMEntityAdapter();
			}
			@Override
			public Adapter caseKDMRelationship(final KDMRelationship object) {
				return createKDMRelationshipAdapter();
			}
			@Override
			public Adapter caseAbstractActionRelationship(final AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(final EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target) {
		return this.modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.AbstractPlatformElement <em>Abstract Platform Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.AbstractPlatformElement
	 * @generated
	 */
	public Adapter createAbstractPlatformElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.PlatformModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformModel
	 * @generated
	 */
	public Adapter createPlatformModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.AbstractPlatformRelationship <em>Abstract Platform Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.AbstractPlatformRelationship
	 * @generated
	 */
	public Adapter createAbstractPlatformRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.Requires
	 * @generated
	 */
	public Adapter createRequiresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.NamingResource <em>Naming Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.NamingResource
	 * @generated
	 */
	public Adapter createNamingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.MarshalledResource <em>Marshalled Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.MarshalledResource
	 * @generated
	 */
	public Adapter createMarshalledResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.MessagingResource <em>Messaging Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.MessagingResource
	 * @generated
	 */
	public Adapter createMessagingResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.FileResource <em>File Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.FileResource
	 * @generated
	 */
	public Adapter createFileResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.ExecutionResource <em>Execution Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.ExecutionResource
	 * @generated
	 */
	public Adapter createExecutionResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.PlatformAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformAction
	 * @generated
	 */
	public Adapter createPlatformActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.ExternalActor <em>External Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.ExternalActor
	 * @generated
	 */
	public Adapter createExternalActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.DataManager <em>Data Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.DataManager
	 * @generated
	 */
	public Adapter createDataManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.BindsTo <em>Binds To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.BindsTo
	 * @generated
	 */
	public Adapter createBindsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.PlatformElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformElement
	 * @generated
	 */
	public Adapter createPlatformElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.PlatformRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformRelationship
	 * @generated
	 */
	public Adapter createPlatformRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.PlatformEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformEvent
	 * @generated
	 */
	public Adapter createPlatformEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.LockResource <em>Lock Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.LockResource
	 * @generated
	 */
	public Adapter createLockResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.DeployedSoftwareSystem <em>Deployed Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.DeployedSoftwareSystem
	 * @generated
	 */
	public Adapter createDeployedSoftwareSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.DeployedComponent <em>Deployed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.DeployedComponent
	 * @generated
	 */
	public Adapter createDeployedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.DeployedResource <em>Deployed Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.DeployedResource
	 * @generated
	 */
	public Adapter createDeployedResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.Loads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.Loads
	 * @generated
	 */
	public Adapter createLoadsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.Spawns <em>Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.Spawns
	 * @generated
	 */
	public Adapter createSpawnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.RuntimeResource <em>Runtime Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.RuntimeResource
	 * @generated
	 */
	public Adapter createRuntimeResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.Thread
	 * @generated
	 */
	public Adapter createThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.ReadsResource <em>Reads Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.ReadsResource
	 * @generated
	 */
	public Adapter createReadsResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.WritesResource <em>Writes Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.WritesResource
	 * @generated
	 */
	public Adapter createWritesResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.ManagesResource <em>Manages Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.ManagesResource
	 * @generated
	 */
	public Adapter createManagesResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.DefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.DefinedBy
	 * @generated
	 */
	public Adapter createDefinedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.platform.StreamResource <em>Stream Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.platform.StreamResource
	 * @generated
	 */
	public Adapter createStreamResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.KDMEntity <em>KDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.KDMEntity
	 * @generated
	 */
	public Adapter createKDMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KDMFramework
	 * @generated
	 */
	public Adapter createKDMFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KDMModel
	 * @generated
	 */
	public Adapter createKDMModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.KDMRelationship
	 * @generated
	 */
	public Adapter createKDMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship
	 * @generated
	 */
	public Adapter createAbstractActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlatformAdapterFactory
