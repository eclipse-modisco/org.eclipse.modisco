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
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.infra.discovery.benchmark.File;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractJavaProject;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Java Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractJavaProjectImpl#getAverageJavaClassesPerPackage <em>Average Java Classes Per Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractJavaProjectImpl extends EObjectImpl implements AbstractJavaProject {
	/**
	 * The default value of the '{@link #getAverageJavaClassesPerPackage() <em>Average Java Classes Per Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageJavaClassesPerPackage()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_JAVA_CLASSES_PER_PACKAGE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractJavaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBenchmarkPackage.Literals.ABSTRACT_JAVA_PROJECT;
	}
	
	public abstract List<File> getFiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getAverageJavaClassesPerPackage() {
		Set<String> packageNames = new HashSet<String>();
		for (File file : getFiles()) {
			String filepath = file.getFilepath();
			int index = filepath.lastIndexOf('/');
			String packageName = filepath.substring(0, index);
			packageNames.add(packageName);
		}
		// rounded to two decimal places
		return rounded((double)getFiles().size() / (double)packageNames.size());
	}
	
	private static double rounded(final double value) {
		return (int)(value * 100.0) / 100.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBenchmarkPackage.ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE:
				return getAverageJavaClassesPerPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaBenchmarkPackage.ABSTRACT_JAVA_PROJECT__AVERAGE_JAVA_CLASSES_PER_PACKAGE:
				return getAverageJavaClassesPerPackage() != AVERAGE_JAVA_CLASSES_PER_PACKAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AbstractJavaProjectImpl
