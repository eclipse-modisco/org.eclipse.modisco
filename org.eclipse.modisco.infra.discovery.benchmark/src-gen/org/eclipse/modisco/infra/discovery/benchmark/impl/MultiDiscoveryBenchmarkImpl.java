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
 *     Nicolas Bros (Mia-Software)
 * 
 */
package org.eclipse.modisco.infra.discovery.benchmark.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.MultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Discovery Benchmark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.MultiDiscoveryBenchmarkImpl#getDiscoveries <em>Discoveries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiDiscoveryBenchmarkImpl extends BenchmarkImpl implements MultiDiscoveryBenchmark {
	/**
	 * The cached value of the '{@link #getDiscoveries() <em>Discoveries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveries()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectDiscovery> discoveries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiDiscoveryBenchmarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.MULTI_DISCOVERY_BENCHMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectDiscovery> getDiscoveries() {
		if (discoveries == null) {
			discoveries = new EObjectContainmentEList<ProjectDiscovery>(ProjectDiscovery.class, this, BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK__DISCOVERIES);
		}
		return discoveries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				return ((InternalEList<?>)getDiscoveries()).basicRemove(otherEnd, msgs);
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
			case BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				return getDiscoveries();
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
			case BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				getDiscoveries().clear();
				getDiscoveries().addAll((Collection<? extends ProjectDiscovery>)newValue);
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
			case BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				getDiscoveries().clear();
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
			case BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				return discoveries != null && !discoveries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiDiscoveryBenchmarkImpl
