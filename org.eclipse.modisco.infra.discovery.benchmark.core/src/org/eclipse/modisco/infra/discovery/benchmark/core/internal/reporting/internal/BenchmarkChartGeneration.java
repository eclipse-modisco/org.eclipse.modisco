/*******************************************************************************
 * Copyright (c) 2012, 2019 INRIA and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Guillaume Doux - INRIA - Initial API and implementation
 *     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.Messages;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project;
import org.eclipse.modisco.utils.chart.birt.core.internal.exported.BirtGraphHelper;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartFactory;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie;
import org.eclipse.osgi.util.NLS;

/**
 * Class preparing and launching the chart generation in Birt
 * @author Guillaume Doux
 *
 */
public class BenchmarkChartGeneration {

	private final File location;
	private final boolean measureMemory;
	private final ChartFactory factory;
	private final BirtGraphHelper helper;

	public static final double MEGABYTE = 1024.0 * 1024.0;

	/**
	 * public constructor of the chart generator
	 * @param location: location folder of the generated charts
	 */
	public BenchmarkChartGeneration(final File location, final boolean measureMemory) {
		this.location = location;
		this.measureMemory = measureMemory;
		this.factory = ChartFactory.eINSTANCE;
		this.helper = BirtGraphHelper.getInstance();
	}

	public void generateAll(final Benchmark b) throws Exception {
		createDiscoveryTimeAsProjectSizeFull(b);
		if (this.measureMemory) {
			createMemoryUsedAsProjectSizeFull(b);
		}
	}

