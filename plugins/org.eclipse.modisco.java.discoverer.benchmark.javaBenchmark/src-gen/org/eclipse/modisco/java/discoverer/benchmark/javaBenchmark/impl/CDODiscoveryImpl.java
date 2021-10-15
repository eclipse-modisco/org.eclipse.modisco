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
 *     Nicolas Bros (Mia-Software) - extracted Java benchmark
 */
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDO Discovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getDicoveryDate <em>Dicovery Date</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getAlgorithmVariant <em>Algorithm Variant</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getDiscovererId <em>Discoverer Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getDiscovererClassName <em>Discoverer Class Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getSaveTimeInSeconds <em>Save Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getTotalExecutionTimeInSeconds <em>Total Execution Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getMetaModelVariant <em>Meta Model Variant</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getNumberOfModelElements <em>Number Of Model Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.CDODiscoveryImpl#getDiscoveryError <em>Discovery Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class CDODiscoveryImpl extends AbstractCDODiscoveryImpl implements CDODiscovery {
	/**
	 * The default value of the '{@link #getDicoveryDate() <em>Dicovery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicoveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DICOVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDicoveryDate() <em>Dicovery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicoveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date dicoveryDate = DICOVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlgorithmVariant() <em>Algorithm Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmVariant()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_VARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithmVariant() <em>Algorithm Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmVariant()
	 * @generated
	 * @ordered
	 */
	protected String algorithmVariant = ALGORITHM_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscovererId() <em>Discoverer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscovererId()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscovererId() <em>Discoverer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscovererId()
	 * @generated
	 * @ordered
	 */
	protected String discovererId = DISCOVERER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscovererClassName() <em>Discoverer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscovererClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscovererClassName() <em>Discoverer Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscovererClassName()
	 * @generated
	 * @ordered
	 */
	protected String discovererClassName = DISCOVERER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveTimeInSeconds() <em>Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double SAVE_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSaveTimeInSeconds() <em>Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double saveTimeInSeconds = SAVE_TIME_IN_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalExecutionTimeInSeconds() <em>Total Execution Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalExecutionTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_EXECUTION_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalExecutionTimeInSeconds() <em>Total Execution Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalExecutionTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double totalExecutionTimeInSeconds = TOTAL_EXECUTION_TIME_IN_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaModelVariant() <em>Meta Model Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelVariant()
	 * @generated
	 * @ordered
	 */
	protected static final String META_MODEL_VARIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaModelVariant() <em>Meta Model Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModelVariant()
	 * @generated
	 * @ordered
	 */
	protected String metaModelVariant = META_MODEL_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUsedMemoryInBytes() <em>Max Used Memory In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUsedMemoryInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_USED_MEMORY_IN_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxUsedMemoryInBytes() <em>Max Used Memory In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUsedMemoryInBytes()
	 * @generated
	 * @ordered
	 */
	protected long maxUsedMemoryInBytes = MAX_USED_MEMORY_IN_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfModelElements() <em>Number Of Model Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfModelElements()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_OF_MODEL_ELEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumberOfModelElements() <em>Number Of Model Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfModelElements()
	 * @generated
	 * @ordered
	 */
	protected long numberOfModelElements = NUMBER_OF_MODEL_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmiSizeInBytes() <em>Xmi Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long XMI_SIZE_IN_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getXmiSizeInBytes() <em>Xmi Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected long xmiSizeInBytes = XMI_SIZE_IN_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoveryError() <em>Discovery Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryError()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERY_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveryError() <em>Discovery Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryError()
	 * @generated
	 * @ordered
	 */
	protected String discoveryError = DISCOVERY_ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDODiscoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBenchmarkPackage.Literals.CDO_DISCOVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDicoveryDate() {
		return dicoveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDicoveryDate(Date newDicoveryDate) {
		Date oldDicoveryDate = dicoveryDate;
		dicoveryDate = newDicoveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE, oldDicoveryDate, dicoveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithmVariant() {
		return algorithmVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmVariant(String newAlgorithmVariant) {
		String oldAlgorithmVariant = algorithmVariant;
		algorithmVariant = newAlgorithmVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT, oldAlgorithmVariant, algorithmVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscovererId() {
		return discovererId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscovererId(String newDiscovererId) {
		String oldDiscovererId = discovererId;
		discovererId = newDiscovererId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID, oldDiscovererId, discovererId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscovererClassName() {
		return discovererClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscovererClassName(String newDiscovererClassName) {
		String oldDiscovererClassName = discovererClassName;
		discovererClassName = newDiscovererClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME, oldDiscovererClassName, discovererClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSaveTimeInSeconds() {
		return saveTimeInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveTimeInSeconds(double newSaveTimeInSeconds) {
		double oldSaveTimeInSeconds = saveTimeInSeconds;
		saveTimeInSeconds = newSaveTimeInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS, oldSaveTimeInSeconds, saveTimeInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalExecutionTimeInSeconds() {
		return totalExecutionTimeInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalExecutionTimeInSeconds(double newTotalExecutionTimeInSeconds) {
		double oldTotalExecutionTimeInSeconds = totalExecutionTimeInSeconds;
		totalExecutionTimeInSeconds = newTotalExecutionTimeInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS, oldTotalExecutionTimeInSeconds, totalExecutionTimeInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaModelVariant() {
		return metaModelVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelVariant(String newMetaModelVariant) {
		String oldMetaModelVariant = metaModelVariant;
		metaModelVariant = newMetaModelVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT, oldMetaModelVariant, metaModelVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxUsedMemoryInBytes() {
		return maxUsedMemoryInBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUsedMemoryInBytes(long newMaxUsedMemoryInBytes) {
		long oldMaxUsedMemoryInBytes = maxUsedMemoryInBytes;
		maxUsedMemoryInBytes = newMaxUsedMemoryInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES, oldMaxUsedMemoryInBytes, maxUsedMemoryInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumberOfModelElements() {
		return numberOfModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfModelElements(long newNumberOfModelElements) {
		long oldNumberOfModelElements = numberOfModelElements;
		numberOfModelElements = newNumberOfModelElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS, oldNumberOfModelElements, numberOfModelElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getXmiSizeInBytes() {
		return xmiSizeInBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmiSizeInBytes(long newXmiSizeInBytes) {
		long oldXmiSizeInBytes = xmiSizeInBytes;
		xmiSizeInBytes = newXmiSizeInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES, oldXmiSizeInBytes, xmiSizeInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoveryError() {
		return discoveryError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryError(String newDiscoveryError) {
		String oldDiscoveryError = discoveryError;
		discoveryError = newDiscoveryError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR, oldDiscoveryError, discoveryError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE:
				return getDicoveryDate();
			case JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT:
				return getAlgorithmVariant();
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID:
				return getDiscovererId();
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME:
				return getDiscovererClassName();
			case JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS:
				return getSaveTimeInSeconds();
			case JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS:
				return getTotalExecutionTimeInSeconds();
			case JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT:
				return getMetaModelVariant();
			case JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES:
				return getMaxUsedMemoryInBytes();
			case JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				return getNumberOfModelElements();
			case JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES:
				return getXmiSizeInBytes();
			case JavaBenchmarkPackage.CDO_DISCOVERY__NAME:
				return getName();
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR:
				return getDiscoveryError();
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
			case JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE:
				setDicoveryDate((Date)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT:
				setAlgorithmVariant((String)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID:
				setDiscovererId((String)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME:
				setDiscovererClassName((String)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS:
				setSaveTimeInSeconds((Double)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS:
				setTotalExecutionTimeInSeconds((Double)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT:
				setMetaModelVariant((String)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES:
				setMaxUsedMemoryInBytes((Long)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				setNumberOfModelElements((Long)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES:
				setXmiSizeInBytes((Long)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__NAME:
				setName((String)newValue);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR:
				setDiscoveryError((String)newValue);
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
			case JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE:
				setDicoveryDate(DICOVERY_DATE_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT:
				setAlgorithmVariant(ALGORITHM_VARIANT_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID:
				setDiscovererId(DISCOVERER_ID_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME:
				setDiscovererClassName(DISCOVERER_CLASS_NAME_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS:
				setSaveTimeInSeconds(SAVE_TIME_IN_SECONDS_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS:
				setTotalExecutionTimeInSeconds(TOTAL_EXECUTION_TIME_IN_SECONDS_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT:
				setMetaModelVariant(META_MODEL_VARIANT_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES:
				setMaxUsedMemoryInBytes(MAX_USED_MEMORY_IN_BYTES_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				setNumberOfModelElements(NUMBER_OF_MODEL_ELEMENTS_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES:
				setXmiSizeInBytes(XMI_SIZE_IN_BYTES_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR:
				setDiscoveryError(DISCOVERY_ERROR_EDEFAULT);
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
			case JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE:
				return DICOVERY_DATE_EDEFAULT == null ? dicoveryDate != null : !DICOVERY_DATE_EDEFAULT.equals(dicoveryDate);
			case JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT:
				return ALGORITHM_VARIANT_EDEFAULT == null ? algorithmVariant != null : !ALGORITHM_VARIANT_EDEFAULT.equals(algorithmVariant);
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID:
				return DISCOVERER_ID_EDEFAULT == null ? discovererId != null : !DISCOVERER_ID_EDEFAULT.equals(discovererId);
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME:
				return DISCOVERER_CLASS_NAME_EDEFAULT == null ? discovererClassName != null : !DISCOVERER_CLASS_NAME_EDEFAULT.equals(discovererClassName);
			case JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS:
				return saveTimeInSeconds != SAVE_TIME_IN_SECONDS_EDEFAULT;
			case JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS:
				return totalExecutionTimeInSeconds != TOTAL_EXECUTION_TIME_IN_SECONDS_EDEFAULT;
			case JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT:
				return META_MODEL_VARIANT_EDEFAULT == null ? metaModelVariant != null : !META_MODEL_VARIANT_EDEFAULT.equals(metaModelVariant);
			case JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES:
				return maxUsedMemoryInBytes != MAX_USED_MEMORY_IN_BYTES_EDEFAULT;
			case JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				return numberOfModelElements != NUMBER_OF_MODEL_ELEMENTS_EDEFAULT;
			case JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES:
				return xmiSizeInBytes != XMI_SIZE_IN_BYTES_EDEFAULT;
			case JavaBenchmarkPackage.CDO_DISCOVERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR:
				return DISCOVERY_ERROR_EDEFAULT == null ? discoveryError != null : !DISCOVERY_ERROR_EDEFAULT.equals(discoveryError);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Discovery.class) {
			switch (derivedFeatureID) {
				case JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE: return BenchmarkPackage.DISCOVERY__DICOVERY_DATE;
				case JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT: return BenchmarkPackage.DISCOVERY__ALGORITHM_VARIANT;
				case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID: return BenchmarkPackage.DISCOVERY__DISCOVERER_ID;
				case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME: return BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME;
				case JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS: return BenchmarkPackage.DISCOVERY__SAVE_TIME_IN_SECONDS;
				case JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS: return BenchmarkPackage.DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS;
				case JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT: return BenchmarkPackage.DISCOVERY__META_MODEL_VARIANT;
				case JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES: return BenchmarkPackage.DISCOVERY__MAX_USED_MEMORY_IN_BYTES;
				case JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS: return BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS;
				case JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES: return BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES;
				case JavaBenchmarkPackage.CDO_DISCOVERY__NAME: return BenchmarkPackage.DISCOVERY__NAME;
				case JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR: return BenchmarkPackage.DISCOVERY__DISCOVERY_ERROR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Discovery.class) {
			switch (baseFeatureID) {
				case BenchmarkPackage.DISCOVERY__DICOVERY_DATE: return JavaBenchmarkPackage.CDO_DISCOVERY__DICOVERY_DATE;
				case BenchmarkPackage.DISCOVERY__ALGORITHM_VARIANT: return JavaBenchmarkPackage.CDO_DISCOVERY__ALGORITHM_VARIANT;
				case BenchmarkPackage.DISCOVERY__DISCOVERER_ID: return JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_ID;
				case BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME: return JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERER_CLASS_NAME;
				case BenchmarkPackage.DISCOVERY__SAVE_TIME_IN_SECONDS: return JavaBenchmarkPackage.CDO_DISCOVERY__SAVE_TIME_IN_SECONDS;
				case BenchmarkPackage.DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS: return JavaBenchmarkPackage.CDO_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS;
				case BenchmarkPackage.DISCOVERY__META_MODEL_VARIANT: return JavaBenchmarkPackage.CDO_DISCOVERY__META_MODEL_VARIANT;
				case BenchmarkPackage.DISCOVERY__MAX_USED_MEMORY_IN_BYTES: return JavaBenchmarkPackage.CDO_DISCOVERY__MAX_USED_MEMORY_IN_BYTES;
				case BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS: return JavaBenchmarkPackage.CDO_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS;
				case BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES: return JavaBenchmarkPackage.CDO_DISCOVERY__XMI_SIZE_IN_BYTES;
				case BenchmarkPackage.DISCOVERY__NAME: return JavaBenchmarkPackage.CDO_DISCOVERY__NAME;
				case BenchmarkPackage.DISCOVERY__DISCOVERY_ERROR: return JavaBenchmarkPackage.CDO_DISCOVERY__DISCOVERY_ERROR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (dicoveryDate: ");
		result.append(dicoveryDate);
		result.append(", algorithmVariant: ");
		result.append(algorithmVariant);
		result.append(", discovererId: ");
		result.append(discovererId);
		result.append(", discovererClassName: ");
		result.append(discovererClassName);
		result.append(", saveTimeInSeconds: ");
		result.append(saveTimeInSeconds);
		result.append(", totalExecutionTimeInSeconds: ");
		result.append(totalExecutionTimeInSeconds);
		result.append(", metaModelVariant: ");
		result.append(metaModelVariant);
		result.append(", maxUsedMemoryInBytes: ");
		result.append(maxUsedMemoryInBytes);
		result.append(", numberOfModelElements: ");
		result.append(numberOfModelElements);
		result.append(", xmiSizeInBytes: ");
		result.append(xmiSizeInBytes);
		result.append(", name: ");
		result.append(name);
		result.append(", discoveryError: ");
		result.append(discoveryError);
		result.append(')');
		return result.toString();
	}

} //CDODiscoveryImpl
