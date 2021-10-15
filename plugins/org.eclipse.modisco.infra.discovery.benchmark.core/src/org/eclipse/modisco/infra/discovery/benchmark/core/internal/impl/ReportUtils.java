/*******************************************************************************
 * Copyright (c) 2012, 2019 INRIA, and Mia-Software.
 *
 * All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Guillaume Doux (INRIA) - Initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *    Grégoire Dupé (Mia-Software) - Bug 482857 - Discoverer Benchmark Report : wrong namespaces
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.HtmlReport;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.internal.BenchmarkChartGeneration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;

public final class ReportUtils {

	private ReportUtils() {
		// Must not be used
	}

	public static void generateReport(final Benchmark benchmark,
			final File targetFolder, final List<? extends Object> arguments,
			final boolean measureMemoryUse) throws ReportUtilsException {
		try {
			// Generation of the HTML report
			final HtmlReport report = new HtmlReport(benchmark, targetFolder, arguments);
			report.doGenerate(null);
			// Generation of the charts
			final BenchmarkChartGeneration chartGenerator =
					new BenchmarkChartGeneration(targetFolder, measureMemoryUse);
			chartGenerator.generateAll(benchmark);
		} catch (final Exception e) {
			throw new ReportUtilsException(e);
		}
	}

	public static void generateReport(final URI benchmarkUri, final File targetFolder,
			final List<? extends Object> arguments,
			final boolean measureMemoryUse) throws ReportUtilsException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.getResource(benchmarkUri, true);
		final List<Benchmark> benchmarks = new ArrayList<Benchmark>();
		for (EObject root : resource.getContents()) {
			if (root instanceof Benchmark) {
				final Benchmark benchmark = (Benchmark) root;
				benchmarks.add(benchmark);
			}
		}
		if (benchmarks.isEmpty()) {
			final String message = String.format(
					"The resource '' doen't contains any Benchmark instances at its root.", //$NON-NLS-1$
					benchmarkUri.toString());
			throw new ReportUtilsException(message);
		}
		if (benchmarks.size() == 1) {
			generateReport(benchmarks.get(0), targetFolder, arguments,
					measureMemoryUse);
		} else {
			for (Benchmark benchmark : benchmarks) {
				generateReport(benchmark, targetFolder, arguments,
						measureMemoryUse);
			}
		}
	}

	public static void generateReport(final File benchmarkFile, final File targetFolder,
			final List<? extends Object> arguments,
			final boolean measureMemoryUse) throws ReportUtilsException {
		final URI uri = URI.createFileURI(benchmarkFile.getAbsolutePath());
		generateReport(uri, targetFolder, arguments, measureMemoryUse);
	}

}
