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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage
 * @generated
 */
public interface JavaBenchmarkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaBenchmarkFactory eINSTANCE = org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaBenchmarkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Project</em>'.
	 * @generated
	 */
	JavaProject createJavaProject();

	/**
	 * Returns a new object of class '<em>Java Discovered Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Discovered Project</em>'.
	 * @generated
	 */
	JavaDiscoveredProject createJavaDiscoveredProject();

	/**
	 * Returns a new object of class '<em>CDO Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Discovery</em>'.
	 * @generated
	 */
	CDODiscovery createCDODiscovery();

	/**
	 * Returns a new object of class '<em>CDO Project Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Project Discovery</em>'.
	 * @generated
	 */
	CDOProjectDiscovery createCDOProjectDiscovery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaBenchmarkPackage getJavaBenchmarkPackage();

} //JavaBenchmarkFactory
