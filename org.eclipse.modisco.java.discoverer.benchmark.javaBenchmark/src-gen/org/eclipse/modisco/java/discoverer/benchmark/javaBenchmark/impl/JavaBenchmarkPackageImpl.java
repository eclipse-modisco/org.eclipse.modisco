/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - Bug 341752 - Extract report metamodel from the benchmark plug-in to avoid Acceleo troubles.
 *     Nicolas Bros (Mia-Software) - extracted Java benchmark
 */
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkFactory;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaBenchmarkPackageImpl extends EPackageImpl implements JavaBenchmarkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCDODiscoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractJavaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDiscoveredProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoDiscoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoProjectDiscoveryEClass = null;

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
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaBenchmarkPackageImpl() {
		super(eNS_URI, JavaBenchmarkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaBenchmarkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaBenchmarkPackage init() {
		if (isInited) return (JavaBenchmarkPackage)EPackage.Registry.INSTANCE.getEPackage(JavaBenchmarkPackage.eNS_URI);

		// Obtain or create and register package
		JavaBenchmarkPackageImpl theJavaBenchmarkPackage = (JavaBenchmarkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaBenchmarkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaBenchmarkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BenchmarkPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJavaBenchmarkPackage.createPackageContents();

		// Initialize created meta-data
		theJavaBenchmarkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaBenchmarkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaBenchmarkPackage.eNS_URI, theJavaBenchmarkPackage);
		return theJavaBenchmarkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCDODiscovery() {
		return abstractCDODiscoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCDODiscovery_Version() {
		return (EAttribute)abstractCDODiscoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCDODiscovery_RevisedLruCapacity() {
		return (EAttribute)abstractCDODiscoveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCDODiscovery_CacheType() {
		return (EAttribute)abstractCDODiscoveryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCDODiscovery_ServerDescription() {
		return (EAttribute)abstractCDODiscoveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCDODiscovery_CurrentLruCapacity() {
		return (EAttribute)abstractCDODiscoveryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCDODiscovery_InitTimeInSeconds() {
		return (EAttribute)abstractCDODiscoveryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractJavaProject() {
		return abstractJavaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractJavaProject_AverageJavaClassesPerPackage() {
		return (EAttribute)abstractJavaProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaProject() {
		return javaProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDiscoveredProject() {
		return javaDiscoveredProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDODiscovery() {
		return cdoDiscoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDOProjectDiscovery() {
		return cdoProjectDiscoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBenchmarkFactory getJavaBenchmarkFactory() {
		return (JavaBenchmarkFactory)getEFactoryInstance();
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
		abstractCDODiscoveryEClass = createEClass(ABSTRACT_CDO_DISCOVERY);
		createEAttribute(abstractCDODiscoveryEClass, ABSTRACT_CDO_DISCOVERY__VERSION);
		createEAttribute(abstractCDODiscoveryEClass, ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY);
		createEAttribute(abstractCDODiscoveryEClass, ABSTRACT_CDO_DISCOVERY__CACHE_TYPE);
		createEAttribute(abstractCDODiscoveryEClass, ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION);
		createEAttribute(abstractCDODiscoveryEClass, ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY);
		createEAttribute(abstractCDODiscoveryEClass, ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS);

		abstractJavaProjectEClass = createEClass(ABSTRACT_JAVA_PROJECT);
		createEAttribute(abstractJavaProjectEClass, ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE);

		javaProjectEClass = createEClass(JAVA_PROJECT);

		javaDiscoveredProjectEClass = createEClass(JAVA_DISCOVERED_PROJECT);

		cdoDiscoveryEClass = createEClass(CDO_DISCOVERY);

		cdoProjectDiscoveryEClass = createEClass(CDO_PROJECT_DISCOVERY);
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
		BenchmarkPackage theBenchmarkPackage = (BenchmarkPackage)EPackage.Registry.INSTANCE.getEPackage(BenchmarkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaProjectEClass.getESuperTypes().add(this.getAbstractJavaProject());
		javaProjectEClass.getESuperTypes().add(theBenchmarkPackage.getProject());
		javaDiscoveredProjectEClass.getESuperTypes().add(this.getAbstractJavaProject());
		javaDiscoveredProjectEClass.getESuperTypes().add(theBenchmarkPackage.getDiscoveredProject());
		cdoDiscoveryEClass.getESuperTypes().add(this.getAbstractCDODiscovery());
		cdoDiscoveryEClass.getESuperTypes().add(theBenchmarkPackage.getDiscovery());
		cdoProjectDiscoveryEClass.getESuperTypes().add(this.getAbstractCDODiscovery());
		cdoProjectDiscoveryEClass.getESuperTypes().add(theBenchmarkPackage.getProjectDiscovery());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractCDODiscoveryEClass, AbstractCDODiscovery.class, "AbstractCDODiscovery", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCDODiscovery_Version(), ecorePackage.getEString(), "version", null, 0, 1, AbstractCDODiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCDODiscovery_RevisedLruCapacity(), ecorePackage.getEInt(), "revisedLruCapacity", null, 0, 1, AbstractCDODiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCDODiscovery_CacheType(), ecorePackage.getEString(), "cacheType", null, 0, 1, AbstractCDODiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCDODiscovery_ServerDescription(), ecorePackage.getEString(), "serverDescription", null, 0, 1, AbstractCDODiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCDODiscovery_CurrentLruCapacity(), ecorePackage.getEInt(), "currentLruCapacity", null, 0, 1, AbstractCDODiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCDODiscovery_InitTimeInSeconds(), ecorePackage.getEDouble(), "initTimeInSeconds", null, 0, 1, AbstractCDODiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractJavaProjectEClass, AbstractJavaProject.class, "AbstractJavaProject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractJavaProject_AverageJavaClassesPerPackage(), ecorePackage.getEDouble(), "averageJavaClassesPerPackage", null, 0, 1, AbstractJavaProject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(javaProjectEClass, JavaProject.class, "JavaProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaDiscoveredProjectEClass, JavaDiscoveredProject.class, "JavaDiscoveredProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoDiscoveryEClass, CDODiscovery.class, "CDODiscovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdoProjectDiscoveryEClass, CDOProjectDiscovery.class, "CDOProjectDiscovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaBenchmarkPackageImpl
