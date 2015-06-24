/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.benchmark;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.LineAttributesImpl;
import org.eclipse.birt.chart.model.attribute.impl.TextImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.ComponentFactory;
import org.eclipse.birt.chart.model.component.Label;
import org.eclipse.birt.chart.model.component.Scale;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.LabelImpl;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataElement;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.template.html.HtmlReport;
import org.eclipse.gmt.modisco.java.discoverer.cdo.JavaDiscovererCDO;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkFactory;
import org.eclipse.swt.graphics.Point;

/**
 * @author Gregoire DUPE (Mia-Software)
 * 
 * 
 * @deprecated use org.eclipse.modisco.java.discoverer.benchmark component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class Report {
	private static final int MINUTE_MS_RANGE = 60000;
	private static final int CHART_SIZE = 1000;
	private static final int RESCALE_COEF = 10;
	private static final double BOUNDS_SCALE_CONST = 72d;
	public static final String HTMLREPORT_FILE_NAME = "report.html"; //$NON-NLS-1$
	private final IProject statProject;
	private final Map<Integer, ArrayList<Float>> map = new HashMap<Integer, ArrayList<Float>>();
	private final Map<String, Integer> titleMap = new HashMap<String, Integer>();
	private int index = 0;

	public Report(final IProject statProject) {
		this.statProject = statProject;
	}

	public MultiProjectBenchmark generate() throws CoreException, IOException {
		MultiProjectBenchmark benchmark = buildReportModelAndDiagrams();
		generateHTML(benchmark, this.statProject.getLocation().toFile());
		return benchmark;
	}

	private MultiProjectBenchmark buildReportModelAndDiagrams() throws CoreException, IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI("platform:/resource/" //$NON-NLS-1$
				+ this.statProject.getName() + "/report.xmi"); //$NON-NLS-1$
		Resource modelResource = resourceSet.createResource(uri);
		MultiProjectBenchmark benchmark = BenchmarkFactory.eINSTANCE.createMultiProjectBenchmark();
		modelResource.getContents().add(benchmark);
		List<IStatus> errors = new ArrayList<IStatus>();
		this.statProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		for (IResource resource : this.statProject.members()) {
			try {
				if (resource instanceof IFile) {
					IFile file = (IFile) resource;
					if (file.getLocation().getFileExtension().equals(Statistics.TSV_FILE_EXT)) {
						String lastLine1 = ""; //$NON-NLS-1$
						String lastLine2 = ""; //$NON-NLS-1$
						BufferedReader bufferReader = new BufferedReader(new FileReader(file
								.getLocation().toFile()));
						String line = bufferReader.readLine();
						titleLine(line);
						line = bufferReader.readLine();
						int maxUsedMemory = 0;
						while (line != null) {
							addToSeries(line);
							lastLine2 = lastLine1;
							lastLine1 = line;
							int usedMemory = new Integer(getValue(line, Statistics.USED_MEMORY));
							maxUsedMemory = Math.max(maxUsedMemory, usedMemory);
							line = bufferReader.readLine();
						}
						IResource txtResource = resource
								.getParent()
								.findMember(
										resource.getName()
												.replaceAll(
														"(.*)" + Statistics.TSV_FILE_EXT, "$1" + Statistics.PROPERTIES_FILE_EXT)); //$NON-NLS-1$ //$NON-NLS-2$
						Properties properties = new Properties();
						properties.load(txtResource.getLocationURI().toURL().openStream());
						Discovery discovery;
						DiscoveredProject benchmarkedProject;
						String storageKind = properties
								.getProperty(DiscoverJavaModelFromJavaProjectEMFStat.STORAGE_KIND);
						if (storageKind != null && storageKind.equals("CDO")) { //$NON-NLS-1$
							CDODiscovery cdoDiscovery = JavaBenchmarkFactory.eINSTANCE
									.createCDODiscovery();
							discovery = cdoDiscovery;
							cdoDiscovery.setVersion(properties
									.getProperty(JavaDiscovererCDO.CDO_VERSION));
							cdoDiscovery.setServerDescription(properties
									.getProperty(JavaDiscovererCDO.CDO_SERVER_DESCRIPTION));
							cdoDiscovery.setRevisedLruCapacity(new Integer(properties
									.getProperty(JavaDiscovererCDO.REVISED_LRU_CAPACITY)));

							cdoDiscovery.setCacheType(properties
									.getProperty(JavaDiscovererCDO.CDO_CACHE_TYPE));
							cdoDiscovery.setCurrentLruCapacity(new Integer(properties
									.getProperty(JavaDiscovererCDO.CURRENT_LRU_CAPACITY)));
							benchmarkedProject = JavaBenchmarkFactory.eINSTANCE
									.createJavaDiscoveredProject();
							try {
								cdoDiscovery.setInitTimeInSeconds(new Double(properties
										.getProperty(Statistics.INIT_TIME))
										/ Report.MINUTE_MS_RANGE);
							} catch (Exception e) {
								MoDiscoLogger.logError(e, Activator.getDefault());
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
										e.getMessage(), e);
								errors.add(status);
							}
						} else {
							discovery = BenchmarkFactory.eINSTANCE.createDiscovery();
							benchmarkedProject = BenchmarkFactory.eINSTANCE
									.createDiscoveredProject();
						}

						benchmark.getProjects().add(benchmarkedProject);
						benchmarkedProject.getDiscoveries().add(discovery);
						benchmarkedProject
								.setName(properties
										.getProperty(DiscoverJavaModelFromJavaProjectEMFStat.JAVA_PROJECT_NAME));

						discovery.setName(resource.getName().replaceAll(
								"(.*)\\." + Statistics.TSV_FILE_EXT, "$1")); //$NON-NLS-1$ //$NON-NLS-2$
						discovery.setMaxUsedMemoryInBytes(maxUsedMemory);
						discovery.setMetaModelVariant(properties
								.getProperty(DiscoverJavaModelFromJavaProjectEMFStat.MM_VARIANT));
						discovery.setAlgorithmVariant(properties
								.getProperty(DiscoverJavaModelFromJavaProjectEMFStat.ALGO_VARIANT));
						discovery.setSaveTimeInSeconds(new Double(getValue(lastLine2,
								Statistics.SAVE)) / Report.MINUTE_MS_RANGE);
						discovery.setTotalExecutionTimeInSeconds(new Double(getValue(lastLine2,
								Statistics.SINCEBEGIN)) / Report.MINUTE_MS_RANGE);
						discovery
								.setDiscovererClassName(properties
										.getProperty(DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERER_CLASS_NAME));
						// configuration
						// .setDicoveryDate(new Date(
						// properties
						// .getProperty(DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERY_DATE)));
						benchmark.setJvmMaxHeapInMiB(new Integer(properties.getProperty(
								DiscoverJavaModelFromJavaProjectEMFStat.XMX).replaceAll(
								"^([0-9]+).*", "$1"))); //$NON-NLS-1$//$NON-NLS-2$

						rescaleDebugCode(benchmark.getJvmMaxHeapInMiB());

						birt(file, benchmark, discovery);
					}
				}

				this.statProject.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (Exception e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				errors.add(status);
			}
		}
		modelResource.save(Collections.EMPTY_MAP);
		if (errors.size() > 0) {
			CoreException e = new CoreException(new MultiStatus(Activator.PLUGIN_ID, IStatus.ERROR,
					errors.toArray(new IStatus[] {}), "", //$NON-NLS-1$
					new Exception()));
			MoDiscoLogger.logError(e, Activator.getDefault());
			// throw e;
		}
		return benchmark;
	}

	private void birt(final IFile file, final Benchmark benchmark, final Discovery discovery) {
		String diagramTitle = ""; //$NON-NLS-1$
		if (discovery instanceof CDODiscovery) {
			diagramTitle += "CDO "; //$NON-NLS-1$
		}
		if (discovery.getAlgorithmVariant() != null) {
			diagramTitle += discovery.getAlgorithmVariant() + " "; //$NON-NLS-1$
		}
		if (discovery.getMetaModelVariant() != null) {
			diagramTitle += discovery.getMetaModelVariant() + " "; //$NON-NLS-1$
		}
		if (discovery instanceof CDODiscovery) {
			CDODiscovery cdoConfiguration = (CDODiscovery) discovery;
			diagramTitle += "(" //$NON-NLS-1$
					+ cdoConfiguration.getServerDescription() + ")"; //$NON-NLS-1$
		}
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_WITH_DEPTH_LITERAL);
		chart.getPlot().setBackground(ColorDefinitionImpl.WHITE());
		chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl.WHITE());

		chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		chart.getLegend().setVisible(true);

		chart.getTitle().getLabel().getCaption().setValue(diagramTitle);
		// chart.getTitle().getLabel().getCaption().getFont().setSize(14);
		// chart.getTitle().getLabel().getCaption().getFont().setName(FONT_NAME);

		Axis xAxis = chart.getPrimaryBaseAxes()[0];
		xAxis.getTitle().setCaption(TextImpl.create(Messages.Report_0));
		xAxis.getTitle().setVisible(true);

		// xAxis.getTitle().getCaption().setValue("xTitle");

		NumberDataSet categoryValues = NumberDataSetImpl.create(this.map.get(-1));

		Series xAxisSerie = SeriesImpl.create();
		xAxisSerie.setDataSet(categoryValues);
		SeriesDefinition xSeriesDefinition = SeriesDefinitionImpl.create();
		xSeriesDefinition.getSeriesPalette().shift(1);
		xAxis.getSeriesDefinitions().add(xSeriesDefinition);
		xSeriesDefinition.getSeries().add(xAxisSerie);

		Axis yAxis = chart.getPrimaryOrthogonalAxis(xAxis);
		yAxis.getTitle().setVisible(true);
		yAxis.getTitle().getCaption().setValue("MB"); //$NON-NLS-1$
		// yAxis.getScale().setStep(1.0);
		createYAxis(yAxis, "USED_MEMORY", ColorDefinitionImpl.BLACK()); //$NON-NLS-1$
		createYAxis(yAxis, "DEBUG_CODE", ColorDefinitionImpl.BLUE()); //$NON-NLS-1$
		Scale scale = ComponentFactory.eINSTANCE.createScale();
		NumberDataElement dataElement = org.eclipse.birt.chart.model.data.DataFactory.eINSTANCE
				.createNumberDataElement();
		dataElement.setValue(benchmark.getJvmMaxHeapInMiB());
		scale.setMax(dataElement);
		NumberDataElement dataElement2 = org.eclipse.birt.chart.model.data.DataFactory.eINSTANCE
				.createNumberDataElement();
		dataElement2.setValue(0);
		scale.setMin(dataElement2);
		yAxis.setScale(scale);

		// createYAxis(yAxis, "SINCEBEGIN (ms)", ColorDefinitionImpl.GREEN());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(file.getLocation()
				.toString().replaceAll("(.*)" + Statistics.TSV_FILE_EXT, "$1xmi"))); //$NON-NLS-1$ //$NON-NLS-2$
		resource.getContents().add(chart);

		try {
			resource.save(Collections.EMPTY_MAP);
			PluginSettings ps = PluginSettings.instance();
			IDeviceRenderer render = ps.getDevice("dv.PNG"); //$NON-NLS-1$
			render.setProperty(IDeviceRenderer.FILE_IDENTIFIER, file.getLocation().toString()
					.replaceAll("(.*)" + Statistics.TSV_FILE_EXT, "$1png")); //$NON-NLS-1$ //$NON-NLS-2$
			Point size = new Point(Report.CHART_SIZE, Report.CHART_SIZE);
			Bounds bounds = BoundsImpl.create(0, 0, size.x, size.y);
			int resolution = render.getDisplayServer().getDpiResolution();
			bounds.scale(Report.BOUNDS_SCALE_CONST / resolution);
			Generator generator = Generator.instance();
			GeneratedChartState state = generator.build(render.getDisplayServer(), chart, bounds,
					null, null, null);
			generator.render(render, state);
		} catch (Exception ex) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, ex.getMessage(), ex);
			Activator.getDefault().getLog().log(status);
		}

	}

	/**
	 * @param benchmark
	 * @throws IOException
	 */
	private void generateHTML(final Benchmark benchmark, final File targetDirectory)
			throws IOException {
		new HtmlReport(benchmark, targetDirectory, new ArrayList<Object>()).doGenerate(null);
	}

	private void createYAxis(final Axis yAxis, final String columnName,
			final ColorDefinition colorDefinition) {

		LineSeries serie = (LineSeries) LineSeriesImpl.create();
		serie.setSeriesIdentifier(columnName);

		Integer indexx = this.titleMap.get(columnName);
		Object values = this.map.get(indexx);
		NumberDataSet dataSet = NumberDataSetImpl.create(values);
		serie.setDataSet(dataSet);

		serie.getMarkers().clear();

		LineAttributes lineAttr = LineAttributesImpl.create(colorDefinition,
				LineStyle.SOLID_LITERAL, 1);
		serie.setLineAttributes(lineAttr);

		Label label = LabelImpl.create();
		label.setCaption(TextImpl.create(columnName));
		label.setVisible(false);
		serie.setLabel(label);

		SeriesDefinition seriesDefinition = SeriesDefinitionImpl.create();
		seriesDefinition.getSeries().add(serie);
		yAxis.getSeriesDefinitions().add(seriesDefinition);

	}

	/**
	 * 
	 */
	private void rescaleDebugCode(final long maxMemory) {
		float coef = new Float(maxMemory) / Report.RESCALE_COEF;
		ArrayList<Float> l = this.map.get(this.titleMap.get(Statistics.DEBUG_CODE));
		ArrayList<Float> l2 = new ArrayList<Float>();
		for (Float f : l) {
			l2.add(f * coef);
		}
		this.map.put(this.titleMap.get(Statistics.DEBUG_CODE), l2);

	}

	private void addToSeries(final String line) {
		this.index++;
		this.map.get(-1).add(new Float(this.index));
		String[] splits = line.split("\t"); //$NON-NLS-1$
		for (int i = 0; i < splits.length; i++) {
			Float f;
			try {
				f = new Float(splits[i]);
			} catch (Exception e) {
				f = new Float(0);
			}
			List<Float> serie = this.map.get(i);
			serie.add(f);
		}
	}

	private String getValue(final String line, final String columnName) {
		try {
			String[] splits = line.split("\t"); //$NON-NLS-1$
			return splits[this.titleMap.get(columnName).intValue()];
		} catch (Exception e) {
			return ""; //$NON-NLS-1$
		}
	}

	private void titleLine(final String line) {
		String[] titles = line.split("\t"); //$NON-NLS-1$
		this.titleMap.put("index", -1); //$NON-NLS-1$
		this.map.put(-1, new ArrayList<Float>());
		for (int i = 0; i < titles.length; i++) {
			this.titleMap.put(titles[i], i);
			this.map.put(i, new ArrayList<Float>());
		}
	}

}
