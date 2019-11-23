/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * 
 * @see org.eclipse.modisco.omg.gastm.GASTMFactory
 * @model kind="package"
 * @generated
 */
public interface GASTMPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "gastm"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/GASTM/1.0.Beta2/gastm"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "gastm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	GASTMPackage eINSTANCE = org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.GASTMObjectImpl
	 * <em>Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getGASTMObject()
	 * @generated
	 */
	int GASTM_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.GASTMSourceObjectImpl
	 * <em>Source Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMSourceObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getGASTMSourceObject()
	 * @generated
	 */
	int GASTM_SOURCE_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Source Object</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_SOURCE_OBJECT_FEATURE_COUNT = GASTM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.GASTMSemanticObjectImpl
	 * <em>Semantic Object</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMSemanticObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getGASTMSemanticObject()
	 * @generated
	 */
	int GASTM_SEMANTIC_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Semantic Object</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_SEMANTIC_OBJECT_FEATURE_COUNT = GASTM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.GASTMSyntaxObjectImpl
	 * <em>Syntax Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMSyntaxObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getGASTMSyntaxObject()
	 * @generated
	 */
	int GASTM_SYNTAX_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT__LOCATION_INFO = GASTM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS = GASTM_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT__ANNOTATIONS = GASTM_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Syntax Object</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GASTM_SYNTAX_OBJECT_FEATURE_COUNT = GASTM_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.SourceFileImpl
	 * <em>Source File</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.SourceFileImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__PATH = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl
	 * <em>Source Location</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getSourceLocation()
	 * @generated
	 */
	int SOURCE_LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__START_LINE = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__START_POSITION = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__END_LINE = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__END_POSITION = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Source File</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION__IN_SOURCE_FILE = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Source Location</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_LOCATION_FEATURE_COUNT = GASTM_SOURCE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CompilationUnitImpl
	 * <em>Compilation Unit</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CompilationUnitImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PATH = SOURCE_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__LANGUAGE = SOURCE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__FRAGMENTS = SOURCE_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__OPENS_SCOPE = SOURCE_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = SOURCE_FILE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.SourceFileReferenceImpl
	 * <em>Source File Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.SourceFileReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getSourceFileReference()
	 * @generated
	 */
	int SOURCE_FILE_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_REFERENCE__PATH = SOURCE_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_REFERENCE__LOCATION_INFO = SOURCE_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Of Source File</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_REFERENCE__OF_SOURCE_FILE = SOURCE_FILE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source File Reference</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_REFERENCE_FEATURE_COUNT = SOURCE_FILE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ProjectImpl <em>Project</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ProjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 8;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT__FILES = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT__OUTER_SCOPE = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ScopeImpl <em>Scope</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ScopeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 9;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCOPE__DEFINITION_OBJECT = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCOPE__CHILD_SCOPE = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scope</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = GASTM_SEMANTIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ProgramScopeImpl
	 * <em>Program Scope</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ProgramScopeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getProgramScope()
	 * @generated
	 */
	int PROGRAM_SCOPE = 10;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Program Scope</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionScopeImpl
	 * <em>Function Scope</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionScopeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionScope()
	 * @generated
	 */
	int FUNCTION_SCOPE = 11;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Function Scope</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AggregateScopeImpl
	 * <em>Aggregate Scope</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AggregateScopeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAggregateScope()
	 * @generated
	 */
	int AGGREGATE_SCOPE = 12;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Aggregate Scope</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BlockScopeImpl
	 * <em>Block Scope</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BlockScopeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBlockScope()
	 * @generated
	 */
	int BLOCK_SCOPE = 13;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Block Scope</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.GlobalScopeImpl
	 * <em>Global Scope</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.GlobalScopeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getGlobalScope()
	 * @generated
	 */
	int GLOBAL_SCOPE = 14;

	/**
	 * The feature id for the '<em><b>Definition Object</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE__DEFINITION_OBJECT = SCOPE__DEFINITION_OBJECT;

	/**
	 * The feature id for the '<em><b>Child Scope</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE__CHILD_SCOPE = SCOPE__CHILD_SCOPE;

	/**
	 * The number of structural features of the '<em>Global Scope</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PreprocessorElementImpl
	 * <em>Preprocessor Element</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PreprocessorElementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPreprocessorElement()
	 * @generated
	 */
	int PREPROCESSOR_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Preprocessor Element</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREPROCESSOR_ELEMENT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DefinitionObjectImpl
	 * <em>Definition Object</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DefinitionObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDefinitionObject()
	 * @generated
	 */
	int DEFINITION_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Definition Object</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OBJECT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_CONST = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ExpressionImpl
	 * <em>Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_TYPE = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.StatementImpl
	 * <em>Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.StatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Statement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.MinorSyntaxObjectImpl
	 * <em>Minor Syntax Object</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.MinorSyntaxObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getMinorSyntaxObject()
	 * @generated
	 */
	int MINOR_SYNTAX_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MINOR_SYNTAX_OBJECT__LOCATION_INFO = GASTM_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS = GASTM_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MINOR_SYNTAX_OBJECT__ANNOTATIONS = GASTM_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Minor Syntax Object</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MINOR_SYNTAX_OBJECT_FEATURE_COUNT = GASTM_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DimensionImpl
	 * <em>Dimension</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DimensionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 21;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Low Bound</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LOW_BOUND = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High Bound</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION__HIGH_BOUND = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NameImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 22;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name String</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME__NAME_STRING = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.SwitchCaseImpl
	 * <em>Switch Case</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.SwitchCaseImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 23;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Evaluate All Cases</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__IS_EVALUATE_ALL_CASES = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__BODY = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CatchBlockImpl
	 * <em>Catch Block</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CatchBlockImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCatchBlock()
	 * @generated
	 */
	int CATCH_BLOCK = 24;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK__BODY = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catch Block</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATCH_BLOCK_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.UnaryOperatorImpl
	 * <em>Unary Operator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.UnaryOperatorImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 25;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BinaryOperatorImpl
	 * <em>Binary Operator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BinaryOperatorImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 26;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.StorageSpecificationImpl
	 * <em>Storage Specification</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.StorageSpecificationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getStorageSpecification()
	 * @generated
	 */
	int STORAGE_SPECIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Storage Specification</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STORAGE_SPECIFICATION_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.VirtualSpecificationImpl
	 * <em>Virtual Specification</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.VirtualSpecificationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getVirtualSpecification()
	 * @generated
	 */
	int VIRTUAL_SPECIFICATION = 28;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Virtual Specification</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SPECIFICATION_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AccessKindImpl
	 * <em>Access Kind</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AccessKindImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAccessKind()
	 * @generated
	 */
	int ACCESS_KIND = 29;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACCESS_KIND__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACCESS_KIND__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACCESS_KIND__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Access Kind</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACCESS_KIND_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ActualParameterImpl
	 * <em>Actual Parameter</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ActualParameterImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getActualParameter()
	 * @generated
	 */
	int ACTUAL_PARAMETER = 30;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Actual Parameter</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionMemberAttributesImpl
	 * <em>Function Member Attributes</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionMemberAttributesImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionMemberAttributes()
	 * @generated
	 */
	int FUNCTION_MEMBER_ATTRIBUTES = 31;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Friend</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is In Line</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__IS_IN_LINE = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is This Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Specifier</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '
	 * <em>Function Member Attributes</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_MEMBER_ATTRIBUTES_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DerivesFromImpl
	 * <em>Derives From</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DerivesFromImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDerivesFrom()
	 * @generated
	 */
	int DERIVES_FROM = 32;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Virtual Specifier</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__VIRTUAL_SPECIFIER = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__ACCESS_KIND = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM__CLASS_NAME = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Derives From</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DERIVES_FROM_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.MemberObjectImpl
	 * <em>Member Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.MemberObjectImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getMemberObject()
	 * @generated
	 */
	int MEMBER_OBJECT = 33;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBER_OBJECT__LOCATION_INFO = MINOR_SYNTAX_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBER_OBJECT__PRE_PROCESSOR_ELEMENTS = MINOR_SYNTAX_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBER_OBJECT__ANNOTATIONS = MINOR_SYNTAX_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBER_OBJECT__OFFSET = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBER_OBJECT__MEMBER = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Object</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBER_OBJECT_FEATURE_COUNT = MINOR_SYNTAX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionImpl
	 * <em>Declaration Or Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDeclarationOrDefinition()
	 * @generated
	 */
	int DECLARATION_OR_DEFINITION = 34;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__ACCESS_KIND = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER = DEFINITION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '
	 * <em>Declaration Or Definition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TypeDefinitionImpl
	 * <em>Type Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TypeDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 35;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE_NAME = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NameSpaceDefinitionImpl
	 * <em>Name Space Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NameSpaceDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNameSpaceDefinition()
	 * @generated
	 */
	int NAME_SPACE_DEFINITION = 36;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name Space</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__NAME_SPACE = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__BODY = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name Space Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION__NAME_SPACE_TYPE = DEFINITION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name Space Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LabelDefinitionImpl
	 * <em>Label Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LabelDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLabelDefinition()
	 * @generated
	 */
	int LABEL_DEFINITION = 37;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__LABEL_NAME = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION__LABEL_TYPE = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_DEFINITION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TypeDeclarationImpl
	 * <em>Type Declaration</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TypeDeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 38;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__LOCATION_INFO = DEFINITION_OBJECT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__PRE_PROCESSOR_ELEMENTS = DEFINITION_OBJECT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ANNOTATIONS = DEFINITION_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__TYPE_REF = DEFINITION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = DEFINITION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DefinitionImpl
	 * <em>Definition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 39;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LOCATION_INFO = DECLARATION_OR_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__PRE_PROCESSOR_ELEMENTS = DECLARATION_OR_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ANNOTATIONS = DECLARATION_OR_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__STORAGE_SPECIFIERS = DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__ACCESS_KIND = DECLARATION_OR_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LINKAGE_SPECIFIER = DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__IDENTIFIER_NAME = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION__DEFINITION_TYPE = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DeclarationImpl
	 * <em>Declaration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 40;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__LOCATION_INFO = DECLARATION_OR_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION_OR_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ANNOTATIONS = DECLARATION_OR_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__STORAGE_SPECIFIERS = DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ACCESS_KIND = DECLARATION_OR_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__LINKAGE_SPECIFIER = DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DEF_REF = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IDENTIFIER_NAME = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DECLARATION_TYPE = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = DECLARATION_OR_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl
	 * <em>Function Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 41;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RETURN_TYPE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FORMAL_PARAMETERS = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__BODY = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Member Attributes</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES = DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__OPENS_SCOPE = DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EntryDefinitionImpl
	 * <em>Entry Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EntryDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEntryDefinition()
	 * @generated
	 */
	int ENTRY_DEFINITION = 42;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__FORMAL_PARAMETERS = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION__BODY = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTRY_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DataDefinitionImpl
	 * <em>Data Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DataDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDataDefinition()
	 * @generated
	 */
	int DATA_DEFINITION = 43;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__INITIAL_VALUE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__IS_MUTABLE = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EnumLiteralDefinitionImpl
	 * <em>Enum Literal Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EnumLiteralDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEnumLiteralDefinition()
	 * @generated
	 */
	int ENUM_LITERAL_DEFINITION = 44;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__LOCATION_INFO = DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__PRE_PROCESSOR_ELEMENTS = DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__STORAGE_SPECIFIERS = DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__ACCESS_KIND = DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__LINKAGE_SPECIFIER = DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__IDENTIFIER_NAME = DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__DEFINITION_TYPE = DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION__VALUE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Enum Literal Definition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionDeclarationImpl
	 * <em>Function Declaration</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionDeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 45;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__LOCATION_INFO = DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__STORAGE_SPECIFIERS = DECLARATION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ACCESS_KIND = DECLARATION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__LINKAGE_SPECIFIER = DECLARATION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DEF_REF = DECLARATION__DEF_REF;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__IDENTIFIER_NAME = DECLARATION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__DECLARATION_TYPE = DECLARATION__DECLARATION_TYPE;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__FORMAL_PARAMETERS = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Member Attributes</b></em>'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__FUNCTION_MEMBER_ATTRIBUTES = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.VariableDeclarationImpl
	 * <em>Variable Declaration</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.VariableDeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 46;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__LOCATION_INFO = DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__STORAGE_SPECIFIERS = DECLARATION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ACCESS_KIND = DECLARATION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__LINKAGE_SPECIFIER = DECLARATION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DEF_REF = DECLARATION__DEF_REF;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__IDENTIFIER_NAME = DECLARATION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DECLARATION_TYPE = DECLARATION__DECLARATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__IS_MUTABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FormalParameterDeclarationImpl
	 * <em>Formal Parameter Declaration</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FormalParameterDeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFormalParameterDeclaration()
	 * @generated
	 */
	int FORMAL_PARAMETER_DECLARATION = 47;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__LOCATION_INFO = DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__PRE_PROCESSOR_ELEMENTS = DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__ANNOTATIONS = DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__STORAGE_SPECIFIERS = DECLARATION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__ACCESS_KIND = DECLARATION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__LINKAGE_SPECIFIER = DECLARATION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Def Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__DEF_REF = DECLARATION__DEF_REF;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__IDENTIFIER_NAME = DECLARATION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION__DECLARATION_TYPE = DECLARATION__DECLARATION_TYPE;

	/**
	 * The number of structural features of the '
	 * <em>Formal Parameter Declaration</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ExternalImpl <em>External</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ExternalImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 48;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__LOCATION_INFO = STORAGE_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__PRE_PROCESSOR_ELEMENTS = STORAGE_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ANNOTATIONS = STORAGE_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>External</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionPersistentImpl
	 * <em>Function Persistent</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionPersistentImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionPersistent()
	 * @generated
	 */
	int FUNCTION_PERSISTENT = 49;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PERSISTENT__LOCATION_INFO = STORAGE_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PERSISTENT__PRE_PROCESSOR_ELEMENTS = STORAGE_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PERSISTENT__ANNOTATIONS = STORAGE_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Function Persistent</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PERSISTENT_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FileLocalImpl
	 * <em>File Local</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FileLocalImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFileLocal()
	 * @generated
	 */
	int FILE_LOCAL = 50;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__LOCATION_INFO = STORAGE_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__PRE_PROCESSOR_ELEMENTS = STORAGE_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL__ANNOTATIONS = STORAGE_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>File Local</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_LOCAL_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PerClassMemberImpl
	 * <em>Per Class Member</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PerClassMemberImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPerClassMember()
	 * @generated
	 */
	int PER_CLASS_MEMBER = 51;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PER_CLASS_MEMBER__LOCATION_INFO = STORAGE_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PER_CLASS_MEMBER__PRE_PROCESSOR_ELEMENTS = STORAGE_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PER_CLASS_MEMBER__ANNOTATIONS = STORAGE_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Per Class Member</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PER_CLASS_MEMBER_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NoDefImpl <em>No Def</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NoDefImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNoDef()
	 * @generated
	 */
	int NO_DEF = 52;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NO_DEF__LOCATION_INFO = STORAGE_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NO_DEF__PRE_PROCESSOR_ELEMENTS = STORAGE_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NO_DEF__ANNOTATIONS = STORAGE_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>No Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NO_DEF_FEATURE_COUNT = STORAGE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.VirtualImpl <em>Virtual</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.VirtualImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getVirtual()
	 * @generated
	 */
	int VIRTUAL = 53;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL__LOCATION_INFO = VIRTUAL_SPECIFICATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL__PRE_PROCESSOR_ELEMENTS = VIRTUAL_SPECIFICATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL__ANNOTATIONS = VIRTUAL_SPECIFICATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Virtual</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_FEATURE_COUNT = VIRTUAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.VariableDefinitionImpl
	 * <em>Variable Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.VariableDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getVariableDefinition()
	 * @generated
	 */
	int VARIABLE_DEFINITION = 54;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__LOCATION_INFO = DATA_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__PRE_PROCESSOR_ELEMENTS = DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__ANNOTATIONS = DATA_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__STORAGE_SPECIFIERS = DATA_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__ACCESS_KIND = DATA_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__LINKAGE_SPECIFIER = DATA_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__IDENTIFIER_NAME = DATA_DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__DEFINITION_TYPE = DATA_DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__INITIAL_VALUE = DATA_DEFINITION__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION__IS_MUTABLE = DATA_DEFINITION__IS_MUTABLE;

	/**
	 * The number of structural features of the '<em>Variable Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FormalParameterDefinitionImpl
	 * <em>Formal Parameter Definition</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FormalParameterDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFormalParameterDefinition()
	 * @generated
	 */
	int FORMAL_PARAMETER_DEFINITION = 55;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__LOCATION_INFO = DATA_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__PRE_PROCESSOR_ELEMENTS = DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__ANNOTATIONS = DATA_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__STORAGE_SPECIFIERS = DATA_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__ACCESS_KIND = DATA_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__LINKAGE_SPECIFIER = DATA_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__IDENTIFIER_NAME = DATA_DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__DEFINITION_TYPE = DATA_DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__INITIAL_VALUE = DATA_DEFINITION__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION__IS_MUTABLE = DATA_DEFINITION__IS_MUTABLE;

	/**
	 * The number of structural features of the '
	 * <em>Formal Parameter Definition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitFieldDefinitionImpl
	 * <em>Bit Field Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitFieldDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitFieldDefinition()
	 * @generated
	 */
	int BIT_FIELD_DEFINITION = 56;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__LOCATION_INFO = DATA_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__PRE_PROCESSOR_ELEMENTS = DATA_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__ANNOTATIONS = DATA_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Storage Specifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__STORAGE_SPECIFIERS = DATA_DEFINITION__STORAGE_SPECIFIERS;

	/**
	 * The feature id for the '<em><b>Access Kind</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__ACCESS_KIND = DATA_DEFINITION__ACCESS_KIND;

	/**
	 * The feature id for the '<em><b>Linkage Specifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__LINKAGE_SPECIFIER = DATA_DEFINITION__LINKAGE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Identifier Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__IDENTIFIER_NAME = DATA_DEFINITION__IDENTIFIER_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__DEFINITION_TYPE = DATA_DEFINITION__DEFINITION_TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__INITIAL_VALUE = DATA_DEFINITION__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Is Mutable</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__IS_MUTABLE = DATA_DEFINITION__IS_MUTABLE;

	/**
	 * The feature id for the '<em><b>Bit Field Size</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION__BIT_FIELD_SIZE = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Field Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NamedTypeDefinitionImpl
	 * <em>Named Type Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NamedTypeDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNamedTypeDefinition()
	 * @generated
	 */
	int NAMED_TYPE_DEFINITION = 57;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__LOCATION_INFO = TYPE_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__ANNOTATIONS = TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__TYPE_NAME = TYPE_DEFINITION__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION__DEFINITION_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Type Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AggregateTypeDefinitionImpl
	 * <em>Aggregate Type Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AggregateTypeDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAggregateTypeDefinition()
	 * @generated
	 */
	int AGGREGATE_TYPE_DEFINITION = 58;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__LOCATION_INFO = TYPE_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__ANNOTATIONS = TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__TYPE_NAME = TYPE_DEFINITION__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Aggregate Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Aggregate Type Definition</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EnumTypeDefinitionImpl
	 * <em>Enum Type Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EnumTypeDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEnumTypeDefinition()
	 * @generated
	 */
	int ENUM_TYPE_DEFINITION = 59;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DEFINITION__LOCATION_INFO = TYPE_DEFINITION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS = TYPE_DEFINITION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DEFINITION__ANNOTATIONS = TYPE_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DEFINITION__TYPE_NAME = TYPE_DEFINITION__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DEFINITION__DEFINITION_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AggregateTypeDeclarationImpl
	 * <em>Aggregate Type Declaration</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AggregateTypeDeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAggregateTypeDeclaration()
	 * @generated
	 */
	int AGGREGATE_TYPE_DECLARATION = 60;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DECLARATION__LOCATION_INFO = TYPE_DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DECLARATION__PRE_PROCESSOR_ELEMENTS = TYPE_DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DECLARATION__TYPE_REF = TYPE_DECLARATION__TYPE_REF;

	/**
	 * The number of structural features of the '
	 * <em>Aggregate Type Declaration</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EnumTypeDeclarationImpl
	 * <em>Enum Type Declaration</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EnumTypeDeclarationImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEnumTypeDeclaration()
	 * @generated
	 */
	int ENUM_TYPE_DECLARATION = 61;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DECLARATION__LOCATION_INFO = TYPE_DECLARATION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DECLARATION__PRE_PROCESSOR_ELEMENTS = TYPE_DECLARATION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DECLARATION__TYPE_REF = TYPE_DECLARATION__TYPE_REF;

	/**
	 * The number of structural features of the '<em>Enum Type Declaration</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IncludeUnitImpl
	 * <em>Include Unit</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IncludeUnitImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getIncludeUnit()
	 * @generated
	 */
	int INCLUDE_UNIT = 62;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT__FILE = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include Unit</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCLUDE_UNIT_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.MacroCallImpl
	 * <em>Macro Call</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.MacroCallImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getMacroCall()
	 * @generated
	 */
	int MACRO_CALL = 63;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL__REFERS_TO = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macro Call</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_CALL_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.MacroDefinitionImpl
	 * <em>Macro Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.MacroDefinitionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getMacroDefinition()
	 * @generated
	 */
	int MACRO_DEFINITION = 64;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Macro Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__MACRO_NAME = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION__BODY = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Macro Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MACRO_DEFINITION_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CommentImpl <em>Comment</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CommentImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 65;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__LOCATION_INFO = PREPROCESSOR_ELEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__PRE_PROCESSOR_ELEMENTS = PREPROCESSOR_ELEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATIONS = PREPROCESSOR_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = PREPROCESSOR_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionTypeImpl
	 * <em>Function Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__RETURN_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAMETER_TYPES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DataTypeImpl
	 * <em>Data Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DataTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LabelTypeImpl
	 * <em>Label Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LabelTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NameSpaceTypeImpl
	 * <em>Name Space Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NameSpaceTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNameSpaceType()
	 * @generated
	 */
	int NAME_SPACE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Name Space Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_SPACE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TypeReferenceImpl
	 * <em>Type Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TypeReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 70;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__LOCATION_INFO = TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS = TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__IS_CONST = TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PrimitiveTypeImpl
	 * <em>Primitive Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PrimitiveTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EnumTypeImpl
	 * <em>Enum Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EnumTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Enum Literals</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ENUM_LITERALS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ConstructedTypeImpl
	 * <em>Constructed Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ConstructedTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getConstructedType()
	 * @generated
	 */
	int CONSTRUCTED_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE__BASE_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constructed Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AggregateTypeImpl
	 * <em>Aggregate Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AggregateTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAggregateType()
	 * @generated
	 */
	int AGGREGATE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__MEMBERS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE__OPENS_SCOPE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregate Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ExceptionTypeImpl
	 * <em>Exception Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ExceptionTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getExceptionType()
	 * @generated
	 */
	int EXCEPTION_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FormalParameterTypeImpl
	 * <em>Formal Parameter Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FormalParameterTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFormalParameterType()
	 * @generated
	 */
	int FORMAL_PARAMETER_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Parameter Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NamedTypeImpl
	 * <em>Named Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NamedTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__LOCATION_INFO = DATA_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__PRE_PROCESSOR_ELEMENTS = DATA_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__IS_CONST = DATA_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__BODY = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NumberTypeImpl
	 * <em>Number Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NumberTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNumberType()
	 * @generated
	 */
	int NUMBER_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__IS_SIGNED = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.VoidImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 79;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOID__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOID__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOID__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOID__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Void</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BooleanImpl <em>Boolean</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BooleanImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 80;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__LOCATION_INFO = PRIMITIVE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__PRE_PROCESSOR_ELEMENTS = PRIMITIVE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ANNOTATIONS = PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__IS_CONST = PRIMITIVE_TYPE__IS_CONST;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IntegralTypeImpl
	 * <em>Integral Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IntegralTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getIntegralType()
	 * @generated
	 */
	int INTEGRAL_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE__LOCATION_INFO = NUMBER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE__PRE_PROCESSOR_ELEMENTS = NUMBER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE__ANNOTATIONS = NUMBER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE__IS_CONST = NUMBER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE__IS_SIGNED = NUMBER_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE__SIZE = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integral Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.RealTypeImpl
	 * <em>Real Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.RealTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__LOCATION_INFO = NUMBER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__PRE_PROCESSOR_ELEMENTS = NUMBER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__ANNOTATIONS = NUMBER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__IS_CONST = NUMBER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__IS_SIGNED = NUMBER_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__PRECISION = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ByteImpl <em>Byte</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ByteImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 83;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BYTE__LOCATION_INFO = NUMBER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BYTE__PRE_PROCESSOR_ELEMENTS = NUMBER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BYTE__ANNOTATIONS = NUMBER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BYTE__IS_CONST = NUMBER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BYTE__IS_SIGNED = NUMBER_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Byte</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BYTE_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CharacterImpl
	 * <em>Character</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CharacterImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 84;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHARACTER__LOCATION_INFO = NUMBER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHARACTER__PRE_PROCESSOR_ELEMENTS = NUMBER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ANNOTATIONS = NUMBER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHARACTER__IS_CONST = NUMBER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHARACTER__IS_SIGNED = NUMBER_TYPE__IS_SIGNED;

	/**
	 * The number of structural features of the '<em>Character</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ShortIntegerImpl
	 * <em>Short Integer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ShortIntegerImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getShortInteger()
	 * @generated
	 */
	int SHORT_INTEGER = 85;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__LOCATION_INFO = INTEGRAL_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__PRE_PROCESSOR_ELEMENTS = INTEGRAL_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__ANNOTATIONS = INTEGRAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__IS_CONST = INTEGRAL_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__IS_SIGNED = INTEGRAL_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER__SIZE = INTEGRAL_TYPE__SIZE;

	/**
	 * The number of structural features of the '<em>Short Integer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SHORT_INTEGER_FEATURE_COUNT = INTEGRAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LiteralImpl <em>Literal</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 132;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IntegerLiteralImpl
	 * <em>Integer Literal</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IntegerLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 151;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IntegerImpl <em>Integer</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IntegerImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 86;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER__LOCATION_INFO = INTEGER_LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER__PRE_PROCESSOR_ELEMENTS = INTEGER_LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER__ANNOTATIONS = INTEGER_LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER__EXPRESSION_TYPE = INTEGER_LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = INTEGER_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Integer</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LongIntegerImpl
	 * <em>Long Integer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LongIntegerImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLongInteger()
	 * @generated
	 */
	int LONG_INTEGER = 87;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__LOCATION_INFO = INTEGRAL_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__PRE_PROCESSOR_ELEMENTS = INTEGRAL_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__ANNOTATIONS = INTEGRAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__IS_CONST = INTEGRAL_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__IS_SIGNED = INTEGRAL_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER__SIZE = INTEGRAL_TYPE__SIZE;

	/**
	 * The number of structural features of the '<em>Long Integer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_INTEGER_FEATURE_COUNT = INTEGRAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.RealImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 88;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL__LOCATION_INFO = REAL_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL__PRE_PROCESSOR_ELEMENTS = REAL_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL__ANNOTATIONS = REAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL__IS_CONST = REAL_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL__IS_SIGNED = REAL_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL__PRECISION = REAL_TYPE__PRECISION;

	/**
	 * The number of structural features of the '<em>Real</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = REAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DoubleImpl <em>Double</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DoubleImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 89;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE__LOCATION_INFO = REAL_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE__PRE_PROCESSOR_ELEMENTS = REAL_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE__ANNOTATIONS = REAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE__IS_CONST = REAL_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE__IS_SIGNED = REAL_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE__PRECISION = REAL_TYPE__PRECISION;

	/**
	 * The number of structural features of the '<em>Double</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = REAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LongDoubleImpl
	 * <em>Long Double</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LongDoubleImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLongDouble()
	 * @generated
	 */
	int LONG_DOUBLE = 90;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__LOCATION_INFO = REAL_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__PRE_PROCESSOR_ELEMENTS = REAL_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__ANNOTATIONS = REAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__IS_CONST = REAL_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__IS_SIGNED = REAL_TYPE__IS_SIGNED;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__PRECISION = REAL_TYPE__PRECISION;

	/**
	 * The number of structural features of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_FEATURE_COUNT = REAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CollectionTypeImpl
	 * <em>Collection Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CollectionTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Collection Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PointerTypeImpl
	 * <em>Pointer Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PointerTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPointerType()
	 * @generated
	 */
	int POINTER_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__SIZE = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ReferenceTypeImpl
	 * <em>Reference Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ReferenceTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.RangeTypeImpl
	 * <em>Range Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.RangeTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ArrayTypeImpl
	 * <em>Array Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ArrayTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__LOCATION_INFO = CONSTRUCTED_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__PRE_PROCESSOR_ELEMENTS = CONSTRUCTED_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ANNOTATIONS = CONSTRUCTED_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__IS_CONST = CONSTRUCTED_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BASE_TYPE = CONSTRUCTED_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Ranks</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__RANKS = CONSTRUCTED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = CONSTRUCTED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.StructureTypeImpl
	 * <em>Structure Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.StructureTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getStructureType()
	 * @generated
	 */
	int STRUCTURE_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The number of structural features of the '<em>Structure Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.UnionTypeImpl
	 * <em>Union Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.UnionTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ClassTypeImpl
	 * <em>Class Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ClassTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The feature id for the '<em><b>Derives From</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DERIVES_FROM = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AnnotationTypeImpl
	 * <em>Annotation Type</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AnnotationTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LOCATION_INFO = AGGREGATE_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PRE_PROCESSOR_ELEMENTS = AGGREGATE_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATIONS = AGGREGATE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IS_CONST = AGGREGATE_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__MEMBERS = AGGREGATE_TYPE__MEMBERS;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__OPENS_SCOPE = AGGREGATE_TYPE__OPENS_SCOPE;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ByValueFormalParameterTypeImpl
	 * <em>By Value Formal Parameter Type</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ByValueFormalParameterTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getByValueFormalParameterType()
	 * @generated
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__LOCATION_INFO = FORMAL_PARAMETER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS = FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__ANNOTATIONS = FORMAL_PARAMETER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__IS_CONST = FORMAL_PARAMETER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE__TYPE = FORMAL_PARAMETER_TYPE__TYPE;

	/**
	 * The number of structural features of the '
	 * <em>By Value Formal Parameter Type</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_FORMAL_PARAMETER_TYPE_FEATURE_COUNT = FORMAL_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ByReferenceFormalParameterTypeImpl
	 * <em>By Reference Formal Parameter Type</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ByReferenceFormalParameterTypeImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getByReferenceFormalParameterType()
	 * @generated
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__LOCATION_INFO = FORMAL_PARAMETER_TYPE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS = FORMAL_PARAMETER_TYPE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__ANNOTATIONS = FORMAL_PARAMETER_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__IS_CONST = FORMAL_PARAMETER_TYPE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE__TYPE = FORMAL_PARAMETER_TYPE__TYPE;

	/**
	 * The number of structural features of the '
	 * <em>By Reference Formal Parameter Type</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_FORMAL_PARAMETER_TYPE_FEATURE_COUNT = FORMAL_PARAMETER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PublicImpl <em>Public</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PublicImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPublic()
	 * @generated
	 */
	int PUBLIC = 102;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLIC__LOCATION_INFO = ACCESS_KIND__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLIC__PRE_PROCESSOR_ELEMENTS = ACCESS_KIND__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLIC__ANNOTATIONS = ACCESS_KIND__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Public</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLIC_FEATURE_COUNT = ACCESS_KIND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ProtectedImpl
	 * <em>Protected</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ProtectedImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getProtected()
	 * @generated
	 */
	int PROTECTED = 103;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROTECTED__LOCATION_INFO = ACCESS_KIND__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROTECTED__PRE_PROCESSOR_ELEMENTS = ACCESS_KIND__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROTECTED__ANNOTATIONS = ACCESS_KIND__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Protected</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROTECTED_FEATURE_COUNT = ACCESS_KIND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PrivateImpl <em>Private</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PrivateImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPrivate()
	 * @generated
	 */
	int PRIVATE = 104;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIVATE__LOCATION_INFO = ACCESS_KIND__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIVATE__PRE_PROCESSOR_ELEMENTS = ACCESS_KIND__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIVATE__ANNOTATIONS = ACCESS_KIND__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Private</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRIVATE_FEATURE_COUNT = ACCESS_KIND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.UnnamedTypeReferenceImpl
	 * <em>Unnamed Type Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.UnnamedTypeReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getUnnamedTypeReference()
	 * @generated
	 */
	int UNNAMED_TYPE_REFERENCE = 105;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__LOCATION_INFO = TYPE_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS = TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__ANNOTATIONS = TYPE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__IS_CONST = TYPE_REFERENCE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE__TYPE = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unnamed Type Reference</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNNAMED_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NamedTypeReferenceImpl
	 * <em>Named Type Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NamedTypeReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNamedTypeReference()
	 * @generated
	 */
	int NAMED_TYPE_REFERENCE = 106;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__LOCATION_INFO = TYPE_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS = TYPE_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__ANNOTATIONS = TYPE_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__IS_CONST = TYPE_REFERENCE__IS_CONST;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__TYPE_NAME = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE__TYPE = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Type Reference</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ExpressionStatementImpl
	 * <em>Expression Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ExpressionStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 107;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.JumpStatementImpl
	 * <em>Jump Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.JumpStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getJumpStatement()
	 * @generated
	 */
	int JUMP_STATEMENT = 108;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump Statement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int JUMP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BreakStatementImpl
	 * <em>Break Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BreakStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 109;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Break Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ContinueStatementImpl
	 * <em>Continue Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ContinueStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 110;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__TARGET = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LabeledStatementImpl
	 * <em>Labeled Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LabeledStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLabeledStatement()
	 * @generated
	 */
	int LABELED_STATEMENT = 111;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BlockStatementImpl
	 * <em>Block Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BlockStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBlockStatement()
	 * @generated
	 */
	int BLOCK_STATEMENT = 112;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__SUB_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opens Scope</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__OPENS_SCOPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EmptyStatementImpl
	 * <em>Empty Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EmptyStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEmptyStatement()
	 * @generated
	 */
	int EMPTY_STATEMENT = 113;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Empty Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IfStatementImpl
	 * <em>If Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IfStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 114;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Body</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_BODY = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.SwitchStatementImpl
	 * <em>Switch Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.SwitchStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 115;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Switch Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__SWITCH_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CASES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ReturnStatementImpl
	 * <em>Return Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ReturnStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 116;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__RETURN_VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LoopStatementImpl
	 * <em>Loop Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LoopStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 117;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TryStatementImpl
	 * <em>Try Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TryStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTryStatement()
	 * @generated
	 */
	int TRY_STATEMENT = 118;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Guarded Statement</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__GUARDED_STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Blocks</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__CATCH_BLOCKS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final Statement</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__FINAL_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionStatementImpl
	 * <em>Declaration Or Definition Statement</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDeclarationOrDefinitionStatement()
	 * @generated
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT = 119;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Decl Or Defn</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT__DECL_OR_DEFN = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Declaration Or Definition Statement</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OR_DEFINITION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ThrowStatementImpl
	 * <em>Throw Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ThrowStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 120;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DeleteStatementImpl
	 * <em>Delete Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DeleteStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDeleteStatement()
	 * @generated
	 */
	int DELETE_STATEMENT = 121;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT__OPERAND = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DELETE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TerminateStatementImpl
	 * <em>Terminate Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TerminateStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTerminateStatement()
	 * @generated
	 */
	int TERMINATE_STATEMENT = 122;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT__LOCATION_INFO = STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT__PRE_PROCESSOR_ELEMENTS = STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Terminate Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERMINATE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CaseBlockImpl
	 * <em>Case Block</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CaseBlockImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCaseBlock()
	 * @generated
	 */
	int CASE_BLOCK = 123;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__LOCATION_INFO = SWITCH_CASE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__PRE_PROCESSOR_ELEMENTS = SWITCH_CASE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__ANNOTATIONS = SWITCH_CASE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Evaluate All Cases</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__IS_EVALUATE_ALL_CASES = SWITCH_CASE__IS_EVALUATE_ALL_CASES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__BODY = SWITCH_CASE__BODY;

	/**
	 * The feature id for the '<em><b>Case Expressions</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK__CASE_EXPRESSIONS = SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Case Block</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CASE_BLOCK_FEATURE_COUNT = SWITCH_CASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DefaultBlockImpl
	 * <em>Default Block</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DefaultBlockImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDefaultBlock()
	 * @generated
	 */
	int DEFAULT_BLOCK = 124;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__LOCATION_INFO = SWITCH_CASE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__PRE_PROCESSOR_ELEMENTS = SWITCH_CASE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__ANNOTATIONS = SWITCH_CASE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Is Evaluate All Cases</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__IS_EVALUATE_ALL_CASES = SWITCH_CASE__IS_EVALUATE_ALL_CASES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK__BODY = SWITCH_CASE__BODY;

	/**
	 * The number of structural features of the '<em>Default Block</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEFAULT_BLOCK_FEATURE_COUNT = SWITCH_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.WhileStatementImpl
	 * <em>While Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.WhileStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 125;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__LOCATION_INFO = LOOP_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__PRE_PROCESSOR_ELEMENTS = LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__ANNOTATIONS = LOOP_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>While Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DoWhileStatementImpl
	 * <em>Do While Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DoWhileStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDoWhileStatement()
	 * @generated
	 */
	int DO_WHILE_STATEMENT = 126;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__LOCATION_INFO = LOOP_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__PRE_PROCESSOR_ELEMENTS = LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__ANNOTATIONS = LOOP_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Do While Statement</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ForStatementImpl
	 * <em>For Statement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ForStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 127;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__LOCATION_INFO = LOOP_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__PRE_PROCESSOR_ELEMENTS = LOOP_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ANNOTATIONS = LOOP_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Init Body</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INIT_BODY = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iteration Body</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ITERATION_BODY = LOOP_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ForCheckBeforeStatementImpl
	 * <em>For Check Before Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ForCheckBeforeStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getForCheckBeforeStatement()
	 * @generated
	 */
	int FOR_CHECK_BEFORE_STATEMENT = 128;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__LOCATION_INFO = FOR_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__PRE_PROCESSOR_ELEMENTS = FOR_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__ANNOTATIONS = FOR_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__CONDITION = FOR_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__BODY = FOR_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Init Body</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__INIT_BODY = FOR_STATEMENT__INIT_BODY;

	/**
	 * The feature id for the '<em><b>Iteration Body</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT__ITERATION_BODY = FOR_STATEMENT__ITERATION_BODY;

	/**
	 * The number of structural features of the '
	 * <em>For Check Before Statement</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_BEFORE_STATEMENT_FEATURE_COUNT = FOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ForCheckAfterStatementImpl
	 * <em>For Check After Statement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ForCheckAfterStatementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getForCheckAfterStatement()
	 * @generated
	 */
	int FOR_CHECK_AFTER_STATEMENT = 129;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__LOCATION_INFO = FOR_STATEMENT__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__PRE_PROCESSOR_ELEMENTS = FOR_STATEMENT__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__ANNOTATIONS = FOR_STATEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__CONDITION = FOR_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__BODY = FOR_STATEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Init Body</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__INIT_BODY = FOR_STATEMENT__INIT_BODY;

	/**
	 * The feature id for the '<em><b>Iteration Body</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT__ITERATION_BODY = FOR_STATEMENT__ITERATION_BODY;

	/**
	 * The number of structural features of the '
	 * <em>For Check After Statement</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_CHECK_AFTER_STATEMENT_FEATURE_COUNT = FOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TypesCatchBlockImpl
	 * <em>Types Catch Block</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TypesCatchBlockImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTypesCatchBlock()
	 * @generated
	 */
	int TYPES_CATCH_BLOCK = 130;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__LOCATION_INFO = CATCH_BLOCK__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS = CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__ANNOTATIONS = CATCH_BLOCK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__BODY = CATCH_BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK__EXCEPTIONS = CATCH_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Types Catch Block</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPES_CATCH_BLOCK_FEATURE_COUNT = CATCH_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.VariableCatchBlockImpl
	 * <em>Variable Catch Block</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.VariableCatchBlockImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getVariableCatchBlock()
	 * @generated
	 */
	int VARIABLE_CATCH_BLOCK = 131;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__LOCATION_INFO = CATCH_BLOCK__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS = CATCH_BLOCK__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__ANNOTATIONS = CATCH_BLOCK__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__BODY = CATCH_BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Exception Variable</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE = CATCH_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Catch Block</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CATCH_BLOCK_FEATURE_COUNT = CATCH_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CastExpressionImpl
	 * <em>Cast Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CastExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 133;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Cast Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__CAST_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AggregateExpressionImpl
	 * <em>Aggregate Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AggregateExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAggregateExpression()
	 * @generated
	 */
	int AGGREGATE_EXPRESSION = 134;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Sub Expressions</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__SUB_EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.UnaryExpressionImpl
	 * <em>Unary Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.UnaryExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 135;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BinaryExpressionImpl
	 * <em>Binary Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BinaryExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 136;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ConditionalExpressionImpl
	 * <em>Conditional Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ConditionalExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 137;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On True Operand</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On False Operand</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.RangeExpressionImpl
	 * <em>Range Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.RangeExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getRangeExpression()
	 * @generated
	 */
	int RANGE_EXPRESSION = 138;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>From Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__FROM_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Expression</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__TO_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.FunctionCallExpressionImpl
	 * <em>Function Call Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.FunctionCallExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getFunctionCallExpression()
	 * @generated
	 */
	int FUNCTION_CALL_EXPRESSION = 139;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Called Function</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Params</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '
	 * <em>Function Call Expression</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NewExpressionImpl
	 * <em>New Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NewExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNewExpression()
	 * @generated
	 */
	int NEW_EXPRESSION = 140;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__NEW_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Params</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION__ACTUAL_PARAMS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>New Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NEW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NameReferenceImpl
	 * <em>Name Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NameReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNameReference()
	 * @generated
	 */
	int NAME_REFERENCE = 141;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE__REFERS_TO = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Name Reference</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAME_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LabelAccessImpl
	 * <em>Label Access</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LabelAccessImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLabelAccess()
	 * @generated
	 */
	int LABEL_ACCESS = 142;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Label Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__LABEL_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Definition</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__LABEL_DEFINITION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ArrayAccessImpl
	 * <em>Array Access</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ArrayAccessImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getArrayAccess()
	 * @generated
	 */
	int ARRAY_ACCESS = 143;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Array Name</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ARRAY_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__SUBSCRIPTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AnnotationExpressionImpl
	 * <em>Annotation Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AnnotationExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAnnotationExpression()
	 * @generated
	 */
	int ANNOTATION_EXPRESSION = 144;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Annotation Type</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__ANNOTATION_TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Values</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION__MEMBER_VALUES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CollectionExpressionImpl
	 * <em>Collection Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CollectionExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCollectionExpression()
	 * @generated
	 */
	int COLLECTION_EXPRESSION = 145;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__LOCATION_INFO = EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__PRE_PROCESSOR_ELEMENTS = EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__EXPRESSION_TYPE = EXPRESSION__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Expression List</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__EXPRESSION_LIST = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IdentifierReferenceImpl
	 * <em>Identifier Reference</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IdentifierReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getIdentifierReference()
	 * @generated
	 */
	int IDENTIFIER_REFERENCE = 146;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__LOCATION_INFO = NAME_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS = NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__ANNOTATIONS = NAME_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__EXPRESSION_TYPE = NAME_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__NAME = NAME_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE__REFERS_TO = NAME_REFERENCE__REFERS_TO;

	/**
	 * The number of structural features of the '<em>Identifier Reference</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_REFERENCE_FEATURE_COUNT = NAME_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.QualifiedIdentifierReferenceImpl
	 * <em>Qualified Identifier Reference</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.QualifiedIdentifierReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getQualifiedIdentifierReference()
	 * @generated
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE = 147;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO = NAME_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS = NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS = NAME_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE = NAME_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__NAME = NAME_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO = NAME_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS = NAME_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE__MEMBER = NAME_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '
	 * <em>Qualified Identifier Reference</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT = NAME_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.TypeQualifiedIdentifierReferenceImpl
	 * <em>Type Qualified Identifier Reference</em>}' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.TypeQualifiedIdentifierReferenceImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getTypeQualifiedIdentifierReference()
	 * @generated
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE = 148;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO = NAME_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS = NAME_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS = NAME_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE = NAME_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__NAME = NAME_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO = NAME_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Aggregate Type</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__AGGREGATE_TYPE = NAME_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE__MEMBER = NAME_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '
	 * <em>Type Qualified Identifier Reference</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT = NAME_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.QualifiedOverPointerImpl
	 * <em>Qualified Over Pointer</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.QualifiedOverPointerImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getQualifiedOverPointer()
	 * @generated
	 */
	int QUALIFIED_OVER_POINTER = 149;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__LOCATION_INFO = QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__PRE_PROCESSOR_ELEMENTS = QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__ANNOTATIONS = QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__EXPRESSION_TYPE = QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__NAME = QUALIFIED_IDENTIFIER_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__REFERS_TO = QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__QUALIFIERS = QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER__MEMBER = QUALIFIED_IDENTIFIER_REFERENCE__MEMBER;

	/**
	 * The number of structural features of the '<em>Qualified Over Pointer</em>
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_POINTER_FEATURE_COUNT = QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.QualifiedOverDataImpl
	 * <em>Qualified Over Data</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.QualifiedOverDataImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getQualifiedOverData()
	 * @generated
	 */
	int QUALIFIED_OVER_DATA = 150;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__LOCATION_INFO = QUALIFIED_IDENTIFIER_REFERENCE__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__PRE_PROCESSOR_ELEMENTS = QUALIFIED_IDENTIFIER_REFERENCE__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__ANNOTATIONS = QUALIFIED_IDENTIFIER_REFERENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__EXPRESSION_TYPE = QUALIFIED_IDENTIFIER_REFERENCE__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__NAME = QUALIFIED_IDENTIFIER_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__REFERS_TO = QUALIFIED_IDENTIFIER_REFERENCE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__QUALIFIERS = QUALIFIED_IDENTIFIER_REFERENCE__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA__MEMBER = QUALIFIED_IDENTIFIER_REFERENCE__MEMBER;

	/**
	 * The number of structural features of the '<em>Qualified Over Data</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_OVER_DATA_FEATURE_COUNT = QUALIFIED_IDENTIFIER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.CharLiteralImpl
	 * <em>Char Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.CharLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getCharLiteral()
	 * @generated
	 */
	int CHAR_LITERAL = 152;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Char Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHAR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.RealLiteralImpl
	 * <em>Real Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.RealLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 153;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.StringLiteralImpl
	 * <em>String Literal</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.StringLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 154;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BooleanLiteralImpl
	 * <em>Boolean Literal</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BooleanLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 155;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitLiteralImpl
	 * <em>Bit Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitLiteral()
	 * @generated
	 */
	int BIT_LITERAL = 156;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Bit Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EnumLiteralImpl
	 * <em>Enum Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EnumLiteralImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 157;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__LOCATION_INFO = LITERAL__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__PRE_PROCESSOR_ELEMENTS = LITERAL__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__ANNOTATIONS = LITERAL__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__EXPRESSION_TYPE = LITERAL__EXPRESSION_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__VALUE = LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.UnaryPlusImpl
	 * <em>Unary Plus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.UnaryPlusImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getUnaryPlus()
	 * @generated
	 */
	int UNARY_PLUS = 158;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Unary Plus</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_PLUS_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.UnaryMinusImpl
	 * <em>Unary Minus</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.UnaryMinusImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getUnaryMinus()
	 * @generated
	 */
	int UNARY_MINUS = 159;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Unary Minus</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NotImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 160;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Not</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitNotImpl <em>Bit Not</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitNotImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitNot()
	 * @generated
	 */
	int BIT_NOT = 161;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_NOT__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_NOT__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_NOT__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Bit Not</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AddressOfImpl
	 * <em>Address Of</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AddressOfImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAddressOf()
	 * @generated
	 */
	int ADDRESS_OF = 162;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Address Of</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OF_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DerefImpl <em>Deref</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DerefImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDeref()
	 * @generated
	 */
	int DEREF = 163;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEREF__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEREF__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEREF__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Deref</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DEREF_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.IncrementImpl
	 * <em>Increment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.IncrementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getIncrement()
	 * @generated
	 */
	int INCREMENT = 164;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCREMENT__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCREMENT__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCREMENT__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Increment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DecrementImpl
	 * <em>Decrement</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DecrementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDecrement()
	 * @generated
	 */
	int DECREMENT = 165;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECREMENT__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECREMENT__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECREMENT__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Decrement</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DECREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PostIncrementImpl
	 * <em>Post Increment</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PostIncrementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPostIncrement()
	 * @generated
	 */
	int POST_INCREMENT = 166;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_INCREMENT__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_INCREMENT__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_INCREMENT__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Post Increment</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_INCREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.PostDecrementImpl
	 * <em>Post Decrement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.PostDecrementImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getPostDecrement()
	 * @generated
	 */
	int POST_DECREMENT = 167;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_DECREMENT__LOCATION_INFO = UNARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_DECREMENT__PRE_PROCESSOR_ELEMENTS = UNARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_DECREMENT__ANNOTATIONS = UNARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Post Decrement</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int POST_DECREMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AddImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 168;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADD__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADD__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADD__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Add</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.SubtractImpl <em>Subtract</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.SubtractImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getSubtract()
	 * @generated
	 */
	int SUBTRACT = 169;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Subtract</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.MultiplyImpl <em>Multiply</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.MultiplyImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 170;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.DivideImpl <em>Divide</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.DivideImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 171;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIVIDE__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIVIDE__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Divide</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ModulusImpl <em>Modulus</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ModulusImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getModulus()
	 * @generated
	 */
	int MODULUS = 172;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULUS__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULUS__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULUS__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Modulus</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODULUS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ExponentImpl <em>Exponent</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ExponentImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getExponent()
	 * @generated
	 */
	int EXPONENT = 173;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPONENT__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPONENT__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPONENT__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Exponent</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPONENT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AndImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 174;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>And</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.OrImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getOr()
	 * @generated
	 */
	int OR = 175;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Or</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.EqualImpl <em>Equal</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.EqualImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 176;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EQUAL__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EQUAL__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EQUAL__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Equal</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NotEqualImpl
	 * <em>Not Equal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NotEqualImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNotEqual()
	 * @generated
	 */
	int NOT_EQUAL = 177;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Not Equal</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_EQUAL_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.GreaterImpl <em>Greater</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.GreaterImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 178;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GREATER__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GREATER__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GREATER__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Greater</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NotGreaterImpl
	 * <em>Not Greater</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NotGreaterImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNotGreater()
	 * @generated
	 */
	int NOT_GREATER = 179;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_GREATER__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_GREATER__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_GREATER__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Not Greater</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_GREATER_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.LessImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 180;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LESS__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LESS__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LESS__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Less</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.NotLessImpl <em>Not Less</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.NotLessImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getNotLess()
	 * @generated
	 */
	int NOT_LESS = 181;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_LESS__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_LESS__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_LESS__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Not Less</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOT_LESS_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitAndImpl <em>Bit And</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitAndImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitAnd()
	 * @generated
	 */
	int BIT_AND = 182;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_AND__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_AND__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_AND__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Bit And</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_AND_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitOrImpl <em>Bit Or</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitOrImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitOr()
	 * @generated
	 */
	int BIT_OR = 183;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_OR__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_OR__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_OR__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Bit Or</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_OR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitXorImpl <em>Bit Xor</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitXorImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitXor()
	 * @generated
	 */
	int BIT_XOR = 184;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_XOR__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_XOR__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_XOR__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Bit Xor</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_XOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitLeftShiftImpl
	 * <em>Bit Left Shift</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitLeftShiftImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitLeftShift()
	 * @generated
	 */
	int BIT_LEFT_SHIFT = 185;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LEFT_SHIFT__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LEFT_SHIFT__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LEFT_SHIFT__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Bit Left Shift</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_LEFT_SHIFT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.BitRightShiftImpl
	 * <em>Bit Right Shift</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.BitRightShiftImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getBitRightShift()
	 * @generated
	 */
	int BIT_RIGHT_SHIFT = 186;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_RIGHT_SHIFT__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_RIGHT_SHIFT__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_RIGHT_SHIFT__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Bit Right Shift</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BIT_RIGHT_SHIFT_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.AssignImpl <em>Assign</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.AssignImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 187;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSIGN__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSIGN__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Assign</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.OperatorAssignImpl
	 * <em>Operator Assign</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.OperatorAssignImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getOperatorAssign()
	 * @generated
	 */
	int OPERATOR_ASSIGN = 188;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN__LOCATION_INFO = BINARY_OPERATOR__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN__PRE_PROCESSOR_ELEMENTS = BINARY_OPERATOR__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN__ANNOTATIONS = BINARY_OPERATOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN__OPERATOR = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operator Assign</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ASSIGN_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ActualParameterExpressionImpl
	 * <em>Actual Parameter Expression</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ActualParameterExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getActualParameterExpression()
	 * @generated
	 */
	int ACTUAL_PARAMETER_EXPRESSION = 189;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION__LOCATION_INFO = ACTUAL_PARAMETER__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION__PRE_PROCESSOR_ELEMENTS = ACTUAL_PARAMETER__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION__ANNOTATIONS = ACTUAL_PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION__VALUE = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '
	 * <em>Actual Parameter Expression</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.MissingActualParameterImpl
	 * <em>Missing Actual Parameter</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.MissingActualParameterImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getMissingActualParameter()
	 * @generated
	 */
	int MISSING_ACTUAL_PARAMETER = 190;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MISSING_ACTUAL_PARAMETER__LOCATION_INFO = ACTUAL_PARAMETER__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MISSING_ACTUAL_PARAMETER__PRE_PROCESSOR_ELEMENTS = ACTUAL_PARAMETER__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MISSING_ACTUAL_PARAMETER__ANNOTATIONS = ACTUAL_PARAMETER__ANNOTATIONS;

	/**
	 * The number of structural features of the '
	 * <em>Missing Actual Parameter</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MISSING_ACTUAL_PARAMETER_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ByValueActualParameterExpressionImpl
	 * <em>By Value Actual Parameter Expression</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ByValueActualParameterExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getByValueActualParameterExpression()
	 * @generated
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION = 191;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION__LOCATION_INFO = ACTUAL_PARAMETER_EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION__PRE_PROCESSOR_ELEMENTS = ACTUAL_PARAMETER_EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION__ANNOTATIONS = ACTUAL_PARAMETER_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION__VALUE = ACTUAL_PARAMETER_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '
	 * <em>By Value Actual Parameter Expression</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_VALUE_ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT = ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.modisco.omg.gastm.impl.ByReferenceActualParameterExpressionImpl
	 * <em>By Reference Actual Parameter Expression</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.modisco.omg.gastm.impl.ByReferenceActualParameterExpressionImpl
	 * @see org.eclipse.modisco.omg.gastm.impl.GASTMPackageImpl#getByReferenceActualParameterExpression()
	 * @generated
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION = 192;

	/**
	 * The feature id for the '<em><b>Location Info</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION__LOCATION_INFO = ACTUAL_PARAMETER_EXPRESSION__LOCATION_INFO;

	/**
	 * The feature id for the '<em><b>Pre Processor Elements</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION__PRE_PROCESSOR_ELEMENTS = ACTUAL_PARAMETER_EXPRESSION__PRE_PROCESSOR_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION__ANNOTATIONS = ACTUAL_PARAMETER_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION__VALUE = ACTUAL_PARAMETER_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '
	 * <em>By Reference Actual Parameter Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT = ACTUAL_PARAMETER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMObject <em>Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMObject
	 * @generated
	 */
	EClass getGASTMObject();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMSourceObject
	 * <em>Source Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMSourceObject
	 * @generated
	 */
	EClass getGASTMSourceObject();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMSemanticObject
	 * <em>Semantic Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Semantic Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMSemanticObject
	 * @generated
	 */
	EClass getGASTMSemanticObject();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject
	 * <em>Syntax Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Syntax Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMSyntaxObject
	 * @generated
	 */
	EClass getGASTMSyntaxObject();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getLocationInfo
	 * <em>Location Info</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Location Info</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getLocationInfo()
	 * @see #getGASTMSyntaxObject()
	 * @generated
	 */
	EReference getGASTMSyntaxObject_LocationInfo();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getPreProcessorElements
	 * <em>Pre Processor Elements</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Pre Processor Elements</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getPreProcessorElements()
	 * @see #getGASTMSyntaxObject()
	 * @generated
	 */
	EReference getGASTMSyntaxObject_PreProcessorElements();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getAnnotations
	 * <em>Annotations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Annotations</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GASTMSyntaxObject#getAnnotations()
	 * @see #getGASTMSyntaxObject()
	 * @generated
	 */
	EReference getGASTMSyntaxObject_Annotations();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.SourceFile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceFile#getPath()
	 * @see #getSourceFile()
	 * @generated
	 */
	EAttribute getSourceFile_Path();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.SourceLocation
	 * <em>Source Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source Location</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceLocation
	 * @generated
	 */
	EClass getSourceLocation();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.SourceLocation#getStartLine
	 * <em>Start Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Start Line</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceLocation#getStartLine()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_StartLine();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.SourceLocation#getStartPosition
	 * <em>Start Position</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceLocation#getStartPosition()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_StartPosition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.SourceLocation#getEndLine
	 * <em>End Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>End Line</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceLocation#getEndLine()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_EndLine();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.SourceLocation#getEndPosition
	 * <em>End Position</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>End Position</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceLocation#getEndPosition()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EAttribute getSourceLocation_EndPosition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.SourceLocation#getInSourceFile
	 * <em>In Source File</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>In Source File</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceLocation#getInSourceFile()
	 * @see #getSourceLocation()
	 * @generated
	 */
	EReference getSourceLocation_InSourceFile();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CompilationUnit
	 * <em>Compilation Unit</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.CompilationUnit#getLanguage
	 * <em>Language</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CompilationUnit#getLanguage()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_Language();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.CompilationUnit#getFragments
	 * <em>Fragments</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Fragments</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CompilationUnit#getFragments()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Fragments();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.CompilationUnit#getOpensScope
	 * <em>Opens Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Opens Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CompilationUnit#getOpensScope()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_OpensScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.SourceFileReference
	 * <em>Source File Reference</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source File Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceFileReference
	 * @generated
	 */
	EClass getSourceFileReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.SourceFileReference#getLocationInfo
	 * <em>Location Info</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Location Info</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceFileReference#getLocationInfo()
	 * @see #getSourceFileReference()
	 * @generated
	 */
	EReference getSourceFileReference_LocationInfo();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.SourceFileReference#getOfSourceFile
	 * <em>Of Source File</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Of Source File</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SourceFileReference#getOfSourceFile()
	 * @see #getSourceFileReference()
	 * @generated
	 */
	EReference getSourceFileReference_OfSourceFile();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Project <em>Project</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.Project#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Files</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Project#getFiles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Files();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.Project#getOuterScope
	 * <em>Outer Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Outer Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Project#getOuterScope()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_OuterScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Scope <em>Scope</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.Scope#getDefinitionObject
	 * <em>Definition Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Definition Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Scope#getDefinitionObject()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_DefinitionObject();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.modisco.omg.gastm.Scope#getChildScope
	 * <em>Child Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Child Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Scope#getChildScope()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_ChildScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ProgramScope <em>Program Scope</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Program Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ProgramScope
	 * @generated
	 */
	EClass getProgramScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionScope
	 * <em>Function Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionScope
	 * @generated
	 */
	EClass getFunctionScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateScope
	 * <em>Aggregate Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aggregate Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateScope
	 * @generated
	 */
	EClass getAggregateScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BlockScope <em>Block Scope</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Block Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BlockScope
	 * @generated
	 */
	EClass getBlockScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.GlobalScope <em>Global Scope</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Global Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.GlobalScope
	 * @generated
	 */
	EClass getGlobalScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.PreprocessorElement
	 * <em>Preprocessor Element</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Preprocessor Element</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PreprocessorElement
	 * @generated
	 */
	EClass getPreprocessorElement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DefinitionObject
	 * <em>Definition Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Definition Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DefinitionObject
	 * @generated
	 */
	EClass getDefinitionObject();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Type <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.Type#getIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Type#getIsConst()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsConst();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.Expression#getExpressionType
	 * <em>Expression Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Expression Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Expression#getExpressionType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ExpressionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Statement <em>Statement</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.MinorSyntaxObject
	 * <em>Minor Syntax Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Minor Syntax Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MinorSyntaxObject
	 * @generated
	 */
	EClass getMinorSyntaxObject();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Dimension <em>Dimension</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.Dimension#getLowBound
	 * <em>Low Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Low Bound</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.Dimension#getLowBound()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_LowBound();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.Dimension#getHighBound
	 * <em>High Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>High Bound</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Dimension#getHighBound()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_HighBound();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Name <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.Name#getNameString
	 * <em>Name String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name String</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Name#getNameString()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_NameString();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.SwitchCase#getIsEvaluateAllCases
	 * <em>Is Evaluate All Cases</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Evaluate All Cases</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.SwitchCase#getIsEvaluateAllCases()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EAttribute getSwitchCase_IsEvaluateAllCases();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.modisco.omg.gastm.SwitchCase#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SwitchCase#getBody()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CatchBlock <em>Catch Block</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Catch Block</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CatchBlock
	 * @generated
	 */
	EClass getCatchBlock();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.CatchBlock#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CatchBlock#getBody()
	 * @see #getCatchBlock()
	 * @generated
	 */
	EReference getCatchBlock_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.UnaryOperator
	 * <em>Unary Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BinaryOperator
	 * <em>Binary Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.StorageSpecification
	 * <em>Storage Specification</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Storage Specification</em>'.
	 * @see org.eclipse.modisco.omg.gastm.StorageSpecification
	 * @generated
	 */
	EClass getStorageSpecification();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.VirtualSpecification
	 * <em>Virtual Specification</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Virtual Specification</em>'.
	 * @see org.eclipse.modisco.omg.gastm.VirtualSpecification
	 * @generated
	 */
	EClass getVirtualSpecification();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AccessKind <em>Access Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Access Kind</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AccessKind
	 * @generated
	 */
	EClass getAccessKind();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ActualParameter
	 * <em>Actual Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Actual Parameter</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ActualParameter
	 * @generated
	 */
	EClass getActualParameter();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes
	 * <em>Function Member Attributes</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function Member Attributes</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionMemberAttributes
	 * @generated
	 */
	EClass getFunctionMemberAttributes();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsFriend
	 * <em>Is Friend</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Friend</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsFriend()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EAttribute getFunctionMemberAttributes_IsFriend();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsInLine
	 * <em>Is In Line</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is In Line</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsInLine()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EAttribute getFunctionMemberAttributes_IsInLine();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsThisConst
	 * <em>Is This Const</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is This Const</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsThisConst()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EAttribute getFunctionMemberAttributes_IsThisConst();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getVirtualSpecifier
	 * <em>Virtual Specifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Virtual Specifier</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getVirtualSpecifier()
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	EReference getFunctionMemberAttributes_VirtualSpecifier();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DerivesFrom <em>Derives From</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Derives From</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DerivesFrom
	 * @generated
	 */
	EClass getDerivesFrom();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DerivesFrom#getVirtualSpecifier
	 * <em>Virtual Specifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Virtual Specifier</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DerivesFrom#getVirtualSpecifier()
	 * @see #getDerivesFrom()
	 * @generated
	 */
	EReference getDerivesFrom_VirtualSpecifier();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DerivesFrom#getAccessKind
	 * <em>Access Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Access Kind</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DerivesFrom#getAccessKind()
	 * @see #getDerivesFrom()
	 * @generated
	 */
	EReference getDerivesFrom_AccessKind();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DerivesFrom#getClassName
	 * <em>Class Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Class Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DerivesFrom#getClassName()
	 * @see #getDerivesFrom()
	 * @generated
	 */
	EReference getDerivesFrom_ClassName();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.MemberObject <em>Member Object</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Member Object</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MemberObject
	 * @generated
	 */
	EClass getMemberObject();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.MemberObject#getOffset
	 * <em>Offset</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MemberObject#getOffset()
	 * @see #getMemberObject()
	 * @generated
	 */
	EAttribute getMemberObject_Offset();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.MemberObject#getMember
	 * <em>Member</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MemberObject#getMember()
	 * @see #getMemberObject()
	 * @generated
	 */
	EReference getMemberObject_Member();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition
	 * <em>Declaration Or Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Declaration Or Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeclarationOrDefinition
	 * @generated
	 */
	EClass getDeclarationOrDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getStorageSpecifiers
	 * <em>Storage Specifiers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Storage Specifiers</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getStorageSpecifiers()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EReference getDeclarationOrDefinition_StorageSpecifiers();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getAccessKind
	 * <em>Access Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Access Kind</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getAccessKind()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EReference getDeclarationOrDefinition_AccessKind();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getLinkageSpecifier
	 * <em>Linkage Specifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Linkage Specifier</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeclarationOrDefinition#getLinkageSpecifier()
	 * @see #getDeclarationOrDefinition()
	 * @generated
	 */
	EAttribute getDeclarationOrDefinition_LinkageSpecifier();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TypeDefinition
	 * <em>Type Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.TypeDefinition#getTypeName
	 * <em>Type Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type Name</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.TypeDefinition#getTypeName()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_TypeName();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition
	 * <em>Name Space Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name Space Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NameSpaceDefinition
	 * @generated
	 */
	EClass getNameSpaceDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpace
	 * <em>Name Space</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Name Space</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpace()
	 * @see #getNameSpaceDefinition()
	 * @generated
	 */
	EReference getNameSpaceDefinition_NameSpace();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getBody
	 * <em>Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Body</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getBody()
	 * @see #getNameSpaceDefinition()
	 * @generated
	 */
	EReference getNameSpaceDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpaceType
	 * <em>Name Space Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Name Space Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpaceType()
	 * @see #getNameSpaceDefinition()
	 * @generated
	 */
	EReference getNameSpaceDefinition_NameSpaceType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LabelDefinition
	 * <em>Label Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Label Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelDefinition
	 * @generated
	 */
	EClass getLabelDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelName
	 * <em>Label Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Label Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelName()
	 * @see #getLabelDefinition()
	 * @generated
	 */
	EReference getLabelDefinition_LabelName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelType
	 * <em>Label Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Label Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelDefinition#getLabelType()
	 * @see #getLabelDefinition()
	 * @generated
	 */
	EReference getLabelDefinition_LabelType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TypeDeclaration
	 * <em>Type Declaration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.TypeDeclaration#getTypeRef
	 * <em>Type Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type Ref</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.TypeDeclaration#getTypeRef()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_TypeRef();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.Definition#getIdentifierName
	 * <em>Identifier Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Identifier Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Definition#getIdentifierName()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_IdentifierName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.Definition#getDefinitionType
	 * <em>Definition Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Definition Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Definition#getDefinitionType()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_DefinitionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.Declaration#getDefRef
	 * <em>Def Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Def Ref</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Declaration#getDefRef()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_DefRef();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.Declaration#getIdentifierName
	 * <em>Identifier Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Identifier Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Declaration#getIdentifierName()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_IdentifierName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.Declaration#getDeclarationType
	 * <em>Declaration Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Declaration Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Declaration#getDeclarationType()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_DeclarationType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDefinition
	 * <em>Function Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDefinition#getReturnType
	 * <em>Return Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Return Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDefinition#getReturnType()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDefinition#getFormalParameters
	 * <em>Formal Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Formal Parameters</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDefinition#getFormalParameters()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_FormalParameters();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDefinition#getBody
	 * <em>Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Body</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDefinition#getBody()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDefinition#getFunctionMemberAttributes
	 * <em>Function Member Attributes</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Function Member Attributes</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDefinition#getFunctionMemberAttributes()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_FunctionMemberAttributes();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDefinition#getOpensScope
	 * <em>Opens Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Opens Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDefinition#getOpensScope()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_OpensScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EntryDefinition
	 * <em>Entry Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Entry Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EntryDefinition
	 * @generated
	 */
	EClass getEntryDefinition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.EntryDefinition#getFormalParameters
	 * <em>Formal Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Formal Parameters</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EntryDefinition#getFormalParameters()
	 * @see #getEntryDefinition()
	 * @generated
	 */
	EReference getEntryDefinition_FormalParameters();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.EntryDefinition#getBody
	 * <em>Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Body</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.EntryDefinition#getBody()
	 * @see #getEntryDefinition()
	 * @generated
	 */
	EReference getEntryDefinition_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DataDefinition
	 * <em>Data Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DataDefinition
	 * @generated
	 */
	EClass getDataDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DataDefinition#getInitialValue
	 * <em>Initial Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Initial Value</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DataDefinition#getInitialValue()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EReference getDataDefinition_InitialValue();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.DataDefinition#getIsMutable
	 * <em>Is Mutable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Mutable</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DataDefinition#getIsMutable()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EAttribute getDataDefinition_IsMutable();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EnumLiteralDefinition
	 * <em>Enum Literal Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Literal Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumLiteralDefinition
	 * @generated
	 */
	EClass getEnumLiteralDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.EnumLiteralDefinition#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumLiteralDefinition#getValue()
	 * @see #getEnumLiteralDefinition()
	 * @generated
	 */
	EReference getEnumLiteralDefinition_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDeclaration
	 * <em>Function Declaration</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFormalParameters
	 * <em>Formal Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Formal Parameters</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFormalParameters()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_FormalParameters();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFunctionMemberAttributes
	 * <em>Function Member Attributes</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Function Member Attributes</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFunctionMemberAttributes()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EReference getFunctionDeclaration_FunctionMemberAttributes();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.VariableDeclaration
	 * <em>Variable Declaration</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see org.eclipse.modisco.omg.gastm.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.VariableDeclaration#getIsMutable
	 * <em>Is Mutable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Mutable</em>'.
	 * @see org.eclipse.modisco.omg.gastm.VariableDeclaration#getIsMutable()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_IsMutable();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FormalParameterDeclaration
	 * <em>Formal Parameter Declaration</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Formal Parameter Declaration</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.FormalParameterDeclaration
	 * @generated
	 */
	EClass getFormalParameterDeclaration();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.External <em>External</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>External</em>'.
	 * @see org.eclipse.modisco.omg.gastm.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionPersistent
	 * <em>Function Persistent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Function Persistent</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionPersistent
	 * @generated
	 */
	EClass getFunctionPersistent();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FileLocal <em>File Local</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>File Local</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FileLocal
	 * @generated
	 */
	EClass getFileLocal();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.PerClassMember
	 * <em>Per Class Member</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Per Class Member</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PerClassMember
	 * @generated
	 */
	EClass getPerClassMember();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NoDef <em>No Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>No Def</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NoDef
	 * @generated
	 */
	EClass getNoDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Virtual <em>Virtual</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Virtual</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Virtual
	 * @generated
	 */
	EClass getVirtual();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.VariableDefinition
	 * <em>Variable Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Variable Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.VariableDefinition
	 * @generated
	 */
	EClass getVariableDefinition();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FormalParameterDefinition
	 * <em>Formal Parameter Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Formal Parameter Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FormalParameterDefinition
	 * @generated
	 */
	EClass getFormalParameterDefinition();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitFieldDefinition
	 * <em>Bit Field Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Field Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitFieldDefinition
	 * @generated
	 */
	EClass getBitFieldDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.BitFieldDefinition#getBitFieldSize
	 * <em>Bit Field Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Bit Field Size</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitFieldDefinition#getBitFieldSize()
	 * @see #getBitFieldDefinition()
	 * @generated
	 */
	EReference getBitFieldDefinition_BitFieldSize();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NamedTypeDefinition
	 * <em>Named Type Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Type Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NamedTypeDefinition
	 * @generated
	 */
	EClass getNamedTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NamedTypeDefinition#getDefinitionType
	 * <em>Definition Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Definition Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NamedTypeDefinition#getDefinitionType()
	 * @see #getNamedTypeDefinition()
	 * @generated
	 */
	EReference getNamedTypeDefinition_DefinitionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateTypeDefinition
	 * <em>Aggregate Type Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aggregate Type Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateTypeDefinition
	 * @generated
	 */
	EClass getAggregateTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateTypeDefinition#getAggregateType
	 * <em>Aggregate Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Aggregate Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateTypeDefinition#getAggregateType()
	 * @see #getAggregateTypeDefinition()
	 * @generated
	 */
	EReference getAggregateTypeDefinition_AggregateType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EnumTypeDefinition
	 * <em>Enum Type Definition</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Type Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumTypeDefinition
	 * @generated
	 */
	EClass getEnumTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.EnumTypeDefinition#getDefinitionType
	 * <em>Definition Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Definition Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumTypeDefinition#getDefinitionType()
	 * @see #getEnumTypeDefinition()
	 * @generated
	 */
	EReference getEnumTypeDefinition_DefinitionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateTypeDeclaration
	 * <em>Aggregate Type Declaration</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aggregate Type Declaration</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateTypeDeclaration
	 * @generated
	 */
	EClass getAggregateTypeDeclaration();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EnumTypeDeclaration
	 * <em>Enum Type Declaration</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Type Declaration</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumTypeDeclaration
	 * @generated
	 */
	EClass getEnumTypeDeclaration();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.IncludeUnit <em>Include Unit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Include Unit</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IncludeUnit
	 * @generated
	 */
	EClass getIncludeUnit();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.IncludeUnit#getFile <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IncludeUnit#getFile()
	 * @see #getIncludeUnit()
	 * @generated
	 */
	EReference getIncludeUnit_File();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.MacroCall <em>Macro Call</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Macro Call</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MacroCall
	 * @generated
	 */
	EClass getMacroCall();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.MacroCall#getRefersTo
	 * <em>Refers To</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Refers To</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.MacroCall#getRefersTo()
	 * @see #getMacroCall()
	 * @generated
	 */
	EReference getMacroCall_RefersTo();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.MacroDefinition
	 * <em>Macro Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Macro Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MacroDefinition
	 * @generated
	 */
	EClass getMacroDefinition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.MacroDefinition#getMacroName
	 * <em>Macro Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Macro Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MacroDefinition#getMacroName()
	 * @see #getMacroDefinition()
	 * @generated
	 */
	EAttribute getMacroDefinition_MacroName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.MacroDefinition#getBody
	 * <em>Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MacroDefinition#getBody()
	 * @see #getMacroDefinition()
	 * @generated
	 */
	EAttribute getMacroDefinition_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Comment <em>Comment</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionType <em>Function Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionType#getReturnType
	 * <em>Return Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Return Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionType#getReturnType()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionType#getParameterTypes
	 * <em>Parameter Types</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Parameter Types</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionType#getParameterTypes()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ParameterTypes();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DataType <em>Data Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NameSpaceType
	 * <em>Name Space Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name Space Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NameSpaceType
	 * @generated
	 */
	EClass getNameSpaceType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TypeReference
	 * <em>Type Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.PrimitiveType
	 * <em>Primitive Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EnumType <em>Enum Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.EnumType#getEnumLiterals
	 * <em>Enum Literals</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Enum Literals</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumType#getEnumLiterals()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_EnumLiterals();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ConstructedType
	 * <em>Constructed Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Constructed Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ConstructedType
	 * @generated
	 */
	EClass getConstructedType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ConstructedType#getBaseType
	 * <em>Base Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Base Type</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.ConstructedType#getBaseType()
	 * @see #getConstructedType()
	 * @generated
	 */
	EReference getConstructedType_BaseType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateType
	 * <em>Aggregate Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aggregate Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateType
	 * @generated
	 */
	EClass getAggregateType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateType#getMembers
	 * <em>Members</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Members</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateType#getMembers()
	 * @see #getAggregateType()
	 * @generated
	 */
	EReference getAggregateType_Members();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateType#getOpensScope
	 * <em>Opens Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Opens Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateType#getOpensScope()
	 * @see #getAggregateType()
	 * @generated
	 */
	EReference getAggregateType_OpensScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ExceptionType
	 * <em>Exception Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ExceptionType
	 * @generated
	 */
	EClass getExceptionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FormalParameterType
	 * <em>Formal Parameter Type</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Formal Parameter Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FormalParameterType
	 * @generated
	 */
	EClass getFormalParameterType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FormalParameterType#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FormalParameterType#getType()
	 * @see #getFormalParameterType()
	 * @generated
	 */
	EReference getFormalParameterType_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NamedType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NamedType#getBody()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Number Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NumberType
	 * @generated
	 */
	EClass getNumberType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.NumberType#getIsSigned
	 * <em>Is Signed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Signed</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NumberType#getIsSigned()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_IsSigned();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Void <em>Void</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Void</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Boolean <em>Boolean</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.IntegralType <em>Integral Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Integral Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IntegralType
	 * @generated
	 */
	EClass getIntegralType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.IntegralType#getSize <em>Size</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IntegralType#getSize()
	 * @see #getIntegralType()
	 * @generated
	 */
	EAttribute getIntegralType_Size();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.RealType <em>Real Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.RealType#getPrecision
	 * <em>Precision</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RealType#getPrecision()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Precision();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Byte <em>Byte</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Byte</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Byte
	 * @generated
	 */
	EClass getByte();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Character <em>Character</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Character</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ShortInteger <em>Short Integer</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Short Integer</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ShortInteger
	 * @generated
	 */
	EClass getShortInteger();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Integer <em>Integer</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LongInteger <em>Long Integer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Long Integer</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LongInteger
	 * @generated
	 */
	EClass getLongInteger();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Real <em>Real</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Real</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Double <em>Double</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Double</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Long Double</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LongDouble
	 * @generated
	 */
	EClass getLongDouble();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CollectionType
	 * <em>Collection Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Pointer Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PointerType
	 * @generated
	 */
	EClass getPointerType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.PointerType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PointerType#getSize()
	 * @see #getPointerType()
	 * @generated
	 */
	EAttribute getPointerType_Size();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ReferenceType
	 * <em>Reference Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.ArrayType#getRanks <em>Ranks</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Ranks</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ArrayType#getRanks()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Ranks();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.StructureType
	 * <em>Structure Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Structure Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.StructureType
	 * @generated
	 */
	EClass getStructureType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.ClassType#getDerivesFrom
	 * <em>Derives From</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Derives From</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ClassType#getDerivesFrom()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_DerivesFrom();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AnnotationType
	 * <em>Annotation Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ByValueFormalParameterType
	 * <em>By Value Formal Parameter Type</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>By Value Formal Parameter Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ByValueFormalParameterType
	 * @generated
	 */
	EClass getByValueFormalParameterType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ByReferenceFormalParameterType
	 * <em>By Reference Formal Parameter Type</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>By Reference Formal Parameter Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ByReferenceFormalParameterType
	 * @generated
	 */
	EClass getByReferenceFormalParameterType();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Public <em>Public</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Public</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Public
	 * @generated
	 */
	EClass getPublic();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Protected <em>Protected</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Protected</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Protected
	 * @generated
	 */
	EClass getProtected();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Private <em>Private</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Private</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Private
	 * @generated
	 */
	EClass getPrivate();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.UnnamedTypeReference
	 * <em>Unnamed Type Reference</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unnamed Type Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnnamedTypeReference
	 * @generated
	 */
	EClass getUnnamedTypeReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.UnnamedTypeReference#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnnamedTypeReference#getType()
	 * @see #getUnnamedTypeReference()
	 * @generated
	 */
	EReference getUnnamedTypeReference_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NamedTypeReference
	 * <em>Named Type Reference</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Type Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NamedTypeReference
	 * @generated
	 */
	EClass getNamedTypeReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NamedTypeReference#getTypeName
	 * <em>Type Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type Name</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.NamedTypeReference#getTypeName()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EReference getNamedTypeReference_TypeName();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NamedTypeReference#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NamedTypeReference#getType()
	 * @see #getNamedTypeReference()
	 * @generated
	 */
	EReference getNamedTypeReference_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ExpressionStatement
	 * <em>Expression Statement</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ExpressionStatement#getExpression
	 * <em>Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.JumpStatement
	 * <em>Jump Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Jump Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.JumpStatement
	 * @generated
	 */
	EClass getJumpStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.JumpStatement#getTarget
	 * <em>Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.modisco.omg.gastm.JumpStatement#getTarget()
	 * @see #getJumpStatement()
	 * @generated
	 */
	EReference getJumpStatement_Target();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BreakStatement
	 * <em>Break Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.BreakStatement#getTarget
	 * <em>Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BreakStatement#getTarget()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_Target();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ContinueStatement
	 * <em>Continue Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ContinueStatement#getTarget
	 * <em>Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ContinueStatement#getTarget()
	 * @see #getContinueStatement()
	 * @generated
	 */
	EReference getContinueStatement_Target();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LabeledStatement
	 * <em>Labeled Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Labeled Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabeledStatement
	 * @generated
	 */
	EClass getLabeledStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LabeledStatement#getLabel
	 * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabeledStatement#getLabel()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_Label();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LabeledStatement#getStatement
	 * <em>Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Statement</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.LabeledStatement#getStatement()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_Statement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BlockStatement
	 * <em>Block Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Block Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BlockStatement
	 * @generated
	 */
	EClass getBlockStatement();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.BlockStatement#getSubStatements
	 * <em>Sub Statements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Sub Statements</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BlockStatement#getSubStatements()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_SubStatements();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.BlockStatement#getOpensScope
	 * <em>Opens Scope</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Opens Scope</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BlockStatement#getOpensScope()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_OpensScope();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EmptyStatement
	 * <em>Empty Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Empty Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EmptyStatement
	 * @generated
	 */
	EClass getEmptyStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.IfStatement#getCondition
	 * <em>Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Condition</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.IfStatement#getThenBody
	 * <em>Then Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Then Body</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.IfStatement#getThenBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenBody();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.IfStatement#getElseBody
	 * <em>Else Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Else Body</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.IfStatement#getElseBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseBody();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.SwitchStatement
	 * <em>Switch Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.SwitchStatement#getSwitchExpression
	 * <em>Switch Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Switch Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SwitchStatement#getSwitchExpression()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_SwitchExpression();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.SwitchStatement#getCases
	 * <em>Cases</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Cases</em>'.
	 * @see org.eclipse.modisco.omg.gastm.SwitchStatement#getCases()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Cases();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ReturnStatement
	 * <em>Return Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ReturnStatement#getReturnValue
	 * <em>Return Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Return Value</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ReturnStatement#getReturnValue()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_ReturnValue();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LoopStatement
	 * <em>Loop Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LoopStatement#getCondition
	 * <em>Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Condition</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.LoopStatement#getCondition()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LoopStatement#getBody <em>Body</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LoopStatement#getBody()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Body();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TryStatement <em>Try Statement</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Try Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TryStatement
	 * @generated
	 */
	EClass getTryStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.TryStatement#getGuardedStatement
	 * <em>Guarded Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Guarded Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TryStatement#getGuardedStatement()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_GuardedStatement();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.TryStatement#getCatchBlocks
	 * <em>Catch Blocks</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Catch Blocks</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TryStatement#getCatchBlocks()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_CatchBlocks();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.TryStatement#getFinalStatement
	 * <em>Final Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Final Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TryStatement#getFinalStatement()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_FinalStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement
	 * <em>Declaration Or Definition Statement</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Declaration Or Definition Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement
	 * @generated
	 */
	EClass getDeclarationOrDefinitionStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement#getDeclOrDefn
	 * <em>Decl Or Defn</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Decl Or Defn</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement#getDeclOrDefn()
	 * @see #getDeclarationOrDefinitionStatement()
	 * @generated
	 */
	EReference getDeclarationOrDefinitionStatement_DeclOrDefn();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ThrowStatement
	 * <em>Throw Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ThrowStatement#getException
	 * <em>Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Exception</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.ThrowStatement#getException()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Exception();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DeleteStatement
	 * <em>Delete Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Delete Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeleteStatement
	 * @generated
	 */
	EClass getDeleteStatement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.DeleteStatement#getOperand
	 * <em>Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DeleteStatement#getOperand()
	 * @see #getDeleteStatement()
	 * @generated
	 */
	EReference getDeleteStatement_Operand();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TerminateStatement
	 * <em>Terminate Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Terminate Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TerminateStatement
	 * @generated
	 */
	EClass getTerminateStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CaseBlock <em>Case Block</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Case Block</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CaseBlock
	 * @generated
	 */
	EClass getCaseBlock();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.CaseBlock#getCaseExpressions
	 * <em>Case Expressions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Case Expressions</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CaseBlock#getCaseExpressions()
	 * @see #getCaseBlock()
	 * @generated
	 */
	EReference getCaseBlock_CaseExpressions();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DefaultBlock <em>Default Block</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Default Block</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DefaultBlock
	 * @generated
	 */
	EClass getDefaultBlock();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.WhileStatement
	 * <em>While Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.DoWhileStatement
	 * <em>Do While Statement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Do While Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.DoWhileStatement
	 * @generated
	 */
	EClass getDoWhileStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ForStatement <em>For Statement</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.ForStatement#getInitBody
	 * <em>Init Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Init Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ForStatement#getInitBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_InitBody();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.ForStatement#getIterationBody
	 * <em>Iteration Body</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Iteration Body</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ForStatement#getIterationBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_IterationBody();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ForCheckBeforeStatement
	 * <em>For Check Before Statement</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>For Check Before Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ForCheckBeforeStatement
	 * @generated
	 */
	EClass getForCheckBeforeStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ForCheckAfterStatement
	 * <em>For Check After Statement</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>For Check After Statement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ForCheckAfterStatement
	 * @generated
	 */
	EClass getForCheckAfterStatement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TypesCatchBlock
	 * <em>Types Catch Block</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Types Catch Block</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypesCatchBlock
	 * @generated
	 */
	EClass getTypesCatchBlock();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.TypesCatchBlock#getExceptions
	 * <em>Exceptions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Exceptions</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypesCatchBlock#getExceptions()
	 * @see #getTypesCatchBlock()
	 * @generated
	 */
	EReference getTypesCatchBlock_Exceptions();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.VariableCatchBlock
	 * <em>Variable Catch Block</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable Catch Block</em>'.
	 * @see org.eclipse.modisco.omg.gastm.VariableCatchBlock
	 * @generated
	 */
	EClass getVariableCatchBlock();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.VariableCatchBlock#getExceptionVariable
	 * <em>Exception Variable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Exception Variable</em>'.
	 * @see org.eclipse.modisco.omg.gastm.VariableCatchBlock#getExceptionVariable()
	 * @see #getVariableCatchBlock()
	 * @generated
	 */
	EReference getVariableCatchBlock_ExceptionVariable();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Literal <em>Literal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.modisco.omg.gastm.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CastExpression
	 * <em>Cast Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.CastExpression#getCastType
	 * <em>Cast Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cast Type</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.CastExpression#getCastType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_CastType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.CastExpression#getExpression
	 * <em>Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CastExpression#getExpression()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Expression();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateExpression
	 * <em>Aggregate Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Aggregate Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateExpression
	 * @generated
	 */
	EClass getAggregateExpression();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.AggregateExpression#getSubExpressions
	 * <em>Sub Expressions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Sub Expressions</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AggregateExpression#getSubExpressions()
	 * @see #getAggregateExpression()
	 * @generated
	 */
	EReference getAggregateExpression_SubExpressions();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.UnaryExpression
	 * <em>Unary Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.UnaryExpression#getOperator
	 * <em>Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Operator</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.UnaryExpression#getOperand
	 * <em>Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BinaryExpression
	 * <em>Binary Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.BinaryExpression#getOperator
	 * <em>Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Operator</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.BinaryExpression#getLeftOperand
	 * <em>Left Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Left Operand</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BinaryExpression#getLeftOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.BinaryExpression#getRightOperand
	 * <em>Right Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Right Operand</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BinaryExpression#getRightOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightOperand();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ConditionalExpression
	 * <em>Conditional Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getCondition
	 * <em>Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Condition</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.ConditionalExpression#getCondition()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnTrueOperand
	 * <em>On True Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>On True Operand</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnTrueOperand()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_OnTrueOperand();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnFalseOperand
	 * <em>On False Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>On False Operand</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnFalseOperand()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_OnFalseOperand();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.RangeExpression
	 * <em>Range Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Range Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RangeExpression
	 * @generated
	 */
	EClass getRangeExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.RangeExpression#getFromExpression
	 * <em>From Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>From Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RangeExpression#getFromExpression()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_FromExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.RangeExpression#getToExpression
	 * <em>To Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>To Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RangeExpression#getToExpression()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_ToExpression();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionCallExpression
	 * <em>Function Call Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function Call Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionCallExpression
	 * @generated
	 */
	EClass getFunctionCallExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionCallExpression#getCalledFunction
	 * <em>Called Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Called Function</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionCallExpression#getCalledFunction()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_CalledFunction();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.FunctionCallExpression#getActualParams
	 * <em>Actual Params</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Actual Params</em>'.
	 * @see org.eclipse.modisco.omg.gastm.FunctionCallExpression#getActualParams()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_ActualParams();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NewExpression
	 * <em>New Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>New Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NewExpression
	 * @generated
	 */
	EClass getNewExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NewExpression#getNewType
	 * <em>New Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>New Type</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.NewExpression#getNewType()
	 * @see #getNewExpression()
	 * @generated
	 */
	EReference getNewExpression_NewType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.NewExpression#getActualParams
	 * <em>Actual Params</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Actual Params</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NewExpression#getActualParams()
	 * @see #getNewExpression()
	 * @generated
	 */
	EReference getNewExpression_ActualParams();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NameReference
	 * <em>Name Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Name Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NameReference
	 * @generated
	 */
	EClass getNameReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NameReference#getName <em>Name</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NameReference#getName()
	 * @see #getNameReference()
	 * @generated
	 */
	EReference getNameReference_Name();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.NameReference#getRefersTo
	 * <em>Refers To</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Refers To</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.NameReference#getRefersTo()
	 * @see #getNameReference()
	 * @generated
	 */
	EReference getNameReference_RefersTo();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Label Access</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelAccess
	 * @generated
	 */
	EClass getLabelAccess();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.LabelAccess#getLabelName
	 * <em>Label Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Label Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelAccess#getLabelName()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_LabelName();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.modisco.omg.gastm.LabelAccess#getLabelDefinition
	 * <em>Label Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Label Definition</em>'.
	 * @see org.eclipse.modisco.omg.gastm.LabelAccess#getLabelDefinition()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EReference getLabelAccess_LabelDefinition();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Array Access</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ArrayAccess
	 * @generated
	 */
	EClass getArrayAccess();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ArrayAccess#getArrayName
	 * <em>Array Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Array Name</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ArrayAccess#getArrayName()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_ArrayName();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.ArrayAccess#getSubscripts
	 * <em>Subscripts</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Subscripts</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ArrayAccess#getSubscripts()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Subscripts();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AnnotationExpression
	 * <em>Annotation Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Annotation Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AnnotationExpression
	 * @generated
	 */
	EClass getAnnotationExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.AnnotationExpression#getAnnotationType
	 * <em>Annotation Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Annotation Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AnnotationExpression#getAnnotationType()
	 * @see #getAnnotationExpression()
	 * @generated
	 */
	EReference getAnnotationExpression_AnnotationType();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.AnnotationExpression#getMemberValues
	 * <em>Member Values</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Member Values</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AnnotationExpression#getMemberValues()
	 * @see #getAnnotationExpression()
	 * @generated
	 */
	EReference getAnnotationExpression_MemberValues();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CollectionExpression
	 * <em>Collection Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Collection Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CollectionExpression
	 * @generated
	 */
	EClass getCollectionExpression();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.CollectionExpression#getExpressionList
	 * <em>Expression List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Expression List</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CollectionExpression#getExpressionList()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EReference getCollectionExpression_ExpressionList();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.IdentifierReference
	 * <em>Identifier Reference</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Identifier Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IdentifierReference
	 * @generated
	 */
	EClass getIdentifierReference();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference
	 * <em>Qualified Identifier Reference</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Qualified Identifier Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference
	 * @generated
	 */
	EClass getQualifiedIdentifierReference();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getQualifiers
	 * <em>Qualifiers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Qualifiers</em>'.
	 * @see org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getQualifiers()
	 * @see #getQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getQualifiedIdentifierReference_Qualifiers();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getMember
	 * <em>Member</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getMember()
	 * @see #getQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getQualifiedIdentifierReference_Member();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference
	 * <em>Type Qualified Identifier Reference</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>Type Qualified Identifier Reference</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference
	 * @generated
	 */
	EClass getTypeQualifiedIdentifierReference();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference#getAggregateType
	 * <em>Aggregate Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Aggregate Type</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference#getAggregateType()
	 * @see #getTypeQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getTypeQualifiedIdentifierReference_AggregateType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference#getMember
	 * <em>Member</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference#getMember()
	 * @see #getTypeQualifiedIdentifierReference()
	 * @generated
	 */
	EReference getTypeQualifiedIdentifierReference_Member();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.QualifiedOverPointer
	 * <em>Qualified Over Pointer</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Qualified Over Pointer</em>'.
	 * @see org.eclipse.modisco.omg.gastm.QualifiedOverPointer
	 * @generated
	 */
	EClass getQualifiedOverPointer();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.QualifiedOverData
	 * <em>Qualified Over Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Qualified Over Data</em>'.
	 * @see org.eclipse.modisco.omg.gastm.QualifiedOverData
	 * @generated
	 */
	EClass getQualifiedOverData();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.IntegerLiteral
	 * <em>Integer Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.CharLiteral <em>Char Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Char Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.CharLiteral
	 * @generated
	 */
	EClass getCharLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.StringLiteral
	 * <em>String Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BooleanLiteral
	 * <em>Boolean Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitLiteral <em>Bit Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitLiteral
	 * @generated
	 */
	EClass getBitLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.UnaryPlus <em>Unary Plus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unary Plus</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnaryPlus
	 * @generated
	 */
	EClass getUnaryPlus();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.UnaryMinus <em>Unary Minus</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Unary Minus</em>'.
	 * @see org.eclipse.modisco.omg.gastm.UnaryMinus
	 * @generated
	 */
	EClass getUnaryMinus();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Not <em>Not</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Not</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitNot <em>Bit Not</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Not</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitNot
	 * @generated
	 */
	EClass getBitNot();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.AddressOf <em>Address Of</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Address Of</em>'.
	 * @see org.eclipse.modisco.omg.gastm.AddressOf
	 * @generated
	 */
	EClass getAddressOf();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Deref <em>Deref</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Deref</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Deref
	 * @generated
	 */
	EClass getDeref();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Increment <em>Increment</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Increment</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Increment
	 * @generated
	 */
	EClass getIncrement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Decrement <em>Decrement</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Decrement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Decrement
	 * @generated
	 */
	EClass getDecrement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.PostIncrement
	 * <em>Post Increment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Post Increment</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PostIncrement
	 * @generated
	 */
	EClass getPostIncrement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.PostDecrement
	 * <em>Post Decrement</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Post Decrement</em>'.
	 * @see org.eclipse.modisco.omg.gastm.PostDecrement
	 * @generated
	 */
	EClass getPostDecrement();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Add <em>Add</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Subtract <em>Subtract</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Subtract</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Subtract
	 * @generated
	 */
	EClass getSubtract();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Multiply <em>Multiply</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Divide <em>Divide</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Modulus <em>Modulus</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Modulus</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Modulus
	 * @generated
	 */
	EClass getModulus();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Exponent <em>Exponent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Exponent</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Exponent
	 * @generated
	 */
	EClass getExponent();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.And <em>And</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>And</em>'.
	 * @see org.eclipse.modisco.omg.gastm.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Or <em>Or</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Or</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Equal <em>Equal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NotEqual <em>Not Equal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Not Equal</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NotEqual
	 * @generated
	 */
	EClass getNotEqual();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Greater <em>Greater</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NotGreater <em>Not Greater</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Not Greater</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NotGreater
	 * @generated
	 */
	EClass getNotGreater();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Less <em>Less</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Less</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.NotLess <em>Not Less</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Not Less</em>'.
	 * @see org.eclipse.modisco.omg.gastm.NotLess
	 * @generated
	 */
	EClass getNotLess();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitAnd <em>Bit And</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit And</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitAnd
	 * @generated
	 */
	EClass getBitAnd();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitOr <em>Bit Or</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Or</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitOr
	 * @generated
	 */
	EClass getBitOr();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitXor <em>Bit Xor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Xor</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitXor
	 * @generated
	 */
	EClass getBitXor();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitLeftShift
	 * <em>Bit Left Shift</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Left Shift</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitLeftShift
	 * @generated
	 */
	EClass getBitLeftShift();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.BitRightShift
	 * <em>Bit Right Shift</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Bit Right Shift</em>'.
	 * @see org.eclipse.modisco.omg.gastm.BitRightShift
	 * @generated
	 */
	EClass getBitRightShift();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.Assign <em>Assign</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see org.eclipse.modisco.omg.gastm.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.OperatorAssign
	 * <em>Operator Assign</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operator Assign</em>'.
	 * @see org.eclipse.modisco.omg.gastm.OperatorAssign
	 * @generated
	 */
	EClass getOperatorAssign();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.OperatorAssign#getOperator
	 * <em>Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Operator</em>
	 *         '.
	 * @see org.eclipse.modisco.omg.gastm.OperatorAssign#getOperator()
	 * @see #getOperatorAssign()
	 * @generated
	 */
	EReference getOperatorAssign_Operator();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ActualParameterExpression
	 * <em>Actual Parameter Expression</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Actual Parameter Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ActualParameterExpression
	 * @generated
	 */
	EClass getActualParameterExpression();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.modisco.omg.gastm.ActualParameterExpression#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ActualParameterExpression#getValue()
	 * @see #getActualParameterExpression()
	 * @generated
	 */
	EReference getActualParameterExpression_Value();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.MissingActualParameter
	 * <em>Missing Actual Parameter</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Missing Actual Parameter</em>'.
	 * @see org.eclipse.modisco.omg.gastm.MissingActualParameter
	 * @generated
	 */
	EClass getMissingActualParameter();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ByValueActualParameterExpression
	 * <em>By Value Actual Parameter Expression</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>By Value Actual Parameter Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ByValueActualParameterExpression
	 * @generated
	 */
	EClass getByValueActualParameterExpression();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.modisco.omg.gastm.ByReferenceActualParameterExpression
	 * <em>By Reference Actual Parameter Expression</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '
	 *         <em>By Reference Actual Parameter Expression</em>'.
	 * @see org.eclipse.modisco.omg.gastm.ByReferenceActualParameterExpression
	 * @generated
	 */
	EClass getByReferenceActualParameterExpression();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GASTMFactory getGASTMFactory();

} // GASTMPackage
