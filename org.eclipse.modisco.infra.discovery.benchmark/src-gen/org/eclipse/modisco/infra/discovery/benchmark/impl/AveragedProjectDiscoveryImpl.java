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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Averaged Project Discovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl#getAverageExecutionTimeInSeconds <em>Average Execution Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl#getAverageSaveTimeInSeconds <em>Average Save Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl#getOccurrences <em>Occurrences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AveragedProjectDiscoveryImpl extends EObjectImpl implements AveragedProjectDiscovery {
	/**
	 * The default value of the '{@link #getAverageExecutionTimeInSeconds() <em>Average Execution Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageExecutionTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_EXECUTION_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAverageSaveTimeInSeconds() <em>Average Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageSaveTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_SAVE_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getExecutionTimeStandardDeviation() <em>Execution Time Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTimeStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double EXECUTION_TIME_STANDARD_DEVIATION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getSaveTimeStandardDeviation() <em>Save Time Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double SAVE_TIME_STANDARD_DEVIATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectDiscovery> occurrences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AveragedProjectDiscoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.AVERAGED_PROJECT_DISCOVERY;
	}
	
	private static double rounded(final double value) {
		return (int)(value * 1000.0) / 1000.0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getAverageExecutionTimeInSeconds() {
		if(getOccurrences().isEmpty()) {
			return 0.0;
		}
		double totalExecutionTime = 0.0;
		for (ProjectDiscovery discovery : getOccurrences()) {
			totalExecutionTime += discovery.getTotalExecutionTimeInSeconds();
		}
		return rounded(totalExecutionTime / getOccurrences().size());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getAverageSaveTimeInSeconds() {
		if(getOccurrences().isEmpty()) {
			return 0.0;
		}
		double totalSaveTime = 0.0;
		for (ProjectDiscovery discovery : getOccurrences()) {
			totalSaveTime += discovery.getSaveTimeInSeconds();
		}
		return rounded(totalSaveTime / getOccurrences().size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getExecutionTimeStandardDeviation() {
		if(getOccurrences().isEmpty()) {
			return 0.0;
		}
		double squareDiffsSum = 0.0;
		double average = getAverageExecutionTimeInSeconds();
		for (ProjectDiscovery discovery : getOccurrences()) {
			double diff = discovery.getTotalExecutionTimeInSeconds() - average;
			squareDiffsSum += diff * diff;
		}
		double variance = squareDiffsSum / getOccurrences().size();
		return rounded(Math.sqrt(variance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getSaveTimeStandardDeviation() {
		if(getOccurrences().isEmpty()) {
			return 0.0;
		}
		double squareDiffsSum = 0.0;
		double average = getAverageSaveTimeInSeconds();
		for (ProjectDiscovery discovery : getOccurrences()) {
			double diff = discovery.getSaveTimeInSeconds() - average;
			squareDiffsSum += diff * diff;
		}
		double variance = squareDiffsSum / getOccurrences().size();
		return rounded(Math.sqrt(variance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectDiscovery> getOccurrences() {
		if (occurrences == null) {
			occurrences = new EObjectContainmentEList<ProjectDiscovery>(ProjectDiscovery.class, this, BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__OCCURRENCES);
		}
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__OCCURRENCES:
				return ((InternalEList<?>)getOccurrences()).basicRemove(otherEnd, msgs);
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
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__AVERAGE_EXECUTION_TIME_IN_SECONDS:
				return getAverageExecutionTimeInSeconds();
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__AVERAGE_SAVE_TIME_IN_SECONDS:
				return getAverageSaveTimeInSeconds();
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION:
				return getExecutionTimeStandardDeviation();
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__SAVE_TIME_STANDARD_DEVIATION:
				return getSaveTimeStandardDeviation();
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__OCCURRENCES:
				return getOccurrences();
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
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__OCCURRENCES:
				getOccurrences().clear();
				getOccurrences().addAll((Collection<? extends ProjectDiscovery>)newValue);
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
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__OCCURRENCES:
				getOccurrences().clear();
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
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__AVERAGE_EXECUTION_TIME_IN_SECONDS:
				return getAverageExecutionTimeInSeconds() != AVERAGE_EXECUTION_TIME_IN_SECONDS_EDEFAULT;
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__AVERAGE_SAVE_TIME_IN_SECONDS:
				return getAverageSaveTimeInSeconds() != AVERAGE_SAVE_TIME_IN_SECONDS_EDEFAULT;
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION:
				return getExecutionTimeStandardDeviation() != EXECUTION_TIME_STANDARD_DEVIATION_EDEFAULT;
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__SAVE_TIME_STANDARD_DEVIATION:
				return getSaveTimeStandardDeviation() != SAVE_TIME_STANDARD_DEVIATION_EDEFAULT;
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY__OCCURRENCES:
				return occurrences != null && !occurrences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AveragedProjectDiscoveryImpl
