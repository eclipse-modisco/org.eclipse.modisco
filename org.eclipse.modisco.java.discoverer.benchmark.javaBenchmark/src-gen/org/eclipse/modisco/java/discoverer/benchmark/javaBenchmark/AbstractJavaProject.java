/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Java Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject#getAverageJavaClassesPerPackage <em>Average Java Classes Per Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractJavaProject()
 * @model abstract="true"
 * @generated
 */
public interface AbstractJavaProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Average Java Classes Per Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Java Classes Per Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Java Classes Per Package</em>' attribute.
	 * @see org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage#getAbstractJavaProject_AverageJavaClassesPerPackage()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getAverageJavaClassesPerPackage();

} // AbstractJavaProject
