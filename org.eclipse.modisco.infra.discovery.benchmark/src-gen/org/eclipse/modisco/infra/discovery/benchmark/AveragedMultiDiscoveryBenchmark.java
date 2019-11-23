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
package org.eclipse.modisco.infra.discovery.benchmark;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Averaged Multi Discovery Benchmark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark#getDiscoveries <em>Discoveries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedMultiDiscoveryBenchmark()
 * @model
 * @generated
 */
public interface AveragedMultiDiscoveryBenchmark extends Benchmark {
	/**
	 * Returns the value of the '<em><b>Discoveries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discoveries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discoveries</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#getAveragedMultiDiscoveryBenchmark_Discoveries()
	 * @model containment="true"
	 * @generated
	 */
	EList<AveragedProjectDiscovery> getDiscoveries();

} // AveragedMultiDiscoveryBenchmark
