/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.jxpath.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery;
import org.eclipse.modisco.infra.query.jxpath.JxpathFactory;
import org.eclipse.modisco.infra.query.jxpath.JxpathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JxpathPackageImpl extends EPackageImpl implements JxpathPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jxPathModelQueryEClass = null;

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
	 * @see org.eclipse.modisco.infra.query.jxpath.JxpathPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JxpathPackageImpl() {
		super(eNS_URI, JxpathFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JxpathPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JxpathPackage init() {
		if (isInited) return (JxpathPackage)EPackage.Registry.INSTANCE.getEPackage(JxpathPackage.eNS_URI);

		// Obtain or create and register package
		JxpathPackageImpl theJxpathPackage = (JxpathPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JxpathPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JxpathPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QueryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJxpathPackage.createPackageContents();

		// Initialize created meta-data
		theJxpathPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJxpathPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JxpathPackage.eNS_URI, theJxpathPackage);
		return theJxpathPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJXPathModelQuery() {
		return jxPathModelQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJXPathModelQuery_Query() {
		return (EAttribute)jxPathModelQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JxpathFactory getJxpathFactory() {
		return (JxpathFactory)getEFactoryInstance();
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
		jxPathModelQueryEClass = createEClass(JX_PATH_MODEL_QUERY);
		createEAttribute(jxPathModelQueryEClass, JX_PATH_MODEL_QUERY__QUERY);
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
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jxPathModelQueryEClass.getESuperTypes().add(theQueryPackage.getModelQuery());

		// Initialize classes and features; add operations and parameters
		initEClass(jxPathModelQueryEClass, JXPathModelQuery.class, "JXPathModelQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getJXPathModelQuery_Query(), ecorePackage.getEString(), "query", null, 0, 1, JXPathModelQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //JxpathPackageImpl
