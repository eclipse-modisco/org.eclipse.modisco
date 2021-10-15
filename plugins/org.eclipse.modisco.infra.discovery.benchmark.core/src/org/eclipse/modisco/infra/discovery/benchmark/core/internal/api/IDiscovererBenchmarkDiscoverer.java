/*******************************************************************************
 * Copyright (c) 2011, 2019 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

/**
 * Interface used by discoverers of discovery benchmarks
 * @author Guillaume Doux
 *
 */
public interface IDiscovererBenchmarkDiscoverer {

	/**
	 * Give the ID of the discoverer of discovery benchmark
	 * @return object containing the discoverer ID
	 */
	public IDiscovererID getDiscovererID();

	/**
	 * Give the number of iterations to do for each discoverer to be benchmarked
	 * @return the number of iterations
	 */
	public int getIterations();

	/**
	 * Return if the discoverer measure the memory usage
	 * @return true if the memory consumption is measured
	 */
	public boolean isMeasureMemoryUse();

	/**
	 * Give the interval in milliseconds between to measure of the memory usage
	 * @return the time interval
	 */
	public int getMemoryPollingInterval();

	/**
	 * Return if the discoverer generates an HTML report of the benchmark
	 * @return true if the report have to be generated
	 */
	public boolean isGenerateHtmlReport();

}
