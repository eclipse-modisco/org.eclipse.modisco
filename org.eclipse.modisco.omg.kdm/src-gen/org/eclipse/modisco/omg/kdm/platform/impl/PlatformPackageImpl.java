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
import org.eclipse.modisco.omg.kdm.source.SourcePackage;
import org.eclipse.modisco.omg.kdm.source.impl.SourcePackageImpl;
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
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPlatformElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPlatformRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marshalledResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagingResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindsToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedSoftwareSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spawnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readsResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writesResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managesResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamResourceEClass = null;

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
	 * @see org.eclipse.modisco.omg.kdm.platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlatformPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		KdmPackageImpl theKdmPackage = (KdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) instanceof KdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) : KdmPackage.eINSTANCE);
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) : SourcePackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		BuildPackageImpl theBuildPackage = (BuildPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) instanceof BuildPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) : BuildPackage.eINSTANCE);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) : ConceptualPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theKdmPackage.createPackageContents();
		theSourcePackage.createPackageContents();
		theCodePackage.createPackageContents();
		theActionPackage.createPackageContents();
		theBuildPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theKdmPackage.initializePackageContents();
		theSourcePackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		theBuildPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatformPackage.eNS_URI, thePlatformPackage);
		return thePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPlatformElement() {
		return abstractPlatformElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Source() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_PlatformRelation() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Abstraction() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlatformElement_Implementation() {
		return (EReference)abstractPlatformElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformModel() {
		return platformModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformModel_PlatformElement() {
		return (EReference)platformModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPlatformRelationship() {
		return abstractPlatformRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequires() {
		return requiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_To() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_From() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceType_PlatformElement() {
		return (EReference)resourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingResource() {
		return namingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarshalledResource() {
		return marshalledResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagingResource() {
		return messagingResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileResource() {
		return fileResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionResource() {
		return executionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformAction() {
		return platformActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformAction_Kind() {
		return (EAttribute)platformActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformAction_PlatformElement() {
		return (EReference)platformActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalActor() {
		return externalActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataManager() {
		return dataManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindsTo() {
		return bindsToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindsTo_To() {
		return (EReference)bindsToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindsTo_From() {
		return (EReference)bindsToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformElement() {
		return platformElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformRelationship() {
		return platformRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformRelationship_To() {
		return (EReference)platformRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformRelationship_From() {
		return (EReference)platformRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformEvent() {
		return platformEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformEvent_Kind() {
		return (EAttribute)platformEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLockResource() {
		return lockResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedSoftwareSystem() {
		return deployedSoftwareSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedSoftwareSystem_GroupedComponent() {
		return (EReference)deployedSoftwareSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_DeployedComponent() {
		return (EReference)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_DeployedResource() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedComponent() {
		return deployedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedComponent_GroupedCode() {
		return (EReference)deployedComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedResource() {
		return deployedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployedResource_PlatformElement() {
		return (EReference)deployedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoads() {
		return loadsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoads_To() {
		return (EReference)loadsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoads_From() {
		return (EReference)loadsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpawns() {
		return spawnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpawns_To() {
		return (EReference)spawnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpawns_From() {
		return (EReference)spawnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeResource() {
		return runtimeResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThread() {
		return threadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadsResource() {
		return readsResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadsResource_To() {
		return (EReference)readsResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadsResource_From() {
		return (EReference)readsResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWritesResource() {
		return writesResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritesResource_To() {
		return (EReference)writesResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWritesResource_From() {
		return (EReference)writesResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagesResource() {
		return managesResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagesResource_To() {
		return (EReference)managesResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagesResource_From() {
		return (EReference)managesResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedBy() {
		return definedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedBy_To() {
		return (EReference)definedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedBy_From() {
		return (EReference)definedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamResource() {
		return streamResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
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
		platformModelEClass = createEClass(PLATFORM_MODEL);
		createEReference(platformModelEClass, PLATFORM_MODEL__PLATFORM_ELEMENT);

		abstractPlatformElementEClass = createEClass(ABSTRACT_PLATFORM_ELEMENT);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__SOURCE);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION);
		createEReference(abstractPlatformElementEClass, ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION);

		abstractPlatformRelationshipEClass = createEClass(ABSTRACT_PLATFORM_RELATIONSHIP);

		resourceTypeEClass = createEClass(RESOURCE_TYPE);
		createEReference(resourceTypeEClass, RESOURCE_TYPE__PLATFORM_ELEMENT);

		namingResourceEClass = createEClass(NAMING_RESOURCE);

		marshalledResourceEClass = createEClass(MARSHALLED_RESOURCE);

		messagingResourceEClass = createEClass(MESSAGING_RESOURCE);

		fileResourceEClass = createEClass(FILE_RESOURCE);

		executionResourceEClass = createEClass(EXECUTION_RESOURCE);

		lockResourceEClass = createEClass(LOCK_RESOURCE);

		streamResourceEClass = createEClass(STREAM_RESOURCE);

		dataManagerEClass = createEClass(DATA_MANAGER);

		platformEventEClass = createEClass(PLATFORM_EVENT);
		createEAttribute(platformEventEClass, PLATFORM_EVENT__KIND);

		platformActionEClass = createEClass(PLATFORM_ACTION);
		createEAttribute(platformActionEClass, PLATFORM_ACTION__KIND);
		createEReference(platformActionEClass, PLATFORM_ACTION__PLATFORM_ELEMENT);

		externalActorEClass = createEClass(EXTERNAL_ACTOR);

		bindsToEClass = createEClass(BINDS_TO);
		createEReference(bindsToEClass, BINDS_TO__TO);
		createEReference(bindsToEClass, BINDS_TO__FROM);

		requiresEClass = createEClass(REQUIRES);
		createEReference(requiresEClass, REQUIRES__TO);
		createEReference(requiresEClass, REQUIRES__FROM);

		managesResourceEClass = createEClass(MANAGES_RESOURCE);
		createEReference(managesResourceEClass, MANAGES_RESOURCE__TO);
		createEReference(managesResourceEClass, MANAGES_RESOURCE__FROM);

		readsResourceEClass = createEClass(READS_RESOURCE);
		createEReference(readsResourceEClass, READS_RESOURCE__TO);
		createEReference(readsResourceEClass, READS_RESOURCE__FROM);

		writesResourceEClass = createEClass(WRITES_RESOURCE);
		createEReference(writesResourceEClass, WRITES_RESOURCE__TO);
		createEReference(writesResourceEClass, WRITES_RESOURCE__FROM);

		definedByEClass = createEClass(DEFINED_BY);
		createEReference(definedByEClass, DEFINED_BY__TO);
		createEReference(definedByEClass, DEFINED_BY__FROM);

		deployedComponentEClass = createEClass(DEPLOYED_COMPONENT);
		createEReference(deployedComponentEClass, DEPLOYED_COMPONENT__GROUPED_CODE);

		deployedSoftwareSystemEClass = createEClass(DEPLOYED_SOFTWARE_SYSTEM);
		createEReference(deployedSoftwareSystemEClass, DEPLOYED_SOFTWARE_SYSTEM__GROUPED_COMPONENT);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__DEPLOYED_COMPONENT);
		createEReference(machineEClass, MACHINE__DEPLOYED_RESOURCE);

		deployedResourceEClass = createEClass(DEPLOYED_RESOURCE);
		createEReference(deployedResourceEClass, DEPLOYED_RESOURCE__PLATFORM_ELEMENT);

		runtimeResourceEClass = createEClass(RUNTIME_RESOURCE);

		processEClass = createEClass(PROCESS);

		threadEClass = createEClass(THREAD);

		loadsEClass = createEClass(LOADS);
		createEReference(loadsEClass, LOADS__TO);
		createEReference(loadsEClass, LOADS__FROM);

		spawnsEClass = createEClass(SPAWNS);
		createEReference(spawnsEClass, SPAWNS__TO);
		createEReference(spawnsEClass, SPAWNS__FROM);

		platformElementEClass = createEClass(PLATFORM_ELEMENT);

		platformRelationshipEClass = createEClass(PLATFORM_RELATIONSHIP);
		createEReference(platformRelationshipEClass, PLATFORM_RELATIONSHIP__TO);
		createEReference(platformRelationshipEClass, PLATFORM_RELATIONSHIP__FROM);
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
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		platformModelEClass.getESuperTypes().add(theKdmPackage.getKDMModel());
		abstractPlatformElementEClass.getESuperTypes().add(theCorePackage.getKDMEntity());
		abstractPlatformRelationshipEClass.getESuperTypes().add(theCorePackage.getKDMRelationship());
		resourceTypeEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		namingResourceEClass.getESuperTypes().add(this.getResourceType());
		marshalledResourceEClass.getESuperTypes().add(this.getResourceType());
		messagingResourceEClass.getESuperTypes().add(this.getResourceType());
		fileResourceEClass.getESuperTypes().add(this.getResourceType());
		executionResourceEClass.getESuperTypes().add(this.getResourceType());
		lockResourceEClass.getESuperTypes().add(this.getResourceType());
		streamResourceEClass.getESuperTypes().add(this.getResourceType());
		dataManagerEClass.getESuperTypes().add(this.getResourceType());
		platformEventEClass.getESuperTypes().add(this.getResourceType());
		platformActionEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		externalActorEClass.getESuperTypes().add(this.getPlatformAction());
		bindsToEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		requiresEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		managesResourceEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		readsResourceEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		writesResourceEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		definedByEClass.getESuperTypes().add(theActionPackage.getAbstractActionRelationship());
		deployedComponentEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		deployedSoftwareSystemEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		machineEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		deployedResourceEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		runtimeResourceEClass.getESuperTypes().add(this.getResourceType());
		processEClass.getESuperTypes().add(this.getRuntimeResource());
		threadEClass.getESuperTypes().add(this.getRuntimeResource());
		loadsEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		spawnsEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());
		platformElementEClass.getESuperTypes().add(this.getAbstractPlatformElement());
		platformRelationshipEClass.getESuperTypes().add(this.getAbstractPlatformRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(platformModelEClass, PlatformModel.class, "PlatformModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlatformModel_PlatformElement(), this.getAbstractPlatformElement(), null, "platformElement", null, 0, -1, PlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractPlatformElementEClass, AbstractPlatformElement.class, "AbstractPlatformElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstractPlatformElement_Source(), theSourcePackage.getSourceRef(), null, "source", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractPlatformElement_PlatformRelation(), this.getAbstractPlatformRelationship(), null, "platformRelation", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractPlatformElement_Abstraction(), theActionPackage.getActionElement(), null, "abstraction", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractPlatformElement_Implementation(), theCodePackage.getAbstractCodeElement(), null, "implementation", null, 0, -1, AbstractPlatformElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractPlatformRelationshipEClass, AbstractPlatformRelationship.class, "AbstractPlatformRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getResourceType_PlatformElement(), this.getAbstractPlatformElement(), null, "platformElement", null, 0, -1, ResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(namingResourceEClass, NamingResource.class, "NamingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(marshalledResourceEClass, MarshalledResource.class, "MarshalledResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(messagingResourceEClass, MessagingResource.class, "MessagingResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(fileResourceEClass, FileResource.class, "FileResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(executionResourceEClass, ExecutionResource.class, "ExecutionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(lockResourceEClass, LockResource.class, "LockResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(streamResourceEClass, StreamResource.class, "StreamResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(dataManagerEClass, DataManager.class, "DataManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(platformEventEClass, PlatformEvent.class, "PlatformEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPlatformEvent_Kind(), theCorePackage.getString(), "kind", null, 0, 1, PlatformEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(platformActionEClass, PlatformAction.class, "PlatformAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getPlatformAction_Kind(), theCorePackage.getString(), "kind", null, 0, 1, PlatformAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getPlatformAction_PlatformElement(), this.getPlatformEvent(), null, "platformElement", null, 0, -1, PlatformAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(externalActorEClass, ExternalActor.class, "ExternalActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(bindsToEClass, BindsTo.class, "BindsTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBindsTo_To(), this.getResourceType(), null, "to", null, 1, 1, BindsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBindsTo_From(), this.getResourceType(), null, "from", null, 1, 1, BindsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRequires_To(), this.getAbstractPlatformElement(), null, "to", null, 1, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRequires_From(), this.getDeployedComponent(), null, "from", null, 1, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(managesResourceEClass, ManagesResource.class, "ManagesResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getManagesResource_To(), this.getResourceType(), null, "to", null, 1, 1, ManagesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getManagesResource_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, ManagesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(readsResourceEClass, ReadsResource.class, "ReadsResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getReadsResource_To(), this.getResourceType(), null, "to", null, 1, 1, ReadsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getReadsResource_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, ReadsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(writesResourceEClass, WritesResource.class, "WritesResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWritesResource_To(), this.getResourceType(), null, "to", null, 1, 1, WritesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getWritesResource_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, WritesResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(definedByEClass, DefinedBy.class, "DefinedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDefinedBy_To(), theCodePackage.getCodeItem(), null, "to", null, 1, 1, DefinedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDefinedBy_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, DefinedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(deployedComponentEClass, DeployedComponent.class, "DeployedComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeployedComponent_GroupedCode(), theCodePackage.getModule(), null, "groupedCode", null, 0, -1, DeployedComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(deployedSoftwareSystemEClass, DeployedSoftwareSystem.class, "DeployedSoftwareSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeployedSoftwareSystem_GroupedComponent(), this.getDeployedComponent(), null, "groupedComponent", null, 0, -1, DeployedSoftwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMachine_DeployedComponent(), this.getDeployedComponent(), null, "deployedComponent", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getMachine_DeployedResource(), this.getDeployedResource(), null, "deployedResource", null, 0, -1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(deployedResourceEClass, DeployedResource.class, "DeployedResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDeployedResource_PlatformElement(), this.getResourceType(), null, "platformElement", null, 0, -1, DeployedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(runtimeResourceEClass, RuntimeResource.class, "RuntimeResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(processEClass, org.eclipse.modisco.omg.kdm.platform.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(threadEClass, org.eclipse.modisco.omg.kdm.platform.Thread.class, "Thread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(loadsEClass, Loads.class, "Loads", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLoads_To(), this.getDeployedComponent(), null, "to", null, 1, 1, Loads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getLoads_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, Loads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(spawnsEClass, Spawns.class, "Spawns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSpawns_To(), this.getRuntimeResource(), null, "to", null, 1, 1, Spawns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getSpawns_From(), theActionPackage.getActionElement(), null, "from", null, 1, 1, Spawns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(platformElementEClass, PlatformElement.class, "PlatformElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(platformRelationshipEClass, PlatformRelationship.class, "PlatformRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlatformRelationship_To(), theCorePackage.getKDMEntity(), null, "to", null, 1, 1, PlatformRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getPlatformRelationship_From(), this.getAbstractPlatformElement(), null, "from", null, 1, 1, PlatformRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //PlatformPackageImpl
