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
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkFactory
 * @model kind="package"
 * @generated
 */
public interface JavaBenchmarkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaBenchmark";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/JavaBenchmark/0.9.0/javaBenchmark";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaBenchmark";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaBenchmarkPackage eINSTANCE = org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl <em>Abstract CDO Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getAbstractCDODiscovery()
	 * @generated
	 */
	int ABSTRACT_CDO_DISCOVERY = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Revised Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY__CACHE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Server Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Current Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY = 4;

	/**
	 * The feature id for the '<em><b>Init Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS = 5;

	/**
	 * The number of structural features of the '<em>Abstract CDO Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractJavaProjectImpl <em>Abstract Java Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractJavaProjectImpl
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getAbstractJavaProject()
	 * @generated
	 */
	int ABSTRACT_JAVA_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Average Java Classes Per Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Java Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_JAVA_PROJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl <em>Java Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getJavaProject()
	 * @generated
	 */
	int JAVA_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Average Java Classes Per Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE = ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__NAME = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__TOTAL_LINES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__FILES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Average File Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Average Lines Per File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__AVERAGE_LINES_PER_FILE = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT__TOTAL_SIZE_IN_BYTES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Java Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_PROJECT_FEATURE_COUNT = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaDiscoveredProjectImpl <em>Java Discovered Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaDiscoveredProjectImpl
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getJavaDiscoveredProject()
	 * @generated
	 */
	int JAVA_DISCOVERED_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Average Java Classes Per Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE = ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__NAME = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__TOTAL_LINES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__FILES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Average File Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Average Lines Per File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__AVERAGE_LINES_PER_FILE = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__TOTAL_SIZE_IN_BYTES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Discoveries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT__DISCOVERIES = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Java Discovered Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DISCOVERED_PROJECT_FEATURE_COUNT = ABSTRACT_JAVA_PROJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl <em>CDO Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getCDODiscovery()
	 * @generated
	 */
	int CDO_DISCOVERY = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__VERSION = ABSTRACT_CDO_DISCOVERY__VERSION;

	/**
	 * The feature id for the '<em><b>Revised Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__REVISED_LRU_CAPACITY = ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__CACHE_TYPE = ABSTRACT_CDO_DISCOVERY__CACHE_TYPE;

	/**
	 * The feature id for the '<em><b>Server Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__SERVER_DESCRIPTION = ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Current Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__CURRENT_LRU_CAPACITY = ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY;

	/**
	 * The feature id for the '<em><b>Init Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__INIT_TIME_IN_SECONDS = ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS;

	/**
	 * The feature id for the '<em><b>Dicovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__DICOVERY_DATE = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__ALGORITHM_VARIANT = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discoverer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__DISCOVERER_ID = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discoverer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__DISCOVERER_CLASS_NAME = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__SAVE_TIME_IN_SECONDS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Meta Model Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__META_MODEL_VARIANT = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Of Model Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xmi Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__XMI_SIZE_IN_BYTES = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__NAME = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Discovery Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY__DISCOVERY_ERROR = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>CDO Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_DISCOVERY_FEATURE_COUNT = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDOProjectDiscoveryImpl <em>CDO Project Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDOProjectDiscoveryImpl
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getCDOProjectDiscovery()
	 * @generated
	 */
	int CDO_PROJECT_DISCOVERY = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__VERSION = ABSTRACT_CDO_DISCOVERY__VERSION;

	/**
	 * The feature id for the '<em><b>Revised Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__REVISED_LRU_CAPACITY = ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__CACHE_TYPE = ABSTRACT_CDO_DISCOVERY__CACHE_TYPE;

	/**
	 * The feature id for the '<em><b>Server Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__SERVER_DESCRIPTION = ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Current Lru Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__CURRENT_LRU_CAPACITY = ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY;

	/**
	 * The feature id for the '<em><b>Init Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__INIT_TIME_IN_SECONDS = ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS;

	/**
	 * The feature id for the '<em><b>Dicovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__DICOVERY_DATE = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algorithm Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__ALGORITHM_VARIANT = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discoverer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__DISCOVERER_ID = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discoverer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__DISCOVERER_CLASS_NAME = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__SAVE_TIME_IN_SECONDS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Meta Model Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__META_MODEL_VARIANT = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__MAX_USED_MEMORY_IN_BYTES = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Number Of Model Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xmi Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__XMI_SIZE_IN_BYTES = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__NAME = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Discovery Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__DISCOVERY_ERROR = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY__PROJECTS = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>CDO Project Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_PROJECT_DISCOVERY_FEATURE_COUNT = ABSTRACT_CDO_DISCOVERY_FEATURE_COUNT + 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery <em>Abstract CDO Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract CDO Discovery</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery
	 * @generated
	 */
	EClass getAbstractCDODiscovery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getVersion()
	 * @see #getAbstractCDODiscovery()
	 * @generated
	 */
	EAttribute getAbstractCDODiscovery_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getRevisedLruCapacity <em>Revised Lru Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revised Lru Capacity</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getRevisedLruCapacity()
	 * @see #getAbstractCDODiscovery()
	 * @generated
	 */
	EAttribute getAbstractCDODiscovery_RevisedLruCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Type</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCacheType()
	 * @see #getAbstractCDODiscovery()
	 * @generated
	 */
	EAttribute getAbstractCDODiscovery_CacheType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getServerDescription <em>Server Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Description</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getServerDescription()
	 * @see #getAbstractCDODiscovery()
	 * @generated
	 */
	EAttribute getAbstractCDODiscovery_ServerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCurrentLruCapacity <em>Current Lru Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Lru Capacity</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getCurrentLruCapacity()
	 * @see #getAbstractCDODiscovery()
	 * @generated
	 */
	EAttribute getAbstractCDODiscovery_CurrentLruCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getInitTimeInSeconds <em>Init Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Time In Seconds</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery#getInitTimeInSeconds()
	 * @see #getAbstractCDODiscovery()
	 * @generated
	 */
	EAttribute getAbstractCDODiscovery_InitTimeInSeconds();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject <em>Abstract Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Java Project</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject
	 * @generated
	 */
	EClass getAbstractJavaProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject#getAverageJavaClassesPerPackage <em>Average Java Classes Per Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Java Classes Per Package</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject#getAverageJavaClassesPerPackage()
	 * @see #getAbstractJavaProject()
	 * @generated
	 */
	EAttribute getAbstractJavaProject_AverageJavaClassesPerPackage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Project</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject
	 * @generated
	 */
	EClass getJavaProject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject <em>Java Discovered Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Discovered Project</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject
	 * @generated
	 */
	EClass getJavaDiscoveredProject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery <em>CDO Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO Discovery</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery
	 * @generated
	 */
	EClass getCDODiscovery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery <em>CDO Project Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO Project Discovery</em>'.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery
	 * @generated
	 */
	EClass getCDOProjectDiscovery();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaBenchmarkFactory getJavaBenchmarkFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl <em>Abstract CDO Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getAbstractCDODiscovery()
		 * @generated
		 */
		EClass ABSTRACT_CDO_DISCOVERY = eINSTANCE.getAbstractCDODiscovery();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CDO_DISCOVERY__VERSION = eINSTANCE.getAbstractCDODiscovery_Version();

		/**
		 * The meta object literal for the '<em><b>Revised Lru Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY = eINSTANCE.getAbstractCDODiscovery_RevisedLruCapacity();

		/**
		 * The meta object literal for the '<em><b>Cache Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CDO_DISCOVERY__CACHE_TYPE = eINSTANCE.getAbstractCDODiscovery_CacheType();

		/**
		 * The meta object literal for the '<em><b>Server Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION = eINSTANCE.getAbstractCDODiscovery_ServerDescription();

		/**
		 * The meta object literal for the '<em><b>Current Lru Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY = eINSTANCE.getAbstractCDODiscovery_CurrentLruCapacity();

		/**
		 * The meta object literal for the '<em><b>Init Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS = eINSTANCE.getAbstractCDODiscovery_InitTimeInSeconds();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractJavaProjectImpl <em>Abstract Java Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractJavaProjectImpl
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getAbstractJavaProject()
		 * @generated
		 */
		EClass ABSTRACT_JAVA_PROJECT = eINSTANCE.getAbstractJavaProject();

		/**
		 * The meta object literal for the '<em><b>Average Java Classes Per Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE = eINSTANCE.getAbstractJavaProject_AverageJavaClassesPerPackage();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl <em>Java Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getJavaProject()
		 * @generated
		 */
		EClass JAVA_PROJECT = eINSTANCE.getJavaProject();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaDiscoveredProjectImpl <em>Java Discovered Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaDiscoveredProjectImpl
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getJavaDiscoveredProject()
		 * @generated
		 */
		EClass JAVA_DISCOVERED_PROJECT = eINSTANCE.getJavaDiscoveredProject();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl <em>CDO Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getCDODiscovery()
		 * @generated
		 */
		EClass CDO_DISCOVERY = eINSTANCE.getCDODiscovery();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDOProjectDiscoveryImpl <em>CDO Project Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDOProjectDiscoveryImpl
		 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkPackageImpl#getCDOProjectDiscovery()
		 * @generated
		 */
		EClass CDO_PROJECT_DISCOVERY = eINSTANCE.getCDOProjectDiscovery();

	}

} //JavaBenchmarkPackage
