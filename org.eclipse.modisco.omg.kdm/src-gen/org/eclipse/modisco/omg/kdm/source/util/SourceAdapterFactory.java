/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.source.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.kdm.core.Element;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.modisco.omg.kdm.core.ModelElement;
import org.eclipse.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryRelationship;
import org.eclipse.modisco.omg.kdm.source.BinaryFile;
import org.eclipse.modisco.omg.kdm.source.Configuration;
import org.eclipse.modisco.omg.kdm.source.DependsOn;
import org.eclipse.modisco.omg.kdm.source.Directory;
import org.eclipse.modisco.omg.kdm.source.ExecutableFile;
import org.eclipse.modisco.omg.kdm.source.Image;
import org.eclipse.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.modisco.omg.kdm.source.InventoryElement;
import org.eclipse.modisco.omg.kdm.source.InventoryItem;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.modisco.omg.kdm.source.InventoryRelationship;
import org.eclipse.modisco.omg.kdm.source.Project;
import org.eclipse.modisco.omg.kdm.source.ResourceDescription;
import org.eclipse.modisco.omg.kdm.source.SourceFile;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;
import org.eclipse.modisco.omg.kdm.source.SourceRef;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage
 * @generated
 */
@SuppressWarnings("all")
public class SourceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SourcePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceAdapterFactory() {
		if (SourceAdapterFactory.modelPackage == null) {
			SourceAdapterFactory.modelPackage = SourcePackage.eINSTANCE;
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
		if (object == SourceAdapterFactory.modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == SourceAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceSwitch<Adapter> modelSwitch =
		new SourceSwitch<Adapter>() {
			@Override
			public Adapter caseInventoryModel(final InventoryModel object) {
				return createInventoryModelAdapter();
			}
			@Override
			public Adapter caseAbstractInventoryElement(final AbstractInventoryElement object) {
				return createAbstractInventoryElementAdapter();
			}
			@Override
			public Adapter caseAbstractInventoryRelationship(final AbstractInventoryRelationship object) {
				return createAbstractInventoryRelationshipAdapter();
			}
			@Override
			public Adapter caseInventoryItem(final InventoryItem object) {
				return createInventoryItemAdapter();
			}
			@Override
			public Adapter caseSourceFile(final SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter caseImage(final Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseConfiguration(final Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseResourceDescription(final ResourceDescription object) {
				return createResourceDescriptionAdapter();
			}
			@Override
			public Adapter caseBinaryFile(final BinaryFile object) {
				return createBinaryFileAdapter();
			}
			@Override
			public Adapter caseExecutableFile(final ExecutableFile object) {
				return createExecutableFileAdapter();
			}
			@Override
			public Adapter caseInventoryContainer(final InventoryContainer object) {
				return createInventoryContainerAdapter();
			}
			@Override
			public Adapter caseDirectory(final Directory object) {
				return createDirectoryAdapter();
			}
			@Override
			public Adapter caseProject(final Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseDependsOn(final DependsOn object) {
				return createDependsOnAdapter();
			}
			@Override
			public Adapter caseSourceRef(final SourceRef object) {
				return createSourceRefAdapter();
			}
			@Override
			public Adapter caseSourceRegion(final SourceRegion object) {
				return createSourceRegionAdapter();
			}
			@Override
			public Adapter caseInventoryElement(final InventoryElement object) {
				return createInventoryElementAdapter();
			}
			@Override
			public Adapter caseInventoryRelationship(final InventoryRelationship object) {
				return createInventoryRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.InventoryModel <em>Inventory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.InventoryModel
	 * @generated
	 */
	public Adapter createInventoryModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement <em>Abstract Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement
	 * @generated
	 */
	public Adapter createAbstractInventoryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.AbstractInventoryRelationship <em>Abstract Inventory Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.AbstractInventoryRelationship
	 * @generated
	 */
	public Adapter createAbstractInventoryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.InventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.InventoryItem
	 * @generated
	 */
	public Adapter createInventoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.SourceFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.ResourceDescription
	 * @generated
	 */
	public Adapter createResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.BinaryFile <em>Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.BinaryFile
	 * @generated
	 */
	public Adapter createBinaryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.ExecutableFile <em>Executable File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.ExecutableFile
	 * @generated
	 */
	public Adapter createExecutableFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.InventoryContainer <em>Inventory Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.InventoryContainer
	 * @generated
	 */
	public Adapter createInventoryContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.DependsOn
	 * @generated
	 */
	public Adapter createDependsOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.SourceRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.SourceRef
	 * @generated
	 */
	public Adapter createSourceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.SourceRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.SourceRegion
	 * @generated
	 */
	public Adapter createSourceRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.InventoryElement <em>Inventory Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.InventoryElement
	 * @generated
	 */
	public Adapter createInventoryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.source.InventoryRelationship <em>Inventory Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.source.InventoryRelationship
	 * @generated
	 */
	public Adapter createInventoryRelationshipAdapter() {
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

} //SourceAdapterFactory
