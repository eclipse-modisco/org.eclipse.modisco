/**
 * Copyright (c) 2012, 2015 INRIA and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Guillaume Doux (INRIA) - Initial API and implementation
 *      Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *      Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl#getTotalLines <em>Total Lines</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl#getAverageFileSizeInBytes <em>Average File Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl#getAverageLinesPerFile <em>Average Lines Per File</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl#getInputSize <em>Input Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl#getInputSizeUnit <em>Input Size Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends ResourceImpl implements Project {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

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
	 * The cached value of the '{@link #getTotalLines() <em>Total Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLines()
	 * @generated
	 * @ordered
	 */
	protected long totalLines = TOTAL_LINES_EDEFAULT;

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
	 * The cached value of the '{@link #getAverageFileSizeInBytes() <em>Average File Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageFileSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected long averageFileSizeInBytes = AVERAGE_FILE_SIZE_IN_BYTES_EDEFAULT;

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
	 * The cached value of the '{@link #getAverageLinesPerFile() <em>Average Lines Per File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageLinesPerFile()
	 * @generated
	 * @ordered
	 */
	protected long averageLinesPerFile = AVERAGE_LINES_PER_FILE_EDEFAULT;

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
	 * The default value of the '{@link #getInputSize() <em>Input Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSize()
	 * @generated
	 * @ordered
	 */
	protected static final double INPUT_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInputSize() <em>Input Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSize()
	 * @generated
	 * @ordered
	 */
	protected double inputSize = INPUT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputSizeUnit() <em>Input Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_SIZE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputSizeUnit() <em>Input Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected String inputSizeUnit = INPUT_SIZE_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalLines() {
		return totalLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLines(long newTotalLines) {
		long oldTotalLines = totalLines;
		totalLines = newTotalLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.PROJECT__TOTAL_LINES, oldTotalLines, totalLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAverageFileSizeInBytes() {
		return averageFileSizeInBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageFileSizeInBytes(long newAverageFileSizeInBytes) {
		long oldAverageFileSizeInBytes = averageFileSizeInBytes;
		averageFileSizeInBytes = newAverageFileSizeInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES, oldAverageFileSizeInBytes, averageFileSizeInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAverageLinesPerFile() {
		return averageLinesPerFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageLinesPerFile(long newAverageLinesPerFile) {
		long oldAverageLinesPerFile = averageLinesPerFile;
		averageLinesPerFile = newAverageLinesPerFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE, oldAverageLinesPerFile, averageLinesPerFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, BenchmarkPackage.PROJECT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInputSize() {
		return inputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSize(double newInputSize) {
		double oldInputSize = inputSize;
		inputSize = newInputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.PROJECT__INPUT_SIZE, oldInputSize, inputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputSizeUnit() {
		return inputSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputSizeUnit(String newInputSizeUnit) {
		String oldInputSizeUnit = inputSizeUnit;
		inputSizeUnit = newInputSizeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.PROJECT__INPUT_SIZE_UNIT, oldInputSizeUnit, inputSizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BenchmarkPackage.PROJECT__FILES:
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
			case BenchmarkPackage.PROJECT__TOTAL_LINES:
				return getTotalLines();
			case BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES:
				return getAverageFileSizeInBytes();
			case BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE:
				return getAverageLinesPerFile();
			case BenchmarkPackage.PROJECT__FILES:
				return getFiles();
			case BenchmarkPackage.PROJECT__INPUT_SIZE:
				return getInputSize();
			case BenchmarkPackage.PROJECT__INPUT_SIZE_UNIT:
				return getInputSizeUnit();
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
			case BenchmarkPackage.PROJECT__TOTAL_LINES:
				setTotalLines((Long)newValue);
				return;
			case BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES:
				setAverageFileSizeInBytes((Long)newValue);
				return;
			case BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE:
				setAverageLinesPerFile((Long)newValue);
				return;
			case BenchmarkPackage.PROJECT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case BenchmarkPackage.PROJECT__INPUT_SIZE:
				setInputSize((Double)newValue);
				return;
			case BenchmarkPackage.PROJECT__INPUT_SIZE_UNIT:
				setInputSizeUnit((String)newValue);
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
			case BenchmarkPackage.PROJECT__TOTAL_LINES:
				setTotalLines(TOTAL_LINES_EDEFAULT);
				return;
			case BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES:
				setAverageFileSizeInBytes(AVERAGE_FILE_SIZE_IN_BYTES_EDEFAULT);
				return;
			case BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE:
				setAverageLinesPerFile(AVERAGE_LINES_PER_FILE_EDEFAULT);
				return;
			case BenchmarkPackage.PROJECT__FILES:
				getFiles().clear();
				return;
			case BenchmarkPackage.PROJECT__INPUT_SIZE:
				setInputSize(INPUT_SIZE_EDEFAULT);
				return;
			case BenchmarkPackage.PROJECT__INPUT_SIZE_UNIT:
				setInputSizeUnit(INPUT_SIZE_UNIT_EDEFAULT);
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
			case BenchmarkPackage.PROJECT__TOTAL_LINES:
				return totalLines != TOTAL_LINES_EDEFAULT;
			case BenchmarkPackage.PROJECT__AVERAGE_FILE_SIZE_IN_BYTES:
				return averageFileSizeInBytes != AVERAGE_FILE_SIZE_IN_BYTES_EDEFAULT;
			case BenchmarkPackage.PROJECT__AVERAGE_LINES_PER_FILE:
				return averageLinesPerFile != AVERAGE_LINES_PER_FILE_EDEFAULT;
			case BenchmarkPackage.PROJECT__FILES:
				return files != null && !files.isEmpty();
			case BenchmarkPackage.PROJECT__INPUT_SIZE:
				return inputSize != INPUT_SIZE_EDEFAULT;
			case BenchmarkPackage.PROJECT__INPUT_SIZE_UNIT:
				return INPUT_SIZE_UNIT_EDEFAULT == null ? inputSizeUnit != null : !INPUT_SIZE_UNIT_EDEFAULT.equals(inputSizeUnit);
		}
		return super.eIsSet(featureID);
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
		result.append(" (totalLines: ");
		result.append(totalLines);
		result.append(", averageFileSizeInBytes: ");
		result.append(averageFileSizeInBytes);
		result.append(", averageLinesPerFile: ");
		result.append(averageLinesPerFile);
		result.append(", inputSize: ");
		result.append(inputSize);
		result.append(", inputSizeUnit: ");
		result.append(inputSizeUnit);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
