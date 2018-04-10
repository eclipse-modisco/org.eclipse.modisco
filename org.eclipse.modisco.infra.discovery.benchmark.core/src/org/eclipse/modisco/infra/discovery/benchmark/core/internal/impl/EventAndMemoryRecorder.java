/*******************************************************************************
 * Copyright (c) 2012, 2015 INRIA and Mia-Software
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Guillaume Doux (INRIA) - Initial API and implementation
 *     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IEventListener;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement;

/**
 * The event and memory recorder implementation
 * @author Guillaume Doux
 *
 */
public class EventAndMemoryRecorder implements IEventListener {


	private long startTime;
	private long stopTime;
	private long maxMemoryUsed;
	private boolean measureMemoryUse;

	private List<MemoryMeasurement> memoryMeasurements;
	private List<Event> events;

	/**
	 * attribute recording the memory measures in a job
	 */
	private MemoryMeasurementJob job;

	/**
	 * constructor
	 * @param measureMemoryUse: true if memory need to be measured
	 * @param memoryPollingInterval: the memory polling interval in milliseconds
	 */
	public EventAndMemoryRecorder(final boolean measureMemoryUse,
			final int memoryPollingInterval) {
		super();
		this.measureMemoryUse = measureMemoryUse;
		this.events = new LinkedList<Event>();
		this.memoryMeasurements = new LinkedList<MemoryMeasurement>();
		if (measureMemoryUse) {
			this.job = new MemoryMeasurementJob("MemoryMeasurementJob", memoryPollingInterval);
		} else {
			this.job = null;
		}
	}

	/**
	 * Re-initialize the event and memory recorder
	 * @return this event and memory recorder
	 */
	public EventAndMemoryRecorder reset() {
		this.events = new LinkedList<Event>();
		this.memoryMeasurements = new LinkedList<MemoryMeasurement>();
		if (this.measureMemoryUse) {
			this.job.reset();
		}
		return this;
	}

	/**
	 * Record an event
	 * @param event: the event to record
	 */
	public void notifyEvent(final Event event) {
		this.events.add(event);

	}

	/**
	 * Start time getter
	 * @return the start time
	 */
	public long getStartTime() {
		return this.startTime;
	}

	/**
	 * stop time getter
	 * @return the stop time
	 */
	public long getStopTime() {
		return this.stopTime;
	}

	/**
	 * Max memory used getter
	 * @return the max memory used
	 */
	public long getMaxMemoryUsed() {
		return this.maxMemoryUsed;
	}

	/**
	 * tells if the memory is measured by this recorder
	 * @return il the memory is measured
	 */
	public boolean isMeasureMemoryUse() {
		return this.measureMemoryUse;
	}

	/**
	 * Getter for the list of measurement
	 * @return the list of measurement
	 */
	public List<MemoryMeasurement> getMemoryMeasurements() {
		return this.memoryMeasurements;
	}

	/**
	 * Getter for the list of event
	 * @return the list of event
	 */
	public List<Event> getEvents() {
		return this.events;
	}





	/**
	 * Start the record
	 */
	public void start() {
		this.startTime = System.currentTimeMillis();
		if (this.measureMemoryUse) {
			this.job.setJobStartTime(this.startTime);
			//TODO change the null progress monitor.
			this.job.run(new NullProgressMonitor());
		}
	}

	/**
	 * stop the record
	 */
	public void stop() {
		try {
			if (this.measureMemoryUse) {
				if (!this.job.cancel()) {
					this.job.join();
				}
				this.memoryMeasurements.addAll(this.job.getMeasures());
			}
			this.stopTime = System.currentTimeMillis();
			this.maxMemoryUsed = 0;
			this.events.addAll(this.memoryMeasurements);
			for (MemoryMeasurement measure : this.memoryMeasurements) {
				if (measure.getMemoryUsed() > this.maxMemoryUsed) {
					this.maxMemoryUsed = measure.getMemoryUsed();
				}
			}


		} catch (InterruptedException e) {
				MoDiscoLogger.logError(e, "Problem with the memory recorder.", org.eclipse.modisco.infra.discovery.benchmark.core.internal.Activator.getDefault());
		}


	}
}
