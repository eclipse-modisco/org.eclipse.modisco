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
package org.eclipse.modisco.omg.kdm.source.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.action.impl.ActionPackageImpl;
import org.eclipse.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.modisco.omg.kdm.build.impl.BuildPackageImpl;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.code.impl.CodePackageImpl;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualPackageImpl;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.core.impl.CorePackageImpl;
import org.eclipse.modisco.omg.kdm.data.DataPackage;
import org.eclipse.modisco.omg.kdm.data.impl.DataPackageImpl;
import org.eclipse.modisco.omg.kdm.event.EventPackage;
import org.eclipse.modisco.omg.kdm.event.impl.EventPackageImpl;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.modisco.omg.kdm.kdm.impl.KdmPackageImpl;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.platform.impl.PlatformPackageImpl;
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
import org.eclipse.modisco.omg.kdm.source.SourceFactory;
import org.eclipse.modisco.omg.kdm.source.SourceFile;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;
import org.eclipse.modisco.omg.kdm.source.SourceRef;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;
import org.eclipse.modisco.omg.kdm.structure.StructurePackage;
import org.eclipse.modisco.omg.kdm.structure.impl.StructurePackageImpl;
import org.eclipse.modisco.omg.kdm.ui.UiPackage;
import org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourcePackageImpl extends EPackageImpl implements SourcePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInventoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInventoryRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependsOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryRelationshipEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.omg.kdm.source.SourcePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SourcePackageImpl() {
		super(eNS_URI, SourceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SourcePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SourcePackage init() {
		if (isInited) return (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);

		// Obtain or create and register package
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SourcePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		KdmPackageImpl theKdmPackage = (KdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) instanceof KdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) : KdmPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		BuildPackageImpl theBuildPackage = (BuildPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) instanceof BuildPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) : BuildPackage.eINSTANCE);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) : ConceptualPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theSourcePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theKdmPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theActionPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theBuildPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theSourcePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theKdmPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theBuildPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSourcePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SourcePackage.eNS_URI, theSourcePackage);
		return theSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryModel() {
		return inventoryModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventoryModel_InventoryElement() {
		return (EReference)inventoryModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInventoryElement() {
		return abstractInventoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInventoryElement_InventoryRelationship() {
		return (EReference)abstractInventoryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInventoryRelationship() {
		return abstractInventoryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryItem() {
		return inventoryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInventoryItem_Version() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInventoryItem_Path() {
		return (EAttribute)inventoryItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFile() {
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFile_Language() {
		return (EAttribute)sourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFile_Encoding() {
		return (EAttribute)sourceFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDescription() {
		return resourceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryFile() {
		return binaryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableFile() {
		return executableFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryContainer() {
		return inventoryContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventoryContainer_InventoryElement() {
		return (EReference)inventoryContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectory_Path() {
		return (EAttribute)directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependsOn() {
		return dependsOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependsOn_To() {
		return (EReference)dependsOnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependsOn_From() {
		return (EReference)dependsOnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceRef() {
		return sourceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRef_Region() {
		return (EReference)sourceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRef_Language() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRef_Snippet() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceRegion() {
		return sourceRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceRegion_File() {
		return (EReference)sourceRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRegion_StartLine() {
		return (EAttribute)sourceRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRegion_StartPosition() {
		return (EAttribute)sourceRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRegion_EndLine() {
		return (EAttribute)sourceRegionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRegion_EndPosition() {
		return (EAttribute)sourceRegionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRegion_Language() {
		return (EAttribute)sourceRegionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceRegion_Path() {
		return (EAttribute)sourceRegionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryElement() {
		return inventoryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryRelationship() {
		return inventoryRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventoryRelationship_To() {
		return (EReference)inventoryRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventoryRelationship_From() {
		return (EReference)inventoryRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFactory getSourceFactory() {
		return (SourceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		inventoryModelEClass = createEClass(INVENTORY_MODEL);
		createEReference(inventoryModelEClass, INVENTORY_MODEL__INVENTORY_ELEMENT);

		abstractInventoryElementEClass = createEClass(ABSTRACT_INVENTORY_ELEMENT);
		createEReference(abstractInventoryElementEClass, ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP);

		abstractInventoryRelationshipEClass = createEClass(ABSTRACT_INVENTORY_RELATIONSHIP);

		inventoryItemEClass = createEClass(INVENTORY_ITEM);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__VERSION);
		createEAttribute(inventoryItemEClass, INVENTORY_ITEM__PATH);

		sourceFileEClass = createEClass(SOURCE_FILE);
		createEAttribute(sourceFileEClass, SOURCE_FILE__LANGUAGE);
		createEAttribute(sourceFileEClass, SOURCE_FILE__ENCODING);

		imageEClass = createEClass(IMAGE);

		configurationEClass = createEClass(CONFIGURATION);

		resourceDescriptionEClass = createEClass(RESOURCE_DESCRIPTION);

		binaryFileEClass = createEClass(BINARY_FILE);

		executableFileEClass = createEClass(EXECUTABLE_FILE);

		inventoryContainerEClass = createEClass(INVENTORY_CONTAINER);
		createEReference(inventoryContainerEClass, INVENTORY_CONTAINER__INVENTORY_ELEMENT);

		directoryEClass = createEClass(DIRECTORY);
		createEAttribute(directoryEClass, DIRECTORY__PATH);

		projectEClass = createEClass(PROJECT);

		dependsOnEClass = createEClass(DEPENDS_ON);
		createEReference(dependsOnEClass, DEPENDS_ON__TO);
		createEReference(dependsOnEClass, DEPENDS_ON__FROM);

		sourceRefEClass = createEClass(SOURCE_REF);
		createEReference(sourceRefEClass, SOURCE_REF__REGION);
		createEAttribute(sourceRefEClass, SOURCE_REF__LANGUAGE);
		createEAttribute(sourceRefEClass, SOURCE_REF__SNIPPET);

		sourceRegionEClass = createEClass(SOURCE_REGION);
		createEReference(sourceRegionEClass, SOURCE_REGION__FILE);
		createEAttribute(sourceRegionEClass, SOURCE_REGION__START_LINE);
		createEAttribute(sourceRegionEClass, SOURCE_REGION__START_POSITION);
		createEAttribute(sourceRegionEClass, SOURCE_REGION__END_LINE);
		createEAttribute(sourceRegionEClass, SOURCE_REGION__END_POSITION);
		createEAttribute(sourceRegionEClass, SOURCE_REGION__LANGUAGE);
		createEAttribute(sourceRegionEClass, SOURCE_REGION__PATH);

		inventoryElementEClass = createEClass(INVENTORY_ELEMENT);

		inventoryRelationshipEClass = createEClass(INVENTORY_RELATIONSHIP);
		createEReference(inventoryRelationshipEClass, INVENTORY_RELATIONSHIP__TO);
		createEReference(inventoryRelationshipEClass, INVENTORY_RELATIONSHIP__FROM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KdmPackage theKdmPackage = (KdmPackage)EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inventoryModelEClass.getESuperTypes().add(theKdmPackage.getKDMModel());
		abstractInventoryElementEClass.getESuperTypes().add(theCorePackage.getKDMEntity());
		abstractInventoryRelationshipEClass.getESuperTypes().add(theCorePackage.getKDMRelationship());
		inventoryItemEClass.getESuperTypes().add(this.getAbstractInventoryElement());
		sourceFileEClass.getESuperTypes().add(this.getInventoryItem());
		imageEClass.getESuperTypes().add(this.getInventoryItem());
		configurationEClass.getESuperTypes().add(this.getInventoryItem());
		resourceDescriptionEClass.getESuperTypes().add(this.getInventoryItem());
		binaryFileEClass.getESuperTypes().add(this.getInventoryItem());
		executableFileEClass.getESuperTypes().add(this.getInventoryItem());
		inventoryContainerEClass.getESuperTypes().add(this.getAbstractInventoryElement());
		directoryEClass.getESuperTypes().add(this.getInventoryContainer());
		projectEClass.getESuperTypes().add(this.getInventoryContainer());
		dependsOnEClass.getESuperTypes().add(this.getAbstractInventoryRelationship());
		sourceRefEClass.getESuperTypes().add(theCorePackage.getElement());
		sourceRegionEClass.getESuperTypes().add(theCorePackage.getElement());
		inventoryElementEClass.getESuperTypes().add(this.getAbstractInventoryElement());
		inventoryRelationshipEClass.getESuperTypes().add(this.getAbstractInventoryRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(inventoryModelEClass, InventoryModel.class, "InventoryModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInventoryModel_InventoryElement(), this.getAbstractInventoryElement(), null, "inventoryElement", null, 0, -1, InventoryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractInventoryElementEClass, AbstractInventoryElement.class, "AbstractInventoryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstractInventoryElement_InventoryRelationship(), this.getAbstractInventoryRelationship(), null, "inventoryRelationship", null, 0, -1, AbstractInventoryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractInventoryRelationshipEClass, AbstractInventoryRelationship.class, "AbstractInventoryRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(inventoryItemEClass, InventoryItem.class, "InventoryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getInventoryItem_Version(), theCorePackage.getString(), "version", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInventoryItem_Path(), theCorePackage.getString(), "path", null, 0, 1, InventoryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sourceFileEClass, SourceFile.class, "SourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSourceFile_Language(), theCorePackage.getString(), "language", null, 0, 1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceFile_Encoding(), theCorePackage.getString(), "encoding", null, 0, 1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resourceDescriptionEClass, ResourceDescription.class, "ResourceDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(binaryFileEClass, BinaryFile.class, "BinaryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(executableFileEClass, ExecutableFile.class, "ExecutableFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(inventoryContainerEClass, InventoryContainer.class, "InventoryContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInventoryContainer_InventoryElement(), this.getAbstractInventoryElement(), null, "inventoryElement", null, 0, -1, InventoryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDirectory_Path(), theCorePackage.getString(), "path", null, 0, 1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(dependsOnEClass, DependsOn.class, "DependsOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDependsOn_To(), this.getAbstractInventoryElement(), null, "to", null, 1, 1, DependsOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDependsOn_From(), this.getAbstractInventoryElement(), null, "from", null, 1, 1, DependsOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(sourceRefEClass, SourceRef.class, "SourceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSourceRef_Region(), this.getSourceRegion(), null, "region", null, 0, -1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRef_Language(), theCorePackage.getString(), "language", null, 0, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRef_Snippet(), theCorePackage.getString(), "snippet", null, 0, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sourceRegionEClass, SourceRegion.class, "SourceRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSourceRegion_File(), this.getSourceFile(), null, "file", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRegion_StartLine(), theCorePackage.getInteger(), "startLine", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRegion_StartPosition(), theCorePackage.getInteger(), "startPosition", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRegion_EndLine(), theCorePackage.getInteger(), "endLine", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRegion_EndPosition(), theCorePackage.getInteger(), "endPosition", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRegion_Language(), theCorePackage.getString(), "language", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSourceRegion_Path(), theCorePackage.getString(), "path", null, 0, 1, SourceRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(inventoryElementEClass, InventoryElement.class, "InventoryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(inventoryRelationshipEClass, InventoryRelationship.class, "InventoryRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInventoryRelationship_To(), theCorePackage.getKDMEntity(), null, "to", null, 1, 1, InventoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInventoryRelationship_From(), this.getAbstractInventoryElement(), null, "from", null, 1, 1, InventoryRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //SourcePackageImpl
