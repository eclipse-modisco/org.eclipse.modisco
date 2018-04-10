/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
import org.eclipse.modisco.omg.gastm.DefinitionObject;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.ProgramScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.CompilationUnitImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.CompilationUnitImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.CompilationUnitImpl#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilationUnitImpl extends SourceFileImpl implements CompilationUnit {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionObject> fragments;

	/**
	 * The cached value of the '{@link #getOpensScope() <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpensScope()
	 * @generated
	 * @ordered
	 */
	protected ProgramScope opensScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getCompilationUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.COMPILATION_UNIT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionObject> getFragments() {
		if (fragments == null) {
			fragments = new EObjectContainmentEList<DefinitionObject>(DefinitionObject.class, this, GASTMPackage.COMPILATION_UNIT__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramScope getOpensScope() {
		if (opensScope != null && opensScope.eIsProxy()) {
			InternalEObject oldOpensScope = (InternalEObject)opensScope;
			opensScope = (ProgramScope)eResolveProxy(oldOpensScope);
			if (opensScope != oldOpensScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.COMPILATION_UNIT__OPENS_SCOPE, oldOpensScope, opensScope));
			}
		}
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramScope basicGetOpensScope() {
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpensScope(ProgramScope newOpensScope) {
		ProgramScope oldOpensScope = opensScope;
		opensScope = newOpensScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.COMPILATION_UNIT__OPENS_SCOPE, oldOpensScope, opensScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.COMPILATION_UNIT__FRAGMENTS:
				return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.COMPILATION_UNIT__LANGUAGE:
				return getLanguage();
			case GASTMPackage.COMPILATION_UNIT__FRAGMENTS:
				return getFragments();
			case GASTMPackage.COMPILATION_UNIT__OPENS_SCOPE:
				if (resolve) return getOpensScope();
				return basicGetOpensScope();
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
			case GASTMPackage.COMPILATION_UNIT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case GASTMPackage.COMPILATION_UNIT__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends DefinitionObject>)newValue);
				return;
			case GASTMPackage.COMPILATION_UNIT__OPENS_SCOPE:
				setOpensScope((ProgramScope)newValue);
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
			case GASTMPackage.COMPILATION_UNIT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GASTMPackage.COMPILATION_UNIT__FRAGMENTS:
				getFragments().clear();
				return;
			case GASTMPackage.COMPILATION_UNIT__OPENS_SCOPE:
				setOpensScope((ProgramScope)null);
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
			case GASTMPackage.COMPILATION_UNIT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GASTMPackage.COMPILATION_UNIT__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case GASTMPackage.COMPILATION_UNIT__OPENS_SCOPE:
				return opensScope != null;
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
		result.append(" (language: "); //$NON-NLS-1$
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //CompilationUnitImpl