	public void createDiscoveryTimeAsProjectSizeFull(final Benchmark b) throws Exception {
		createDiscoveryTimeAsProjectSizeOverallAveraged(b);
		final List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				createDiscoveryTimeAsProjectSizeAveraged(b, d);
				testedDiscoverers.add(d.getDiscovererId());
			}
		}
	}

	private void createDiscoveryTimeAsProjectSizeAveraged(final Benchmark b, final Discovery d) throws Exception {
		final Chart chart = this.factory.createChart();
		final String title = NLS.bind(
				Messages.BenchmarkChartGeneration_AvgTimeByPrjSizeFor,
				d.getDiscovererId());
		chart.setTitle(title);
		final Serie series = this.factory.createSerie();
		series.setName(d.getDiscovererId());
		chart.getSeries().add(series);
		final Axe size = this.factory.createAxe();
		final Axe time = this.factory.createAxe();
		size.setLegend(Messages.BenchmarkChartGeneration_PrjSize);
		time.setUnit("secondes"); //$NON-NLS-1$
		time.setLegend(Messages.BenchmarkChartGeneration_DiscoTime);
		chart.getAxes().add(size);
		chart.getAxes().add(time);
		for (Discovery dtemp : b.getDiscoveries()) {
			if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
				final Point point = this.factory.createPoint();
				point.setSerie(series);
				final Coordinate t = this.factory.createCoordinate();
				t.setAxe(size);
				final Project project = (Project) dtemp.getProject();
				size.setUnit(project.getInputSizeUnit());
				t.setValue(project.getInputSize());
				final Coordinate m = this.factory.createCoordinate();
				m.setAxe(time);
				m.setValue(dtemp.getDiscoveryTimeAverageInSeconds());
				point.getCoordinates().add(t);
				point.getCoordinates().add(m);
			}
		}
		final String fileName = String.format("avgTimeBySize_%s", //$NON-NLS-1$
				d.getDiscovererId());
		final File reportDir = new File(this.location, "Report"); //$NON-NLS-1$
		if (!reportDir.exists()) {
			reportDir.mkdirs();
		}
		this.helper.createBirtGraph(chart, reportDir, fileName);
	}

	private void createDiscoveryTimeAsProjectSizeOverallAveraged(final Benchmark b) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle(Messages.BenchmarkChartGeneration_DiscoTimeByPrjSizeOverall);
		Axe size = this.factory.createAxe();
		Axe time = this.factory.createAxe();
		size.setLegend(Messages.BenchmarkChartGeneration_PrjSize);
		time.setUnit("secondes"); //$NON-NLS-1$
		time.setLegend(Messages.BenchmarkChartGeneration_DiscoTime);
		chart.getAxes().add(size);
		chart.getAxes().add(time);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				Serie s = this.factory.createSerie();
				s.setName(d.getDiscovererId());
				chart.getSeries().add(s);
				for (Discovery dtemp : b.getDiscoveries()) {
					if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
						Point p = this.factory.createPoint();
						p.setSerie(s);
						Coordinate t = this.factory.createCoordinate();
						t.setAxe(size);
						final Project project = (Project) dtemp.getProject();
						size.setUnit(project.getInputSizeUnit());
						t.setValue(project.getInputSize());
						Coordinate m = this.factory.createCoordinate();
						m.setAxe(time);
						m.setValue(dtemp.getDiscoveryTimeAverageInSeconds());
						p.getCoordinates().add(t);
						p.getCoordinates().add(m);
					}
				}
				testedDiscoverers.add(d.getDiscovererId());
			}
		}
		this.helper.createBirtGraph(chart, this.location,
				"DiscoveryTimeByProjectSizeOverall"); //$NON-NLS-1$
	}


	public void createMemoryUsedAsProjectSizeFull(final Benchmark b) throws Exception {
		createMemoryUsedAsProjectSizeOverallAveraged(b);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				createMemoryUsedAsProjectSizeAveraged(b, d);
				testedDiscoverers.add(d.getDiscovererId());
			}
			for (DiscoveryIteration di : d.getIterations()) {
				createMemoryUseByTime(d, di);
			}
		}
	}

	private void createMemoryUsedAsProjectSizeAveraged(final Benchmark b, final Discovery d) throws Exception {
		Chart chart = this.factory.createChart();
		final String title = NLS.bind(
				Messages.BenchmarkChartGeneration_AvgUsedMemByPrjSizeFor,
				d.getDiscovererId());
		chart.setTitle(title);
		Serie s = this.factory.createSerie();
		s.setName(d.getDiscovererId());
		chart.getSeries().add(s);
		Axe size = this.factory.createAxe();
		Axe memory = this.factory.createAxe();
		size.setLegend(Messages.BenchmarkChartGeneration_PrjSize);
		memory.setUnit("MB"); //$NON-NLS-1$
		memory.setLegend(Messages.BenchmarkChartGeneration_UsedMem);
		chart.getAxes().add(size);
		chart.getAxes().add(memory);
		for (Discovery dtemp : b.getDiscoveries()) {
			if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
				Point p = this.factory.createPoint();
				p.setSerie(s);
				Coordinate t = this.factory.createCoordinate();
				t.setAxe(size);
				final Project project = (Project) dtemp.getProject();
				size.setUnit(project.getInputSizeUnit());
				t.setValue(project.getInputSize());
				Coordinate m = this.factory.createCoordinate();
				m.setAxe(memory);
				m.setValue(dtemp.getIterations().get(0).getMaxUsedMemoryInBytes() / MEGABYTE);
				p.getCoordinates().add(t);
				p.getCoordinates().add(m);
			}
		}
		final String fileName = String.format("avgMemoryByProjectSize_%s", //$NON-NLS-1$
				d.getDiscovererId());
		final File reportDir = new File(this.location, "Report"); //$NON-NLS-1$
		if (!reportDir.exists()) {
			reportDir.mkdirs();
		}
		this.helper.createBirtGraph(chart, reportDir, fileName);
	}

	private void createMemoryUsedAsProjectSizeOverallAveraged(final Benchmark b) throws Exception {
		Chart chart = this.factory.createChart();
		chart.setTitle(Messages.BenchmarkChartGeneration_UsedMemByPrjSize);
		Axe size = this.factory.createAxe();
		Axe memory = this.factory.createAxe();
		size.setLegend(Messages.BenchmarkChartGeneration_PrjSize);
		memory.setUnit("megabytes"); //$NON-NLS-1$
		memory.setLegend(Messages.BenchmarkChartGeneration_UsedMem);
		chart.getAxes().add(size);
		chart.getAxes().add(memory);
		List<String> testedDiscoverers = new ArrayList<String>();
		for (Discovery d : b.getDiscoveries()) {
			if (!testedDiscoverers.contains(d.getDiscovererId())) {
				Serie s = this.factory.createSerie();
				s.setName(d.getDiscovererId());
				chart.getSeries().add(s);
				for (Discovery dtemp : b.getDiscoveries()) {
					if (dtemp.getDiscovererId().equals(d.getDiscovererId())) {
						Point p = this.factory.createPoint();
						p.setSerie(s);
						Coordinate t = this.factory.createCoordinate();
						t.setAxe(size);
						final Project project = (Project) dtemp.getProject();
						size.setUnit(project.getInputSizeUnit());
						t.setValue(project.getInputSize());
						Coordinate m = this.factory.createCoordinate();
						m.setAxe(memory);
						m.setValue(dtemp.getIterations().get(0).getMaxUsedMemoryInBytes() / MEGABYTE);
						p.getCoordinates().add(t);
						p.getCoordinates().add(m);
					}
				}
				testedDiscoverers.add(d.getDiscovererId());
			}
		}
		this.helper.createBirtGraph(chart, this.location,
				"memoryByProjectSizeOverall"); //$NON-NLS-1$
	}


	public void createMemoryUseByTime(final Discovery d, final DiscoveryIteration di) throws Exception {
		Chart chart = this.factory.createChart();
		final String title = NLS.bind(
				Messages.BenchmarkChartGeneration_UsedMEmByTimeForOnThe,
				new Object[]{
					d.getDiscovererId(),
					d.getProject().getName(),
					di.getDiscoveryDate().toString()
				});
		chart.setTitle(title);
		Serie s = this.factory.createSerie();
		s.setName(d.getDiscovererId());
		chart.getSeries().add(s);
		Axe time = this.factory.createAxe();
		Axe memory = this.factory.createAxe();
		time.setUnit("ms"); //$NON-NLS-1$
		time.setLegend(Messages.BenchmarkChartGeneration_time);
		memory.setUnit("megabytes"); //$NON-NLS-1$
		memory.setLegend(Messages.BenchmarkChartGeneration_UsedMem);
		chart.getAxes().add(time);
		chart.getAxes().add(memory);

		for (Event mm : di.getMemoryMeasurements()) {
			if (mm instanceof MemoryMeasurement) {
				MemoryMeasurement mem = (MemoryMeasurement) mm;
				Point p = this.factory.createPoint();
				p.setSerie(s);
				Coordinate t = this.factory.createCoordinate();
				t.setAxe(time);
				t.setValue(mem.getTime());
				Coordinate m = this.factory.createCoordinate();
				m.setAxe(memory);
				m.setValue(mem.getMemoryUsed() / MEGABYTE);
				p.getCoordinates().add(t);
				p.getCoordinates().add(m);
			}
		}
		final String fileName = String.format("memoryByTime-%s", //$NON-NLS-1$
				Integer.toString(d.getIterations().indexOf(di)));
		final File reportDir = new File(this.location, "Report"); //$NON-NLS-1$
		final File projectDir = new File(reportDir, d.getProject().getName());
		final File targetFolder = new File(projectDir, d.getDiscovererId());
		if (!targetFolder.exists()) {
			targetFolder.mkdirs();
		}
		this.helper.createBirtGraph(chart, targetFolder, fileName);
	}

}
