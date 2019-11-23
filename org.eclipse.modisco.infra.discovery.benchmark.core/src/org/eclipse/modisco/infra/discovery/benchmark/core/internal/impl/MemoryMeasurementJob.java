/*******************************************************************************
 * Copyright (c) 2012, 2015 INRIA and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Guillaume Doux (INRIA) - Initial API and implementation
 *     Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.Messages;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

/**
 * The implementation of the job measuring the memory consumption
 * @author Guillaume Doux
 *
 */
public class MemoryMeasurementJob extends Job {

	private int memoryPollingInterval;
	private List<MemoryMeasurement> measures;
	private long jobStartTime;
	private EventType eventType;

	/**
	 * Constructor
	 * @param name: the name of the job
	 * @param interval: the time interval between two measure in milliseconds
	 */
	public MemoryMeasurementJob(final String name, final int interval) {
		super(name);
		this.memoryPollingInterval = interval;
		this.measures = new LinkedList<MemoryMeasurement>();
		this.jobStartTime = 0;
		this.eventType = BenchmarkFactory.eINSTANCE.createEventType();
		this.eventType.setName("periodicMemoryMeasure");
	}

	/**
	 * Re-initialize the memory measurement job
	 * @return this job
	 */
	public MemoryMeasurementJob reset() {
		this.measures = new LinkedList<MemoryMeasurement>();
		return this;
	}

	/**
	 * Setter for the starting time
	 * @param s: the starting time in milliseconds
	 */
	public void setJobStartTime(final long s) {
		this.jobStartTime = s;
	}

	/**
	 * Getter for the polling interval
	 * @return the interval
	 */
	public int getMemoryPollingInterval() {
		return this.memoryPollingInterval;
	}

	/**
	 * Getter for the list of measures
	 * @return the list of measures
	 */
	public List<MemoryMeasurement> getMeasures() {
		return this.measures;
	}

	/**
	 * The run method of the job
	 */
	@SuppressWarnings("PMD.DoNotCallGarbageCollectionExplicitly")
	/*
	 * @SuppressWarnings("PMD.DoNotCallGarbageCollectionExplicitly"): gdupe> We
	 * really want to call the garbage collector to improve the memory
	 * measurement.
	 */
	protected IStatus run(final IProgressMonitor monitor) {
		final String message = NLS.bind(
				Messages.MemoryMeasurementJob_MemoryMeasureEveryMs,
				Integer.toString(this.memoryPollingInterval));
		final String pluginId = getPluginId();
		final IStatus result = new Status(IStatus.OK, pluginId, message);
		System.gc();
		final Runtime runtime = Runtime.getRuntime();
		final long mem = runtime.totalMemory() - runtime.freeMemory();
		final MemoryMeasurement memoryMeasure =
				BenchmarkFactory.eINSTANCE.createMemoryMeasurement();
		memoryMeasure.setTime(System.currentTimeMillis() - this.jobStartTime);
		memoryMeasure.setMemoryUsed(mem);
		memoryMeasure.setEventType(this.eventType);
		this.measures.add(memoryMeasure);
		schedule(this.memoryPollingInterval);
		return result;
	}

	private static String getPluginId() {
		final Bundle bundle = Activator.getDefault().getBundle();
		return bundle.getSymbolicName();
	}
}