/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *
 */
package org.eclipse.modisco.eclipseplugin.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.eclipseplugin.EclipsePlugin;
import org.eclipse.modisco.eclipseplugin.EclipsepluginFactory;
import org.eclipse.modisco.eclipseplugin.EclipsepluginPackage;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.modisco.manifest.ManifestPackage;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.data.DataPackage;
import org.eclipse.modisco.omg.kdm.event.EventPackage;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;
import org.eclipse.modisco.omg.kdm.structure.StructurePackage;
import org.eclipse.modisco.omg.kdm.ui.UiPackage;
import org.eclipse.modisco.xml.emf.MoDiscoXMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclipsepluginPackageImpl extends EPackageImpl implements EclipsepluginPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipsePluginEClass = null;

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
	 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EclipsepluginPackageImpl() {
		super(eNS_URI, EclipsepluginFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EclipsepluginPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EclipsepluginPackage init() {
		if (isInited) return (EclipsepluginPackage)EPackage.Registry.INSTANCE.getEPackage(EclipsepluginPackage.eNS_URI);

		// Obtain or create and register package
		EclipsepluginPackageImpl theEclipsepluginPackage = (EclipsepluginPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EclipsepluginPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EclipsepluginPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JavaPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		KdmPackage.eINSTANCE.eClass();
		SourcePackage.eINSTANCE.eClass();
		CodePackage.eINSTANCE.eClass();
		ActionPackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		BuildPackage.eINSTANCE.eClass();
		ConceptualPackage.eINSTANCE.eClass();
		DataPackage.eINSTANCE.eClass();
		EventPackage.eINSTANCE.eClass();
		StructurePackage.eINSTANCE.eClass();
		UiPackage.eINSTANCE.eClass();
		ManifestPackage.eINSTANCE.eClass();
		MoDiscoXMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEclipsepluginPackage.createPackageContents();

		// Initialize created meta-data
		theEclipsepluginPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEclipsepluginPackage.freeze();


		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EclipsepluginPackage.eNS_URI, theEclipsepluginPackage);
		return theEclipsepluginPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclipsePlugin() {
		return eclipsePluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_Bundle() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_JavaModel() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_InventoryProject() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_ClassPathRoot() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_BuildProperties() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_PluginProperties() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_BundleProperties() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipsePlugin_OutputDirectory() {
		return (EAttribute)eclipsePluginEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipsePlugin_SrcDirectory() {
		return (EAttribute)eclipsePluginEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEclipsePlugin_Name() {
		return (EAttribute)eclipsePluginEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_PluginXml() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEclipsePlugin_Project() {
		return (EReference)eclipsePluginEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclipsepluginFactory getEclipsepluginFactory() {
		return (EclipsepluginFactory)getEFactoryInstance();
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
		eclipsePluginEClass = createEClass(ECLIPSE_PLUGIN);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__BUNDLE);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__JAVA_MODEL);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__INVENTORY_PROJECT);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__CLASS_PATH_ROOT);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__BUILD_PROPERTIES);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__PLUGIN_PROPERTIES);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__BUNDLE_PROPERTIES);
		createEAttribute(eclipsePluginEClass, ECLIPSE_PLUGIN__OUTPUT_DIRECTORY);
		createEAttribute(eclipsePluginEClass, ECLIPSE_PLUGIN__SRC_DIRECTORY);
		createEAttribute(eclipsePluginEClass, ECLIPSE_PLUGIN__NAME);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__PLUGIN_XML);
		createEReference(eclipsePluginEClass, ECLIPSE_PLUGIN__PROJECT);
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
		ManifestPackage theManifestPackage = (ManifestPackage)EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);
		MoDiscoXMLPackage theMoDiscoXMLPackage = (MoDiscoXMLPackage)EPackage.Registry.INSTANCE.getEPackage(MoDiscoXMLPackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(eclipsePluginEClass, EclipsePlugin.class, "EclipsePlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEclipsePlugin_Bundle(), theManifestPackage.getBundle(), null, "bundle", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_JavaModel(), theJavaPackage.getModel(), null, "javaModel", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_InventoryProject(), theSourcePackage.getProject(), null, "inventoryProject", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_ClassPathRoot(), theMoDiscoXMLPackage.getRoot(), null, "classPathRoot", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_BuildProperties(), theCodePackage.getCompilationUnit(), null, "buildProperties", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_PluginProperties(), theCodePackage.getCompilationUnit(), null, "pluginProperties", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_BundleProperties(), theCodePackage.getCompilationUnit(), null, "bundleProperties", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipsePlugin_OutputDirectory(), ecorePackage.getEString(), "outputDirectory", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipsePlugin_SrcDirectory(), ecorePackage.getEString(), "srcDirectory", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipsePlugin_Name(), ecorePackage.getEString(), "name", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_PluginXml(), theMoDiscoXMLPackage.getRoot(), null, "pluginXml", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEclipsePlugin_Project(), theMoDiscoXMLPackage.getRoot(), null, "project", null, 0, 1, EclipsePlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EclipsepluginPackageImpl
