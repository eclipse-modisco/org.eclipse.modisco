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
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.File;
import org.eclipse.modisco.infra.discovery.benchmark.Project;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl#getTotalLines <em>Total Lines</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl#getAverageFileSizeInBytes <em>Average File Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl#getAverageLinesPerFile <em>Average Lines Per File</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.JavaProjectImpl#getTotalSizeInBytes <em>Total Size In Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaProjectImpl extends AbstractJavaProjectImpl implements JavaProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalLines() <em>Total Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLines()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_LINES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The default value of the '{@link #getAverageFileSizeInBytes() <em>Average File Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageFileSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long AVERAGE_FILE_SIZE_IN_BYTES_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getAverageLinesPerFile() <em>Average Lines Per File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageLinesPerFile()
	 * @generated
	 * @ordered
	 */
	protected static final long AVERAGE_LINES_PER_FILE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getTotalSizeInBytes() <em>Total Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_SIZE_IN_BYTES_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBenchmarkPackage.Literals.JAVA_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.JAVA_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getTotalLines() {
		long lines = 0;
		for (File file : getFiles()) {
			lines += file.getLines();
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, JavaBenchmarkPackage.JAVA_PROJECT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getAverageFileSizeInBytes() {
		return getFiles().size() != 0 ? getTotalSizeInBytes() / getFiles().size() : 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getAverageLinesPerFile() {
		return getFiles().size() != 0 ? getTotalLines() / getFiles().size() : 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getTotalSizeInBytes() {
		long totalSize = 0;
		for (File file : getFiles()) {
			totalSize += file.getSizeInBytes();
		}
		return totalSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaBenchmarkPackage.JAVA_PROJECT__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBenchmarkPackage.JAVA_PROJECT__NAME:
				return getName();
			case JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_LINES:
				return getTotalLines();
			case JavaBenchmarkPackage.JAVA_PROJECT__FILES:
				return getFiles();
			case JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES:
				return getAverageFileSizeInBytes();
			case JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_LINES_PER_FILE:
				return getAverageLinesPerFile();
			case JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_SIZE_IN_BYTES:
				return getTotalSizeInBytes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaBenchmarkPackage.JAVA_PROJECT__NAME:
				setName((String)newValue);
				return;
			case JavaBenchmarkPackage.JAVA_PROJECT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaBenchmarkPackage.JAVA_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaBenchmarkPackage.JAVA_PROJECT__FILES:
				getFiles().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaBenchmarkPackage.JAVA_PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_LINES:
				return getTotalLines() != TOTAL_LINES_EDEFAULT;
			case JavaBenchmarkPackage.JAVA_PROJECT__FILES:
				return files != null && !files.isEmpty();
			case JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES:
				return getAverageFileSizeInBytes() != AVERAGE_FILE_SIZE_IN_BYTES_EDEFAULT;
			case JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_LINES_PER_FILE:
				return getAverageLinesPerFile() != AVERAGE_LINES_PER_FILE_EDEFAULT;
			case JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_SIZE_IN_BYTES:
				return getTotalSizeInBytes() != TOTAL_SIZE_IN_BYTES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Project.class) {
			switch (derivedFeatureID) {
				case JavaBenchmarkPackage.JAVA_PROJECT__NAME: return BenchmarkPackage.PROJECT__NAME;
				case JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_LINES: return BenchmarkPackage.PROJECT__TOTAL_LINES;
				case JavaBenchmarkPackage.JAVA_PROJECT__FILES: return BenchmarkPackage.PROJECT__FILES;
				case JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES: return BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES;
				case JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_LINES_PER_FILE: return BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE;
				case JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_SIZE_IN_BYTES: return BenchmarkPackage.PROJECT__TOTAL_SIZE_IN_BYTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Project.class) {
			switch (baseFeatureID) {
				case BenchmarkPackage.PROJECT__NAME: return JavaBenchmarkPackage.JAVA_PROJECT__NAME;
				case BenchmarkPackage.PROJECT__TOTAL_LINES: return JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_LINES;
				case BenchmarkPackage.PROJECT__FILES: return JavaBenchmarkPackage.JAVA_PROJECT__FILES;
				case BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES: return JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES;
				case BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE: return JavaBenchmarkPackage.JAVA_PROJECT__AVERAGE_LINES_PER_FILE;
				case BenchmarkPackage.PROJECT__TOTAL_SIZE_IN_BYTES: return JavaBenchmarkPackage.JAVA_PROJECT__TOTAL_SIZE_IN_BYTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JavaProjectImpl
