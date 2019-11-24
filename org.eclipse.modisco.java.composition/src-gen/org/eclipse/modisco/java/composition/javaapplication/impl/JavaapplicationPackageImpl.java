/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *          Fabien Giquel (Mia-Software) - initial API and implementation
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.javaapplication.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaJar2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationFactory;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.eclipse.modisco.kdm.source.extension.ExtensionPackage;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaapplicationPackageImpl extends EPackageImpl implements JavaapplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaNodeSourceRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2FileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2DirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaJar2FileEClass = null;

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
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaapplicationPackageImpl() {
		super(eNS_URI, JavaapplicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaapplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaapplicationPackage init() {
		if (isInited) return (JavaapplicationPackage)EPackage.Registry.INSTANCE.getEPackage(JavaapplicationPackage.eNS_URI);

		// Obtain or create and register package
		JavaapplicationPackageImpl theJavaapplicationPackage = (JavaapplicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaapplicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaapplicationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JavaPackage.eINSTANCE.eClass();
		ExtensionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJavaapplicationPackage.createPackageContents();

		// Initialize created meta-data
		theJavaapplicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaapplicationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaapplicationPackage.eNS_URI, theJavaapplicationPackage);
		return theJavaapplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaNodeSourceRegion() {
		return javaNodeSourceRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaNodeSourceRegion_JavaNode() {
		return (EReference)javaNodeSourceRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava2File() {
		return java2FileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava2File_JavaUnit() {
		return (EReference)java2FileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava2File_Parent() {
		return (EReference)java2FileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaApplication() {
		return javaApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaApplication_JavaModel() {
		return (EReference)javaApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaApplication_DeploymentModel() {
		return (EReference)javaApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaApplication_Java2DirectoryChildren() {
		return (EReference)javaApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaApplication_Jar2FileChildren() {
		return (EReference)javaApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJava2Directory() {
		return java2DirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava2Directory_JavaPackage() {
		return (EReference)java2DirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava2Directory_Directory() {
		return (EReference)java2DirectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava2Directory_Parent() {
		return (EReference)java2DirectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJava2Directory_Java2FileChildren() {
		return (EReference)java2DirectoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaJar2File() {
		return javaJar2FileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaJar2File_JavaArchive() {
		return (EReference)javaJar2FileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaJar2File_File() {
		return (EReference)javaJar2FileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaJar2File_Parent() {
		return (EReference)javaJar2FileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaapplicationFactory getJavaapplicationFactory() {
		return (JavaapplicationFactory)getEFactoryInstance();
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
		javaNodeSourceRegionEClass = createEClass(JAVA_NODE_SOURCE_REGION);
		createEReference(javaNodeSourceRegionEClass, JAVA_NODE_SOURCE_REGION__JAVA_NODE);

		java2FileEClass = createEClass(JAVA2_FILE);
		createEReference(java2FileEClass, JAVA2_FILE__JAVA_UNIT);
		createEReference(java2FileEClass, JAVA2_FILE__PARENT);

		javaApplicationEClass = createEClass(JAVA_APPLICATION);
		createEReference(javaApplicationEClass, JAVA_APPLICATION__JAVA_MODEL);
		createEReference(javaApplicationEClass, JAVA_APPLICATION__DEPLOYMENT_MODEL);
		createEReference(javaApplicationEClass, JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN);
		createEReference(javaApplicationEClass, JAVA_APPLICATION__JAR2_FILE_CHILDREN);

		java2DirectoryEClass = createEClass(JAVA2_DIRECTORY);
		createEReference(java2DirectoryEClass, JAVA2_DIRECTORY__JAVA_PACKAGE);
		createEReference(java2DirectoryEClass, JAVA2_DIRECTORY__DIRECTORY);
		createEReference(java2DirectoryEClass, JAVA2_DIRECTORY__PARENT);
		createEReference(java2DirectoryEClass, JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN);

		javaJar2FileEClass = createEClass(JAVA_JAR2_FILE);
		createEReference(javaJar2FileEClass, JAVA_JAR2_FILE__JAVA_ARCHIVE);
		createEReference(javaJar2FileEClass, JAVA_JAR2_FILE__FILE);
		createEReference(javaJar2FileEClass, JAVA_JAR2_FILE__PARENT);
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
		ExtensionPackage theExtensionPackage = (ExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaNodeSourceRegionEClass.getESuperTypes().add(theExtensionPackage.getASTNodeSourceRegion());
		java2FileEClass.getESuperTypes().add(theExtensionPackage.getCodeUnit2File());

		// Initialize classes and features; add operations and parameters
		initEClass(javaNodeSourceRegionEClass, JavaNodeSourceRegion.class, "JavaNodeSourceRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJavaNodeSourceRegion_JavaNode(), theJavaPackage.getASTNode(), null, "javaNode", null, 1, 1, JavaNodeSourceRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(java2FileEClass, Java2File.class, "Java2File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJava2File_JavaUnit(), theJavaPackage.getCompilationUnit(), null, "javaUnit", null, 1, 1, Java2File.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJava2File_Parent(), this.getJava2Directory(), this.getJava2Directory_Java2FileChildren(), "parent", null, 1, 1, Java2File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(javaApplicationEClass, JavaApplication.class, "JavaApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJavaApplication_JavaModel(), theJavaPackage.getModel(), null, "javaModel", null, 1, 1, JavaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJavaApplication_DeploymentModel(), theSourcePackage.getInventoryModel(), null, "deploymentModel", null, 1, 1, JavaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJavaApplication_Java2DirectoryChildren(), this.getJava2Directory(), this.getJava2Directory_Parent(), "java2DirectoryChildren", null, 0, -1, JavaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJavaApplication_Jar2FileChildren(), this.getJavaJar2File(), this.getJavaJar2File_Parent(), "jar2FileChildren", null, 0, -1, JavaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(java2DirectoryEClass, Java2Directory.class, "Java2Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJava2Directory_JavaPackage(), theJavaPackage.getPackage(), null, "javaPackage", null, 1, 1, Java2Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJava2Directory_Directory(), theSourcePackage.getDirectory(), null, "directory", null, 1, -1, Java2Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJava2Directory_Parent(), this.getJavaApplication(), this.getJavaApplication_Java2DirectoryChildren(), "parent", null, 1, 1, Java2Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJava2Directory_Java2FileChildren(), this.getJava2File(), this.getJava2File_Parent(), "java2FileChildren", null, 0, -1, Java2Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(javaJar2FileEClass, JavaJar2File.class, "JavaJar2File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getJavaJar2File_JavaArchive(), theJavaPackage.getArchive(), null, "javaArchive", null, 1, 1, JavaJar2File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJavaJar2File_File(), theSourcePackage.getBinaryFile(), null, "file", null, 1, 1, JavaJar2File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getJavaJar2File_Parent(), this.getJavaApplication(), this.getJavaApplication_Jar2FileChildren(), "parent", null, 1, 1, JavaJar2File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //JavaapplicationPackageImpl
