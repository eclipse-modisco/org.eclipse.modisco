/**
 * Copyright (c) 2012, 2015 INRIA and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *      Guillaume Doux (INRIA) - Initial API and implementation
 *      Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *      Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource;

import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;

import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getDiscovererId <em>Discoverer Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getDiscovererClassName <em>Discoverer Class Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getDiscoveryTimeAverageInSeconds <em>Discovery Time Average In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getSaveTimeAverageInSeconds <em>Save Time Average In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getNumberOfModelElements <em>Number Of Model Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getDiscovererLaunchConfiguration <em>Discoverer Launch Configuration</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl#getCopyOfDiscovererDescription <em>Copy Of Discoverer Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoveryImpl extends EObjectImpl implements Discovery {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v2.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v20.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

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
	 * The default value of the '{@link #getDiscoveryTimeAverageInSeconds() <em>Discovery Time Average In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryTimeAverageInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOVERY_TIME_AVERAGE_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscoveryTimeAverageInSeconds() <em>Discovery Time Average In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryTimeAverageInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double discoveryTimeAverageInSeconds = DISCOVERY_TIME_AVERAGE_IN_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveTimeAverageInSeconds() <em>Save Time Average In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeAverageInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double SAVE_TIME_AVERAGE_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSaveTimeAverageInSeconds() <em>Save Time Average In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeAverageInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double saveTimeAverageInSeconds = SAVE_TIME_AVERAGE_IN_SECONDS_EDEFAULT;

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
	 * The cached value of the '{@link #getExecutionTimeStandardDeviation() <em>Execution Time Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTimeStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected double executionTimeStandardDeviation = EXECUTION_TIME_STANDARD_DEVIATION_EDEFAULT;

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
	 * The cached value of the '{@link #getSaveTimeStandardDeviation() <em>Save Time Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected double saveTimeStandardDeviation = SAVE_TIME_STANDARD_DEVIATION_EDEFAULT;

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
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Resource project;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscoveryIteration> iterations;

	/**
	 * The cached value of the '{@link #getDiscovererLaunchConfiguration() <em>Discoverer Launch Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscovererLaunchConfiguration()
	 * @generated
	 * @ordered
	 */
	protected LaunchConfiguration discovererLaunchConfiguration;

	/**
	 * The cached value of the '{@link #getCopyOfDiscovererDescription() <em>Copy Of Discoverer Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyOfDiscovererDescription()
	 * @generated
	 * @ordered
	 */
	protected DiscovererDescription copyOfDiscovererDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.DISCOVERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__DISCOVERER_ID, oldDiscovererId, discovererId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME, oldDiscovererClassName, discovererClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiscoveryTimeAverageInSeconds() {
		return discoveryTimeAverageInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryTimeAverageInSeconds(double newDiscoveryTimeAverageInSeconds) {
		double oldDiscoveryTimeAverageInSeconds = discoveryTimeAverageInSeconds;
		discoveryTimeAverageInSeconds = newDiscoveryTimeAverageInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS, oldDiscoveryTimeAverageInSeconds, discoveryTimeAverageInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSaveTimeAverageInSeconds() {
		return saveTimeAverageInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveTimeAverageInSeconds(double newSaveTimeAverageInSeconds) {
		double oldSaveTimeAverageInSeconds = saveTimeAverageInSeconds;
		saveTimeAverageInSeconds = newSaveTimeAverageInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS, oldSaveTimeAverageInSeconds, saveTimeAverageInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExecutionTimeStandardDeviation() {
		return executionTimeStandardDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTimeStandardDeviation(double newExecutionTimeStandardDeviation) {
		double oldExecutionTimeStandardDeviation = executionTimeStandardDeviation;
		executionTimeStandardDeviation = newExecutionTimeStandardDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION, oldExecutionTimeStandardDeviation, executionTimeStandardDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSaveTimeStandardDeviation() {
		return saveTimeStandardDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveTimeStandardDeviation(double newSaveTimeStandardDeviation) {
		double oldSaveTimeStandardDeviation = saveTimeStandardDeviation;
		saveTimeStandardDeviation = newSaveTimeStandardDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__SAVE_TIME_STANDARD_DEVIATION, oldSaveTimeStandardDeviation, saveTimeStandardDeviation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS, oldNumberOfModelElements, numberOfModelElements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES, oldXmiSizeInBytes, xmiSizeInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Resource)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BenchmarkPackage.DISCOVERY__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Resource newProject) {
		Resource oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscoveryIteration> getIterations() {
		if (iterations == null) {
			iterations = new EObjectContainmentEList<DiscoveryIteration>(DiscoveryIteration.class, this, BenchmarkPackage.DISCOVERY__ITERATIONS);
		}
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchConfiguration getDiscovererLaunchConfiguration() {
		return discovererLaunchConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscovererLaunchConfiguration(LaunchConfiguration newDiscovererLaunchConfiguration, NotificationChain msgs) {
		LaunchConfiguration oldDiscovererLaunchConfiguration = discovererLaunchConfiguration;
		discovererLaunchConfiguration = newDiscovererLaunchConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION, oldDiscovererLaunchConfiguration, newDiscovererLaunchConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscovererLaunchConfiguration(LaunchConfiguration newDiscovererLaunchConfiguration) {
		if (newDiscovererLaunchConfiguration != discovererLaunchConfiguration) {
			NotificationChain msgs = null;
			if (discovererLaunchConfiguration != null)
				msgs = ((InternalEObject)discovererLaunchConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION, null, msgs);
			if (newDiscovererLaunchConfiguration != null)
				msgs = ((InternalEObject)newDiscovererLaunchConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION, null, msgs);
			msgs = basicSetDiscovererLaunchConfiguration(newDiscovererLaunchConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION, newDiscovererLaunchConfiguration, newDiscovererLaunchConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscovererDescription getCopyOfDiscovererDescription() {
		return copyOfDiscovererDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyOfDiscovererDescription(DiscovererDescription newCopyOfDiscovererDescription, NotificationChain msgs) {
		DiscovererDescription oldCopyOfDiscovererDescription = copyOfDiscovererDescription;
		copyOfDiscovererDescription = newCopyOfDiscovererDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION, oldCopyOfDiscovererDescription, newCopyOfDiscovererDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyOfDiscovererDescription(DiscovererDescription newCopyOfDiscovererDescription) {
		if (newCopyOfDiscovererDescription != copyOfDiscovererDescription) {
			NotificationChain msgs = null;
			if (copyOfDiscovererDescription != null)
				msgs = ((InternalEObject)copyOfDiscovererDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION, null, msgs);
			if (newCopyOfDiscovererDescription != null)
				msgs = ((InternalEObject)newCopyOfDiscovererDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION, null, msgs);
			msgs = basicSetCopyOfDiscovererDescription(newCopyOfDiscovererDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION, newCopyOfDiscovererDescription, newCopyOfDiscovererDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BenchmarkPackage.DISCOVERY__ITERATIONS:
				return ((InternalEList<?>)getIterations()).basicRemove(otherEnd, msgs);
			case BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION:
				return basicSetDiscovererLaunchConfiguration(null, msgs);
			case BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION:
				return basicSetCopyOfDiscovererDescription(null, msgs);
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
			case BenchmarkPackage.DISCOVERY__NAME:
				return getName();
			case BenchmarkPackage.DISCOVERY__DISCOVERER_ID:
				return getDiscovererId();
			case BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME:
				return getDiscovererClassName();
			case BenchmarkPackage.DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS:
				return getDiscoveryTimeAverageInSeconds();
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS:
				return getSaveTimeAverageInSeconds();
			case BenchmarkPackage.DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION:
				return getExecutionTimeStandardDeviation();
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_STANDARD_DEVIATION:
				return getSaveTimeStandardDeviation();
			case BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				return getNumberOfModelElements();
			case BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES:
				return getXmiSizeInBytes();
			case BenchmarkPackage.DISCOVERY__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case BenchmarkPackage.DISCOVERY__ITERATIONS:
				return getIterations();
			case BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION:
				return getDiscovererLaunchConfiguration();
			case BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION:
				return getCopyOfDiscovererDescription();
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
			case BenchmarkPackage.DISCOVERY__NAME:
				setName((String)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERER_ID:
				setDiscovererId((String)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME:
				setDiscovererClassName((String)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS:
				setDiscoveryTimeAverageInSeconds((Double)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS:
				setSaveTimeAverageInSeconds((Double)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION:
				setExecutionTimeStandardDeviation((Double)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_STANDARD_DEVIATION:
				setSaveTimeStandardDeviation((Double)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				setNumberOfModelElements((Long)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES:
				setXmiSizeInBytes((Long)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__PROJECT:
				setProject((Resource)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__ITERATIONS:
				getIterations().clear();
				getIterations().addAll((Collection<? extends DiscoveryIteration>)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION:
				setDiscovererLaunchConfiguration((LaunchConfiguration)newValue);
				return;
			case BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION:
				setCopyOfDiscovererDescription((DiscovererDescription)newValue);
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
			case BenchmarkPackage.DISCOVERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERER_ID:
				setDiscovererId(DISCOVERER_ID_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME:
				setDiscovererClassName(DISCOVERER_CLASS_NAME_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS:
				setDiscoveryTimeAverageInSeconds(DISCOVERY_TIME_AVERAGE_IN_SECONDS_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS:
				setSaveTimeAverageInSeconds(SAVE_TIME_AVERAGE_IN_SECONDS_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION:
				setExecutionTimeStandardDeviation(EXECUTION_TIME_STANDARD_DEVIATION_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_STANDARD_DEVIATION:
				setSaveTimeStandardDeviation(SAVE_TIME_STANDARD_DEVIATION_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				setNumberOfModelElements(NUMBER_OF_MODEL_ELEMENTS_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES:
				setXmiSizeInBytes(XMI_SIZE_IN_BYTES_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY__PROJECT:
				setProject((Resource)null);
				return;
			case BenchmarkPackage.DISCOVERY__ITERATIONS:
				getIterations().clear();
				return;
			case BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION:
				setDiscovererLaunchConfiguration((LaunchConfiguration)null);
				return;
			case BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION:
				setCopyOfDiscovererDescription((DiscovererDescription)null);
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
			case BenchmarkPackage.DISCOVERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BenchmarkPackage.DISCOVERY__DISCOVERER_ID:
				return DISCOVERER_ID_EDEFAULT == null ? discovererId != null : !DISCOVERER_ID_EDEFAULT.equals(discovererId);
			case BenchmarkPackage.DISCOVERY__DISCOVERER_CLASS_NAME:
				return DISCOVERER_CLASS_NAME_EDEFAULT == null ? discovererClassName != null : !DISCOVERER_CLASS_NAME_EDEFAULT.equals(discovererClassName);
			case BenchmarkPackage.DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS:
				return discoveryTimeAverageInSeconds != DISCOVERY_TIME_AVERAGE_IN_SECONDS_EDEFAULT;
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS:
				return saveTimeAverageInSeconds != SAVE_TIME_AVERAGE_IN_SECONDS_EDEFAULT;
			case BenchmarkPackage.DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION:
				return executionTimeStandardDeviation != EXECUTION_TIME_STANDARD_DEVIATION_EDEFAULT;
			case BenchmarkPackage.DISCOVERY__SAVE_TIME_STANDARD_DEVIATION:
				return saveTimeStandardDeviation != SAVE_TIME_STANDARD_DEVIATION_EDEFAULT;
			case BenchmarkPackage.DISCOVERY__NUMBER_OF_MODEL_ELEMENTS:
				return numberOfModelElements != NUMBER_OF_MODEL_ELEMENTS_EDEFAULT;
			case BenchmarkPackage.DISCOVERY__XMI_SIZE_IN_BYTES:
				return xmiSizeInBytes != XMI_SIZE_IN_BYTES_EDEFAULT;
			case BenchmarkPackage.DISCOVERY__PROJECT:
				return project != null;
			case BenchmarkPackage.DISCOVERY__ITERATIONS:
				return iterations != null && !iterations.isEmpty();
			case BenchmarkPackage.DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION:
				return discovererLaunchConfiguration != null;
			case BenchmarkPackage.DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION:
				return copyOfDiscovererDescription != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", discovererId: ");
		result.append(discovererId);
		result.append(", discovererClassName: ");
		result.append(discovererClassName);
		result.append(", discoveryTimeAverageInSeconds: ");
		result.append(discoveryTimeAverageInSeconds);
		result.append(", saveTimeAverageInSeconds: ");
		result.append(saveTimeAverageInSeconds);
		result.append(", executionTimeStandardDeviation: ");
		result.append(executionTimeStandardDeviation);
		result.append(", saveTimeStandardDeviation: ");
		result.append(saveTimeStandardDeviation);
		result.append(", numberOfModelElements: ");
		result.append(numberOfModelElements);
		result.append(", xmiSizeInBytes: ");
		result.append(xmiSizeInBytes);
		result.append(')');
		return result.toString();
	}

} //DiscoveryImpl
