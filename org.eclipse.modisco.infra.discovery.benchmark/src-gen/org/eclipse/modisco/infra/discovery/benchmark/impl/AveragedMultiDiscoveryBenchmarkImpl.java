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

import org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Averaged Multi Discovery Benchmark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedMultiDiscoveryBenchmarkImpl#getDiscoveries <em>Discoveries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AveragedMultiDiscoveryBenchmarkImpl extends BenchmarkImpl implements AveragedMultiDiscoveryBenchmark {
	/**
	 * The cached value of the '{@link #getDiscoveries() <em>Discoveries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveries()
	 * @generated
	 * @ordered
	 */
	protected EList<AveragedProjectDiscovery> discoveries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AveragedMultiDiscoveryBenchmarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.AVERAGED_MULTI_DISCOVERY_BENCHMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AveragedProjectDiscovery> getDiscoveries() {
		if (discoveries == null) {
			discoveries = new EObjectContainmentEList<AveragedProjectDiscovery>(AveragedProjectDiscovery.class, this, BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES);
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
			case BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
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
			case BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
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
			case BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				getDiscoveries().clear();
				getDiscoveries().addAll((Collection<? extends AveragedProjectDiscovery>)newValue);
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
			case BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
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
			case BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES:
				return discoveries != null && !discoveries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AveragedMultiDiscoveryBenchmarkImpl
