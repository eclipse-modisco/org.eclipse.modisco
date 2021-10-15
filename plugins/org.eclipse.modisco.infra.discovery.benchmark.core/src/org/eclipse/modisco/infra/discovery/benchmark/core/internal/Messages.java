/*******************************************************************************
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *    Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *    Grégoire Dupé (Mia-Software) - Bug 483400 - The input size should be computable by the discoverer
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.discovery.benchmark.core.internal.messages"; //$NON-NLS-1$
	public static String Application_Comma_sep_discoverer_list;
	public static String Application_Comma_sep_existing_prj_path;
	public static String Application_Comma_sep_project_list;
	public static String Application_Html_report_dir;
	public static String Application_MemoryPollingInterval;
	public static String Application_no_of_iteration;
	public static String Application_RecordMemoryUse;
	public static String Application_XMI_Output;
	public static String BenchmarkChartGeneration_AvgTimeByPrjSizeFor;
	public static String BenchmarkChartGeneration_AvgUsedMemByPrjSizeFor;
	public static String BenchmarkChartGeneration_DiscoTime;
	public static String BenchmarkChartGeneration_DiscoTimeByPrjSizeOverall;
	public static String BenchmarkChartGeneration_PrjSize;
	public static String BenchmarkChartGeneration_time;
	public static String BenchmarkChartGeneration_UsedMem;
	public static String BenchmarkChartGeneration_UsedMemByPrjSize;
	public static String BenchmarkChartGeneration_UsedMEmByTimeForOnThe;
	public static String DiscovererBenchmarkDiscoverer_BenchmarkInitializationSubTask;
	public static String DiscovererBenchmarkDiscoverer_BenchmarkTaskName;
	public static String DiscovererBenchmarkDiscoverer_DiscoveryInitializationSubTask;
	public static String DiscovererBenchmarkDiscoverer_GeneratingBenchmarkReportSubTask;
	public static String DiscovererBenchmarkDiscoverer_ProjectDiscoveryIterationSubTask;
	public static String DiscovererBenchmarkDiscoverer_ProjectInitializationSubTask;
	public static String DiscovererBenchmarkDiscoverer_SavingBenchmarkDataSubTask;
	public static String MemoryMeasurementJob_MemoryMeasureEveryMs;
	public static String XmiToHtmlApplication_MeasureMemoryUse;
	public static String XmiToHtmlApplication_Target_Folder_Path;
	public static String XmiToHtmlApplication_XMI_file_path;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
