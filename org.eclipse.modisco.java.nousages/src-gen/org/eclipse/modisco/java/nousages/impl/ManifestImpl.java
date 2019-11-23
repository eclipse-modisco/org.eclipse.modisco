/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.nousages.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.java.Manifest;
import org.eclipse.modisco.java.ManifestAttribute;
import org.eclipse.modisco.java.ManifestEntry;
import org.eclipse.modisco.java.nousages.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.nousages.impl.ManifestImpl#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.nousages.impl.ManifestImpl#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestImpl extends EObjectImpl implements Manifest {
	/**
	 * The cached value of the '{@link #getMainAttributes() <em>Main Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ManifestAttribute> mainAttributes;

	/**
	 * The cached value of the '{@link #getEntryAttributes() <em>Entry Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ManifestEntry> entryAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getManifest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManifestAttribute> getMainAttributes() {
		if (mainAttributes == null) {
			mainAttributes = new EObjectContainmentEList<ManifestAttribute>(ManifestAttribute.class, this, JavaPackage.MANIFEST__MAIN_ATTRIBUTES);
		}
		return mainAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManifestEntry> getEntryAttributes() {
		if (entryAttributes == null) {
			entryAttributes = new EObjectContainmentEList<ManifestEntry>(ManifestEntry.class, this, JavaPackage.MANIFEST__ENTRY_ATTRIBUTES);
		}
		return entryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.MANIFEST__MAIN_ATTRIBUTES:
				return ((InternalEList<?>)getMainAttributes()).basicRemove(otherEnd, msgs);
			case JavaPackage.MANIFEST__ENTRY_ATTRIBUTES:
				return ((InternalEList<?>)getEntryAttributes()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.MANIFEST__MAIN_ATTRIBUTES:
				return getMainAttributes();
			case JavaPackage.MANIFEST__ENTRY_ATTRIBUTES:
				return getEntryAttributes();
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
			case JavaPackage.MANIFEST__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				getMainAttributes().addAll((Collection<? extends ManifestAttribute>)newValue);
				return;
			case JavaPackage.MANIFEST__ENTRY_ATTRIBUTES:
				getEntryAttributes().clear();
				getEntryAttributes().addAll((Collection<? extends ManifestEntry>)newValue);
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
			case JavaPackage.MANIFEST__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				return;
			case JavaPackage.MANIFEST__ENTRY_ATTRIBUTES:
				getEntryAttributes().clear();
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
			case JavaPackage.MANIFEST__MAIN_ATTRIBUTES:
				return mainAttributes != null && !mainAttributes.isEmpty();
			case JavaPackage.MANIFEST__ENTRY_ATTRIBUTES:
				return entryAttributes != null && !entryAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManifestImpl
