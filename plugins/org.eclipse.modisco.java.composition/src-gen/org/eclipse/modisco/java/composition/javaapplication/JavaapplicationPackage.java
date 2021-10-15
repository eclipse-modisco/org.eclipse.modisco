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
package org.eclipse.modisco.java.composition.javaapplication;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.modisco.kdm.source.extension.ExtensionPackage;

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
 * @see org.eclipse.modisco.java.composition.javaapplication.JavaapplicationFactory
 * @model kind="package"
 * @generated
 */
public interface JavaapplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaapplication"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Java/Composition/0.1.incubation/javaApplication"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaapplication"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaapplicationPackage eINSTANCE = org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaNodeSourceRegionImpl <em>Java Node Source Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaNodeSourceRegionImpl
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJavaNodeSourceRegion()
	 * @generated
	 */
	int JAVA_NODE_SOURCE_REGION = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__ATTRIBUTE = ExtensionPackage.AST_NODE_SOURCE_REGION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__ANNOTATION = ExtensionPackage.AST_NODE_SOURCE_REGION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__FILE = ExtensionPackage.AST_NODE_SOURCE_REGION__FILE;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__START_LINE = ExtensionPackage.AST_NODE_SOURCE_REGION__START_LINE;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__START_POSITION = ExtensionPackage.AST_NODE_SOURCE_REGION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__END_LINE = ExtensionPackage.AST_NODE_SOURCE_REGION__END_LINE;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__END_POSITION = ExtensionPackage.AST_NODE_SOURCE_REGION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__LANGUAGE = ExtensionPackage.AST_NODE_SOURCE_REGION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__PATH = ExtensionPackage.AST_NODE_SOURCE_REGION__PATH;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__NODE = ExtensionPackage.AST_NODE_SOURCE_REGION__NODE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__PARENT = ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT;

	/**
	 * The feature id for the '<em><b>Java Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION__JAVA_NODE = ExtensionPackage.AST_NODE_SOURCE_REGION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Node Source Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_NODE_SOURCE_REGION_FEATURE_COUNT = ExtensionPackage.AST_NODE_SOURCE_REGION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2FileImpl <em>Java2 File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.Java2FileImpl
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJava2File()
	 * @generated
	 */
	int JAVA2_FILE = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_FILE__FILE = ExtensionPackage.CODE_UNIT2_FILE__FILE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_FILE__CHILDREN = ExtensionPackage.CODE_UNIT2_FILE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_FILE__UNIT = ExtensionPackage.CODE_UNIT2_FILE__UNIT;

	/**
	 * The feature id for the '<em><b>Java Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_FILE__JAVA_UNIT = ExtensionPackage.CODE_UNIT2_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_FILE__PARENT = ExtensionPackage.CODE_UNIT2_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java2 File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_FILE_FEATURE_COUNT = ExtensionPackage.CODE_UNIT2_FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl <em>Java Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJavaApplication()
	 * @generated
	 */
	int JAVA_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Java Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_APPLICATION__JAVA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Deployment Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_APPLICATION__DEPLOYMENT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Java2 Directory Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Jar2 File Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_APPLICATION__JAR2_FILE_CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Java Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl <em>Java2 Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJava2Directory()
	 * @generated
	 */
	int JAVA2_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Java Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DIRECTORY__JAVA_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DIRECTORY__DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DIRECTORY__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Java2 File Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN = 3;

	/**
	 * The number of structural features of the '<em>Java2 Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2_DIRECTORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl <em>Java Jar2 File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl
	 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJavaJar2File()
	 * @generated
	 */
	int JAVA_JAR2_FILE = 4;

	/**
	 * The feature id for the '<em><b>Java Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_JAR2_FILE__JAVA_ARCHIVE = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_JAR2_FILE__FILE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_JAR2_FILE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Java Jar2 File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_JAR2_FILE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion <em>Java Node Source Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Node Source Region</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion
	 * @generated
	 */
	EClass getJavaNodeSourceRegion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion#getJavaNode <em>Java Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Node</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion#getJavaNode()
	 * @see #getJavaNodeSourceRegion()
	 * @generated
	 */
	EReference getJavaNodeSourceRegion_JavaNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.composition.javaapplication.Java2File <em>Java2 File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java2 File</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2File
	 * @generated
	 */
	EClass getJava2File();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.Java2File#getJavaUnit <em>Java Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Unit</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2File#getJavaUnit()
	 * @see #getJava2File()
	 * @generated
	 */
	EReference getJava2File_JavaUnit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.Java2File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2File#getParent()
	 * @see #getJava2File()
	 * @generated
	 */
	EReference getJava2File_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication <em>Java Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Application</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication
	 * @generated
	 */
	EClass getJavaApplication();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJavaModel <em>Java Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Model</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJavaModel()
	 * @see #getJavaApplication()
	 * @generated
	 */
	EReference getJavaApplication_JavaModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getDeploymentModel <em>Deployment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment Model</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getDeploymentModel()
	 * @see #getJavaApplication()
	 * @generated
	 */
	EReference getJavaApplication_DeploymentModel();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJava2DirectoryChildren <em>Java2 Directory Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Java2 Directory Children</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJava2DirectoryChildren()
	 * @see #getJavaApplication()
	 * @generated
	 */
	EReference getJavaApplication_Java2DirectoryChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJar2FileChildren <em>Jar2 File Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jar2 File Children</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaApplication#getJar2FileChildren()
	 * @see #getJavaApplication()
	 * @generated
	 */
	EReference getJavaApplication_Jar2FileChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory <em>Java2 Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java2 Directory</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory
	 * @generated
	 */
	EClass getJava2Directory();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJavaPackage <em>Java Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Package</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJavaPackage()
	 * @see #getJava2Directory()
	 * @generated
	 */
	EReference getJava2Directory_JavaPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directory</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getDirectory()
	 * @see #getJava2Directory()
	 * @generated
	 */
	EReference getJava2Directory_Directory();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getParent()
	 * @see #getJava2Directory()
	 * @generated
	 */
	EReference getJava2Directory_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJava2FileChildren <em>Java2 File Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Java2 File Children</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.Java2Directory#getJava2FileChildren()
	 * @see #getJava2Directory()
	 * @generated
	 */
	EReference getJava2Directory_Java2FileChildren();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File <em>Java Jar2 File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Jar2 File</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaJar2File
	 * @generated
	 */
	EClass getJavaJar2File();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getJavaArchive <em>Java Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Java Archive</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getJavaArchive()
	 * @see #getJavaJar2File()
	 * @generated
	 */
	EReference getJavaJar2File_JavaArchive();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getFile()
	 * @see #getJavaJar2File()
	 * @generated
	 */
	EReference getJavaJar2File_File();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.java.composition.javaapplication.JavaJar2File#getParent()
	 * @see #getJavaJar2File()
	 * @generated
	 */
	EReference getJavaJar2File_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaapplicationFactory getJavaapplicationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaNodeSourceRegionImpl <em>Java Node Source Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaNodeSourceRegionImpl
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJavaNodeSourceRegion()
		 * @generated
		 */
		EClass JAVA_NODE_SOURCE_REGION = eINSTANCE.getJavaNodeSourceRegion();

		/**
		 * The meta object literal for the '<em><b>Java Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_NODE_SOURCE_REGION__JAVA_NODE = eINSTANCE.getJavaNodeSourceRegion_JavaNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2FileImpl <em>Java2 File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.Java2FileImpl
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJava2File()
		 * @generated
		 */
		EClass JAVA2_FILE = eINSTANCE.getJava2File();

		/**
		 * The meta object literal for the '<em><b>Java Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2_FILE__JAVA_UNIT = eINSTANCE.getJava2File_JavaUnit();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2_FILE__PARENT = eINSTANCE.getJava2File_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl <em>Java Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaApplicationImpl
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJavaApplication()
		 * @generated
		 */
		EClass JAVA_APPLICATION = eINSTANCE.getJavaApplication();

		/**
		 * The meta object literal for the '<em><b>Java Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_APPLICATION__JAVA_MODEL = eINSTANCE.getJavaApplication_JavaModel();

		/**
		 * The meta object literal for the '<em><b>Deployment Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_APPLICATION__DEPLOYMENT_MODEL = eINSTANCE.getJavaApplication_DeploymentModel();

		/**
		 * The meta object literal for the '<em><b>Java2 Directory Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_APPLICATION__JAVA2_DIRECTORY_CHILDREN = eINSTANCE.getJavaApplication_Java2DirectoryChildren();

		/**
		 * The meta object literal for the '<em><b>Jar2 File Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_APPLICATION__JAR2_FILE_CHILDREN = eINSTANCE.getJavaApplication_Jar2FileChildren();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl <em>Java2 Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.Java2DirectoryImpl
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJava2Directory()
		 * @generated
		 */
		EClass JAVA2_DIRECTORY = eINSTANCE.getJava2Directory();

		/**
		 * The meta object literal for the '<em><b>Java Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2_DIRECTORY__JAVA_PACKAGE = eINSTANCE.getJava2Directory_JavaPackage();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2_DIRECTORY__DIRECTORY = eINSTANCE.getJava2Directory_Directory();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2_DIRECTORY__PARENT = eINSTANCE.getJava2Directory_Parent();

		/**
		 * The meta object literal for the '<em><b>Java2 File Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2_DIRECTORY__JAVA2_FILE_CHILDREN = eINSTANCE.getJava2Directory_Java2FileChildren();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl <em>Java Jar2 File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaJar2FileImpl
		 * @see org.eclipse.modisco.java.composition.javaapplication.impl.JavaapplicationPackageImpl#getJavaJar2File()
		 * @generated
		 */
		EClass JAVA_JAR2_FILE = eINSTANCE.getJavaJar2File();

		/**
		 * The meta object literal for the '<em><b>Java Archive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_JAR2_FILE__JAVA_ARCHIVE = eINSTANCE.getJavaJar2File_JavaArchive();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_JAR2_FILE__FILE = eINSTANCE.getJavaJar2File_File();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_JAR2_FILE__PARENT = eINSTANCE.getJavaJar2File_Parent();

	}

} //JavaapplicationPackage
