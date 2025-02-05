/**
 * Copyright (c) 2012,2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements() 
 *    Thomas Cicognani (Soft-Maint) - Bug 441321 - isVisible customisation doesn't work after refreshing a tree
 */
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyFactory;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeproxyPackageImpl extends EPackageImpl implements TreeproxyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectTreeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceTreeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeTreeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureTreeElementEClass = null;

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
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TreeproxyPackageImpl() {
		super(eNS_URI, TreeproxyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TreeproxyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TreeproxyPackage init() {
		if (isInited) return (TreeproxyPackage)EPackage.Registry.INSTANCE.getEPackage(TreeproxyPackage.eNS_URI);

		// Obtain or create and register package
		TreeproxyPackageImpl theTreeproxyPackage = (TreeproxyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TreeproxyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TreeproxyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTreeproxyPackage.createPackageContents();

		// Initialize created meta-data
		theTreeproxyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTreeproxyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TreeproxyPackage.eNS_URI, theTreeproxyPackage);
		return theTreeproxyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeElement() {
		return treeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeElement_Parent() {
		return (EReference)treeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeElement_Children() {
		return (EReference)treeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectTreeElement() {
		return eObjectTreeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectTreeElement_EObject() {
		return (EReference)eObjectTreeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReferenceTreeElement() {
		return eReferenceTreeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReferenceTreeElement_EReference() {
		return (EReference)eReferenceTreeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttributeTreeElement() {
		return eAttributeTreeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttributeTreeElement_EAttribute() {
		return (EReference)eAttributeTreeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeatureTreeElement() {
		return eStructuralFeatureTreeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeatureTreeElement_EStructuralFeature() {
		return (EReference)eStructuralFeatureTreeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeproxyFactory getTreeproxyFactory() {
		return (TreeproxyFactory)getEFactoryInstance();
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
		treeElementEClass = createEClass(TREE_ELEMENT);
		createEReference(treeElementEClass, TREE_ELEMENT__PARENT);
		createEReference(treeElementEClass, TREE_ELEMENT__CHILDREN);

		eObjectTreeElementEClass = createEClass(EOBJECT_TREE_ELEMENT);
		createEReference(eObjectTreeElementEClass, EOBJECT_TREE_ELEMENT__EOBJECT);

		eReferenceTreeElementEClass = createEClass(EREFERENCE_TREE_ELEMENT);
		createEReference(eReferenceTreeElementEClass, EREFERENCE_TREE_ELEMENT__EREFERENCE);

		eAttributeTreeElementEClass = createEClass(EATTRIBUTE_TREE_ELEMENT);
		createEReference(eAttributeTreeElementEClass, EATTRIBUTE_TREE_ELEMENT__EATTRIBUTE);

		eStructuralFeatureTreeElementEClass = createEClass(ESTRUCTURAL_FEATURE_TREE_ELEMENT);
		createEReference(eStructuralFeatureTreeElementEClass, ESTRUCTURAL_FEATURE_TREE_ELEMENT__ESTRUCTURAL_FEATURE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eObjectTreeElementEClass.getESuperTypes().add(this.getTreeElement());
		eReferenceTreeElementEClass.getESuperTypes().add(this.getEStructuralFeatureTreeElement());
		eAttributeTreeElementEClass.getESuperTypes().add(this.getEStructuralFeatureTreeElement());
		eStructuralFeatureTreeElementEClass.getESuperTypes().add(this.getTreeElement());

		// Initialize classes and features; add operations and parameters
		initEClass(treeElementEClass, TreeElement.class, "TreeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTreeElement_Parent(), this.getTreeElement(), this.getTreeElement_Children(), "parent", null, 0, 1, TreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeElement_Children(), this.getTreeElement(), this.getTreeElement_Parent(), "children", null, 0, -1, TreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectTreeElementEClass, EObjectTreeElement.class, "EObjectTreeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectTreeElement_EObject(), ecorePackage.getEObject(), null, "eObject", null, 0, 1, EObjectTreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceTreeElementEClass, EReferenceTreeElement.class, "EReferenceTreeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEReferenceTreeElement_EReference(), theEcorePackage.getEReference(), null, "eReference", null, 0, 1, EReferenceTreeElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eAttributeTreeElementEClass, EAttributeTreeElement.class, "EAttributeTreeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAttributeTreeElement_EAttribute(), theEcorePackage.getEAttribute(), null, "eAttribute", null, 0, 1, EAttributeTreeElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureTreeElementEClass, EStructuralFeatureTreeElement.class, "EStructuralFeatureTreeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEStructuralFeatureTreeElement_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 0, 1, EStructuralFeatureTreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });									
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";								
		addAnnotation
		  (getEReferenceTreeElement_EReference(), 
		   source, 
		   new String[] {
			 "derivation", "self.eStructuralFeature.oclAsType(ecore::EReference)"
		   });				
		addAnnotation
		  (getEAttributeTreeElement_EAttribute(), 
		   source, 
		   new String[] {
			 "derivation", "self.eStructuralFeature.oclAsType(ecore::EAttribute)"
		   });
	}

} //TreeproxyPackageImpl
