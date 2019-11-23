/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.kdm.source.extension.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/kdmsourceextension/0.1.incubation/kdm/source/extension"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = org.eclipse.modisco.kdm.source.extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl <em>AST Node Source Region</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl
	 * @see org.eclipse.modisco.kdm.source.extension.impl.ExtensionPackageImpl#getASTNodeSourceRegion()
	 * @generated
	 */
	int AST_NODE_SOURCE_REGION = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__ATTRIBUTE = SourcePackage.SOURCE_REGION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__ANNOTATION = SourcePackage.SOURCE_REGION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__FILE = SourcePackage.SOURCE_REGION__FILE;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__START_LINE = SourcePackage.SOURCE_REGION__START_LINE;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__START_POSITION = SourcePackage.SOURCE_REGION__START_POSITION;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__END_LINE = SourcePackage.SOURCE_REGION__END_LINE;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__END_POSITION = SourcePackage.SOURCE_REGION__END_POSITION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__LANGUAGE = SourcePackage.SOURCE_REGION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__PATH = SourcePackage.SOURCE_REGION__PATH;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__NODE = SourcePackage.SOURCE_REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION__PARENT = SourcePackage.SOURCE_REGION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AST Node Source Region</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_SOURCE_REGION_FEATURE_COUNT = SourcePackage.SOURCE_REGION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.kdm.source.extension.impl.CodeUnit2FileImpl <em>Code Unit2 File</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.modisco.kdm.source.extension.impl.CodeUnit2FileImpl
	 * @see org.eclipse.modisco.kdm.source.extension.impl.ExtensionPackageImpl#getCodeUnit2File()
	 * @generated
	 */
	int CODE_UNIT2_FILE = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT2_FILE__FILE = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT2_FILE__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT2_FILE__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Code Unit2 File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT2_FILE_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion <em>AST Node Source Region</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AST Node Source Region</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion
	 * @generated
	 */
	EClass getASTNodeSourceRegion();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getNode()
	 * @see #getASTNodeSourceRegion()
	 * @generated
	 */
	EReference getASTNodeSourceRegion_Node();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getParent()
	 * @see #getASTNodeSourceRegion()
	 * @generated
	 */
	EReference getASTNodeSourceRegion_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File <em>Code Unit2 File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Unit2 File</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.CodeUnit2File
	 * @generated
	 */
	EClass getCodeUnit2File();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getFile <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getFile()
	 * @see #getCodeUnit2File()
	 * @generated
	 */
	EReference getCodeUnit2File_File();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getChildren()
	 * @see #getCodeUnit2File()
	 * @generated
	 */
	EReference getCodeUnit2File_Children();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getUnit()
	 * @see #getCodeUnit2File()
	 * @generated
	 */
	EReference getCodeUnit2File_Unit();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl <em>AST Node Source Region</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl
		 * @see org.eclipse.modisco.kdm.source.extension.impl.ExtensionPackageImpl#getASTNodeSourceRegion()
		 * @generated
		 */
		EClass AST_NODE_SOURCE_REGION = eINSTANCE.getASTNodeSourceRegion();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AST_NODE_SOURCE_REGION__NODE = eINSTANCE.getASTNodeSourceRegion_Node();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AST_NODE_SOURCE_REGION__PARENT = eINSTANCE.getASTNodeSourceRegion_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.kdm.source.extension.impl.CodeUnit2FileImpl <em>Code Unit2 File</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.modisco.kdm.source.extension.impl.CodeUnit2FileImpl
		 * @see org.eclipse.modisco.kdm.source.extension.impl.ExtensionPackageImpl#getCodeUnit2File()
		 * @generated
		 */
		EClass CODE_UNIT2_FILE = eINSTANCE.getCodeUnit2File();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT2_FILE__FILE = eINSTANCE.getCodeUnit2File_File();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT2_FILE__CHILDREN = eINSTANCE.getCodeUnit2File_Children();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_UNIT2_FILE__UNIT = eINSTANCE.getCodeUnit2File_Unit();

	}

} // ExtensionPackage
