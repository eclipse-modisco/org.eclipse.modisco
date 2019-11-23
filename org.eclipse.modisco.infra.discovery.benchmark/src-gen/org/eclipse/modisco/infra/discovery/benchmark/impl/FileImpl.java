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
 *     Nicolas Bros (Mia-Software)
 * 
 */
package org.eclipse.modisco.infra.discovery.benchmark.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.File;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl#getSizeInBytes <em>Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl#getFilepath <em>Filepath</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends EObjectImpl implements File {
	/**
	 * The default value of the '{@link #getSizeInBytes() <em>Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_IN_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSizeInBytes() <em>Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected long sizeInBytes = SIZE_IN_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLines() <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected static final long LINES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected long lines = LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilepath() <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilepath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILEPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilepath() <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilepath()
	 * @generated
	 * @ordered
	 */
	protected String filepath = FILEPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSizeInBytes() {
		return sizeInBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInBytes(long newSizeInBytes) {
		long oldSizeInBytes = sizeInBytes;
		sizeInBytes = newSizeInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.FILE__SIZE_IN_BYTES, oldSizeInBytes, sizeInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLines() {
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLines(long newLines) {
		long oldLines = lines;
		lines = newLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.FILE__LINES, oldLines, lines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilepath() {
		return filepath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilepath(String newFilepath) {
		String oldFilepath = filepath;
		filepath = newFilepath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.FILE__FILEPATH, oldFilepath, filepath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BenchmarkPackage.FILE__SIZE_IN_BYTES:
				return getSizeInBytes();
			case BenchmarkPackage.FILE__LINES:
				return getLines();
			case BenchmarkPackage.FILE__FILEPATH:
				return getFilepath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BenchmarkPackage.FILE__SIZE_IN_BYTES:
				setSizeInBytes((Long)newValue);
				return;
			case BenchmarkPackage.FILE__LINES:
				setLines((Long)newValue);
				return;
			case BenchmarkPackage.FILE__FILEPATH:
				setFilepath((String)newValue);
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
			case BenchmarkPackage.FILE__SIZE_IN_BYTES:
				setSizeInBytes(SIZE_IN_BYTES_EDEFAULT);
				return;
			case BenchmarkPackage.FILE__LINES:
				setLines(LINES_EDEFAULT);
				return;
			case BenchmarkPackage.FILE__FILEPATH:
				setFilepath(FILEPATH_EDEFAULT);
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
			case BenchmarkPackage.FILE__SIZE_IN_BYTES:
				return sizeInBytes != SIZE_IN_BYTES_EDEFAULT;
			case BenchmarkPackage.FILE__LINES:
				return lines != LINES_EDEFAULT;
			case BenchmarkPackage.FILE__FILEPATH:
				return FILEPATH_EDEFAULT == null ? filepath != null : !FILEPATH_EDEFAULT.equals(filepath);
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
		result.append(" (sizeInBytes: ");
		result.append(sizeInBytes);
		result.append(", lines: ");
		result.append(lines);
		result.append(", filepath: ");
		result.append(filepath);
		result.append(')');
		return result.toString();
	}

} //FileImpl
