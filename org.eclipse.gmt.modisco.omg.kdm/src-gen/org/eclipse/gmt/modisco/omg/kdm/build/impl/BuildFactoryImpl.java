/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.build.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildComponent;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildDescription;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildElement;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildFactory;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildModel;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildProduct;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildRelationship;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildResource;
import org.eclipse.gmt.modisco.omg.kdm.build.BuildStep;
import org.eclipse.gmt.modisco.omg.kdm.build.Consumes;
import org.eclipse.gmt.modisco.omg.kdm.build.DescribedBy;
import org.eclipse.gmt.modisco.omg.kdm.build.Library;
import org.eclipse.gmt.modisco.omg.kdm.build.LinksTo;
import org.eclipse.gmt.modisco.omg.kdm.build.Produces;
import org.eclipse.gmt.modisco.omg.kdm.build.SuppliedBy;
import org.eclipse.gmt.modisco.omg.kdm.build.Supplier;
import org.eclipse.gmt.modisco.omg.kdm.build.SupportedBy;
import org.eclipse.gmt.modisco.omg.kdm.build.SymbolicLink;
import org.eclipse.gmt.modisco.omg.kdm.build.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildFactoryImpl extends EFactoryImpl implements BuildFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuildFactory init() {
		try {
			BuildFactory theBuildFactory = (BuildFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/kdm/build"); //$NON-NLS-1$ 
			if (theBuildFactory != null) {
				return theBuildFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuildFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildFactoryImpl() {
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
			case BuildPackage.BUILD_RESOURCE: return createBuildResource();
			case BuildPackage.BUILD_DESCRIPTION: return createBuildDescription();
			case BuildPackage.SYMBOLIC_LINK: return createSymbolicLink();
			case BuildPackage.LINKS_TO: return createLinksTo();
			case BuildPackage.CONSUMES: return createConsumes();
			case BuildPackage.BUILD_MODEL: return createBuildModel();
			case BuildPackage.BUILD_COMPONENT: return createBuildComponent();
			case BuildPackage.SUPPLIER: return createSupplier();
			case BuildPackage.TOOL: return createTool();
			case BuildPackage.BUILD_ELEMENT: return createBuildElement();
			case BuildPackage.BUILD_RELATIONSHIP: return createBuildRelationship();
			case BuildPackage.SUPPLIED_BY: return createSuppliedBy();
			case BuildPackage.LIBRARY: return createLibrary();
			case BuildPackage.BUILD_STEP: return createBuildStep();
			case BuildPackage.PRODUCES: return createProduces();
			case BuildPackage.SUPPORTED_BY: return createSupportedBy();
			case BuildPackage.BUILD_PRODUCT: return createBuildProduct();
			case BuildPackage.DESCRIBED_BY: return createDescribedBy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildResource createBuildResource() {
		BuildResourceImpl buildResource = new BuildResourceImpl();
		return buildResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildDescription createBuildDescription() {
		BuildDescriptionImpl buildDescription = new BuildDescriptionImpl();
		return buildDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicLink createSymbolicLink() {
		SymbolicLinkImpl symbolicLink = new SymbolicLinkImpl();
		return symbolicLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinksTo createLinksTo() {
		LinksToImpl linksTo = new LinksToImpl();
		return linksTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumes createConsumes() {
		ConsumesImpl consumes = new ConsumesImpl();
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildModel createBuildModel() {
		BuildModelImpl buildModel = new BuildModelImpl();
		return buildModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildComponent createBuildComponent() {
		BuildComponentImpl buildComponent = new BuildComponentImpl();
		return buildComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier createSupplier() {
		SupplierImpl supplier = new SupplierImpl();
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildElement createBuildElement() {
		BuildElementImpl buildElement = new BuildElementImpl();
		return buildElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildRelationship createBuildRelationship() {
		BuildRelationshipImpl buildRelationship = new BuildRelationshipImpl();
		return buildRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliedBy createSuppliedBy() {
		SuppliedByImpl suppliedBy = new SuppliedByImpl();
		return suppliedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildStep createBuildStep() {
		BuildStepImpl buildStep = new BuildStepImpl();
		return buildStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produces createProduces() {
		ProducesImpl produces = new ProducesImpl();
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedBy createSupportedBy() {
		SupportedByImpl supportedBy = new SupportedByImpl();
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildProduct createBuildProduct() {
		BuildProductImpl buildProduct = new BuildProductImpl();
		return buildProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribedBy createDescribedBy() {
		DescribedByImpl describedBy = new DescribedByImpl();
		return describedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildPackage getBuildPackage() {
		return (BuildPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuildPackage getPackage() {
		return BuildPackage.eINSTANCE;
	}

} //BuildFactoryImpl
