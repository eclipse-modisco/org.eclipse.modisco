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
package org.eclipse.modisco.omg.gastm.impl;

import java.lang.Integer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.SourceFile;
import org.eclipse.modisco.omg.gastm.SourceLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl#getEndLine <em>End Line</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceLocationImpl#getInSourceFile <em>In Source File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceLocationImpl extends GASTMSourceObjectImpl implements SourceLocation {
	/**
	 * The default value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected Integer startLine = START_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer startPosition = START_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected Integer endLine = END_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected Integer endPosition = END_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInSourceFile() <em>In Source File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInSourceFile()
	 * @generated
	 * @ordered
	 */
	protected SourceFile inSourceFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getSourceLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartLine() {
		return startLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLine(Integer newStartLine) {
		Integer oldStartLine = startLine;
		startLine = newStartLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_LOCATION__START_LINE, oldStartLine, startLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(Integer newStartPosition) {
		Integer oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_LOCATION__START_POSITION, oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndLine() {
		return endLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLine(Integer newEndLine) {
		Integer oldEndLine = endLine;
		endLine = newEndLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_LOCATION__END_LINE, oldEndLine, endLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(Integer newEndPosition) {
		Integer oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_LOCATION__END_POSITION, oldEndPosition, endPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile getInSourceFile() {
		return inSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInSourceFile(SourceFile newInSourceFile, NotificationChain msgs) {
		SourceFile oldInSourceFile = inSourceFile;
		inSourceFile = newInSourceFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE, oldInSourceFile, newInSourceFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInSourceFile(SourceFile newInSourceFile) {
		if (newInSourceFile != inSourceFile) {
			NotificationChain msgs = null;
			if (inSourceFile != null)
				msgs = ((InternalEObject)inSourceFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE, null, msgs);
			if (newInSourceFile != null)
				msgs = ((InternalEObject)newInSourceFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE, null, msgs);
			msgs = basicSetInSourceFile(newInSourceFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE, newInSourceFile, newInSourceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE:
				return basicSetInSourceFile(null, msgs);
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
			case GASTMPackage.SOURCE_LOCATION__START_LINE:
				return getStartLine();
			case GASTMPackage.SOURCE_LOCATION__START_POSITION:
				return getStartPosition();
			case GASTMPackage.SOURCE_LOCATION__END_LINE:
				return getEndLine();
			case GASTMPackage.SOURCE_LOCATION__END_POSITION:
				return getEndPosition();
			case GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE:
				return getInSourceFile();
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
			case GASTMPackage.SOURCE_LOCATION__START_LINE:
				setStartLine((Integer)newValue);
				return;
			case GASTMPackage.SOURCE_LOCATION__START_POSITION:
				setStartPosition((Integer)newValue);
				return;
			case GASTMPackage.SOURCE_LOCATION__END_LINE:
				setEndLine((Integer)newValue);
				return;
			case GASTMPackage.SOURCE_LOCATION__END_POSITION:
				setEndPosition((Integer)newValue);
				return;
			case GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE:
				setInSourceFile((SourceFile)newValue);
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
			case GASTMPackage.SOURCE_LOCATION__START_LINE:
				setStartLine(START_LINE_EDEFAULT);
				return;
			case GASTMPackage.SOURCE_LOCATION__START_POSITION:
				setStartPosition(START_POSITION_EDEFAULT);
				return;
			case GASTMPackage.SOURCE_LOCATION__END_LINE:
				setEndLine(END_LINE_EDEFAULT);
				return;
			case GASTMPackage.SOURCE_LOCATION__END_POSITION:
				setEndPosition(END_POSITION_EDEFAULT);
				return;
			case GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE:
				setInSourceFile((SourceFile)null);
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
			case GASTMPackage.SOURCE_LOCATION__START_LINE:
				return START_LINE_EDEFAULT == null ? startLine != null : !START_LINE_EDEFAULT.equals(startLine);
			case GASTMPackage.SOURCE_LOCATION__START_POSITION:
				return START_POSITION_EDEFAULT == null ? startPosition != null : !START_POSITION_EDEFAULT.equals(startPosition);
			case GASTMPackage.SOURCE_LOCATION__END_LINE:
				return END_LINE_EDEFAULT == null ? endLine != null : !END_LINE_EDEFAULT.equals(endLine);
			case GASTMPackage.SOURCE_LOCATION__END_POSITION:
				return END_POSITION_EDEFAULT == null ? endPosition != null : !END_POSITION_EDEFAULT.equals(endPosition);
			case GASTMPackage.SOURCE_LOCATION__IN_SOURCE_FILE:
				return inSourceFile != null;
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
		result.append(" (startLine: "); //$NON-NLS-1$
		result.append(startLine);
		result.append(", startPosition: "); //$NON-NLS-1$
		result.append(startPosition);
		result.append(", endLine: "); //$NON-NLS-1$
		result.append(endLine);
		result.append(", endPosition: "); //$NON-NLS-1$
		result.append(endPosition);
		result.append(')');
		return result.toString();
	}

} //SourceLocationImpl
