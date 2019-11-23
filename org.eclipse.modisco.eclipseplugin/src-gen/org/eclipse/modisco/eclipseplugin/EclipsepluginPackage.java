/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *
 */
package org.eclipse.modisco.eclipseplugin;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.eclipseplugin.EclipsepluginFactory
 * @model kind="package"
 * @generated
 */
public interface EclipsepluginPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eclipseplugin";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/eclipseplugin";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eclipseplugin";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclipsepluginPackage eINSTANCE = org.eclipse.modisco.eclipseplugin.impl.EclipsepluginPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl <em>Eclipse Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl
	 * @see org.eclipse.modisco.eclipseplugin.impl.EclipsepluginPackageImpl#getEclipsePlugin()
	 * @generated
	 */
	int ECLIPSE_PLUGIN = 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__BUNDLE = 0;

	/**
	 * The feature id for the '<em><b>Java Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__JAVA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Inventory Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__INVENTORY_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Class Path Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__CLASS_PATH_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Build Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__BUILD_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Plugin Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__PLUGIN_PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Bundle Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__BUNDLE_PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Output Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__OUTPUT_DIRECTORY = 7;

	/**
	 * The feature id for the '<em><b>Src Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__SRC_DIRECTORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__NAME = 9;

	/**
	 * The feature id for the '<em><b>Plugin Xml</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__PLUGIN_XML = 10;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN__PROJECT = 11;

	/**
	 * The number of structural features of the '<em>Eclipse Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_PLUGIN_FEATURE_COUNT = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin <em>Eclipse Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Plugin</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin
	 * @generated
	 */
	EClass getEclipsePlugin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundle()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_Bundle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getJavaModel <em>Java Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Model</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getJavaModel()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_JavaModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getInventoryProject <em>Inventory Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Project</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getInventoryProject()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_InventoryProject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getClassPathRoot <em>Class Path Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Path Root</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getClassPathRoot()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_ClassPathRoot();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBuildProperties <em>Build Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Build Properties</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBuildProperties()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_BuildProperties();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginProperties <em>Plugin Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugin Properties</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginProperties()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_PluginProperties();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundleProperties <em>Bundle Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Properties</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getBundleProperties()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_BundleProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getOutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Directory</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getOutputDirectory()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EAttribute getEclipsePlugin_OutputDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getSrcDirectory <em>Src Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Directory</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getSrcDirectory()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EAttribute getEclipsePlugin_SrcDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getName()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EAttribute getEclipsePlugin_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginXml <em>Plugin Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plugin Xml</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getPluginXml()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_PluginXml();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.eclipseplugin.EclipsePlugin#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.eclipse.modisco.eclipseplugin.EclipsePlugin#getProject()
	 * @see #getEclipsePlugin()
	 * @generated
	 */
	EReference getEclipsePlugin_Project();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EclipsepluginFactory getEclipsepluginFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl <em>Eclipse Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.eclipseplugin.impl.EclipsePluginImpl
		 * @see org.eclipse.modisco.eclipseplugin.impl.EclipsepluginPackageImpl#getEclipsePlugin()
		 * @generated
		 */
		EClass ECLIPSE_PLUGIN = eINSTANCE.getEclipsePlugin();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__BUNDLE = eINSTANCE.getEclipsePlugin_Bundle();

		/**
		 * The meta object literal for the '<em><b>Java Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__JAVA_MODEL = eINSTANCE.getEclipsePlugin_JavaModel();

		/**
		 * The meta object literal for the '<em><b>Inventory Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__INVENTORY_PROJECT = eINSTANCE.getEclipsePlugin_InventoryProject();

		/**
		 * The meta object literal for the '<em><b>Class Path Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__CLASS_PATH_ROOT = eINSTANCE.getEclipsePlugin_ClassPathRoot();

		/**
		 * The meta object literal for the '<em><b>Build Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__BUILD_PROPERTIES = eINSTANCE.getEclipsePlugin_BuildProperties();

		/**
		 * The meta object literal for the '<em><b>Plugin Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__PLUGIN_PROPERTIES = eINSTANCE.getEclipsePlugin_PluginProperties();

		/**
		 * The meta object literal for the '<em><b>Bundle Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__BUNDLE_PROPERTIES = eINSTANCE.getEclipsePlugin_BundleProperties();

		/**
		 * The meta object literal for the '<em><b>Output Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_PLUGIN__OUTPUT_DIRECTORY = eINSTANCE.getEclipsePlugin_OutputDirectory();

		/**
		 * The meta object literal for the '<em><b>Src Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_PLUGIN__SRC_DIRECTORY = eINSTANCE.getEclipsePlugin_SrcDirectory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_PLUGIN__NAME = eINSTANCE.getEclipsePlugin_Name();

		/**
		 * The meta object literal for the '<em><b>Plugin Xml</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__PLUGIN_XML = eINSTANCE.getEclipsePlugin_PluginXml();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLIPSE_PLUGIN__PROJECT = eINSTANCE.getEclipsePlugin_Project();

	}

} //EclipsepluginPackage
