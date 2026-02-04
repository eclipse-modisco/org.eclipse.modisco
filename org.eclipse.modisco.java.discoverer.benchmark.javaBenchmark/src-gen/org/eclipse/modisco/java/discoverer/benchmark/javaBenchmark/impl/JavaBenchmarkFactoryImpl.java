/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.*;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDOProjectDiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkFactory;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaDiscoveredProject;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaBenchmarkFactoryImpl extends EFactoryImpl implements JavaBenchmarkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaBenchmarkFactory init() {
		try {
			JavaBenchmarkFactory theJavaBenchmarkFactory = (JavaBenchmarkFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/JavaBenchmark/0.9.0/javaBenchmark"); 
			if (theJavaBenchmarkFactory != null) {
				return theJavaBenchmarkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaBenchmarkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBenchmarkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaBenchmarkPackage.JAVA_PROJECT: return createJavaProject();
			case JavaBenchmarkPackage.JAVA_DISCOVERED_PROJECT: return createJavaDiscoveredProject();
			case JavaBenchmarkPackage.CDO_DISCOVERY: return createCDODiscovery();
			case JavaBenchmarkPackage.CDO_PROJECT_DISCOVERY: return createCDOProjectDiscovery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaProject createJavaProject() {
		JavaProjectImpl javaProject = new JavaProjectImpl();
		return javaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDiscoveredProject createJavaDiscoveredProject() {
		JavaDiscoveredProjectImpl javaDiscoveredProject = new JavaDiscoveredProjectImpl();
		return javaDiscoveredProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDODiscovery createCDODiscovery() {
		CDODiscoveryImpl cdoDiscovery = new CDODiscoveryImpl();
		return cdoDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOProjectDiscovery createCDOProjectDiscovery() {
		CDOProjectDiscoveryImpl cdoProjectDiscovery = new CDOProjectDiscoveryImpl();
		return cdoProjectDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaBenchmarkPackage getJavaBenchmarkPackage() {
		return (JavaBenchmarkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaBenchmarkPackage getPackage() {
		return JavaBenchmarkPackage.eINSTANCE;
	}

} //JavaBenchmarkFactoryImpl
