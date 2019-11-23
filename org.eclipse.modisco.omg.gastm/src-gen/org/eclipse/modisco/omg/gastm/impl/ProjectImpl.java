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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.CompilationUnit;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.GlobalScope;
import org.eclipse.modisco.omg.gastm.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ProjectImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ProjectImpl#getOuterScope <em>Outer Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends GASTMSemanticObjectImpl implements Project {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> files;

	/**
	 * The cached value of the '{@link #getOuterScope() <em>Outer Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterScope()
	 * @generated
	 * @ordered
	 */
	protected GlobalScope outerScope;

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
		return GASTMPackage.eINSTANCE.getProject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this, GASTMPackage.PROJECT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScope getOuterScope() {
		if (outerScope != null && outerScope.eIsProxy()) {
			InternalEObject oldOuterScope = (InternalEObject)outerScope;
			outerScope = (GlobalScope)eResolveProxy(oldOuterScope);
			if (outerScope != oldOuterScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.PROJECT__OUTER_SCOPE, oldOuterScope, outerScope));
			}
		}
		return outerScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScope basicGetOuterScope() {
		return outerScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterScope(GlobalScope newOuterScope) {
		GlobalScope oldOuterScope = outerScope;
		outerScope = newOuterScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.PROJECT__OUTER_SCOPE, oldOuterScope, outerScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.PROJECT__FILES:
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
			case GASTMPackage.PROJECT__FILES:
				return getFiles();
			case GASTMPackage.PROJECT__OUTER_SCOPE:
				if (resolve) return getOuterScope();
				return basicGetOuterScope();
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
			case GASTMPackage.PROJECT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends CompilationUnit>)newValue);
				return;
			case GASTMPackage.PROJECT__OUTER_SCOPE:
				setOuterScope((GlobalScope)newValue);
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
			case GASTMPackage.PROJECT__FILES:
				getFiles().clear();
				return;
			case GASTMPackage.PROJECT__OUTER_SCOPE:
				setOuterScope((GlobalScope)null);
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
			case GASTMPackage.PROJECT__FILES:
				return files != null && !files.isEmpty();
			case GASTMPackage.PROJECT__OUTER_SCOPE:
				return outerScope != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
