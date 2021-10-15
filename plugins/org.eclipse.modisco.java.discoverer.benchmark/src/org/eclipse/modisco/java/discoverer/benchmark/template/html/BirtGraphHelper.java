/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 343155 - Java discoverer time benchmark
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark.template.html;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.birt.chart.computation.Point;
import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.LineAttributesImpl;
import org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl;
import org.eclipse.birt.chart.model.attribute.impl.TextImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Label;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.LabelImpl;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.LabelBlock;
import org.eclipse.birt.chart.model.layout.impl.LabelBlockImpl;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.ScatterSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.birt.chart.model.type.impl.ScatterSeriesImpl;
import org.eclipse.birt.chart.util.PluginSettings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery;
import org.eclipse.modisco.infra.discovery.benchmark.Project;

public final class BirtGraphHelper {

	private static final double CHART_UNIT_SPACING = 0.1;
	public static final double MEBIBYTE = 1024.0 * 1024.0;

	private BirtGraphHelper() {
		//
	}

	public static void createBirtGraph(final AveragedMultiDiscoveryBenchmark benchmark,
			final File targetFolder) throws ChartException {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
		chart.setUnitSpacing(BirtGraphHelper.CHART_UNIT_SPACING);
		chart.getPlot().setBackground(ColorDefinitionImpl.WHITE());
		chart.getPlot().getClientArea().setBackground(ColorDefinitionImpl.WHITE());
		// chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		chart.getLegend().setVisible(false);

		// TODO: externalize
		chart.getTitle().getLabel().getCaption()
				.setValue("Discovery time as function of project size"); //$NON-NLS-1$

		Axis xAxis = chart.getPrimaryBaseAxes()[0];
		xAxis.setType(AxisType.LINEAR_LITERAL);
		xAxis.setFormatSpecifier(NumberFormatSpecifierImpl.create());

		// TODO: externalize
		xAxis.getTitle().getCaption().setValue("Project size (MiB)"); //$NON-NLS-1$
		xAxis.getTitle().setVisible(true);

		List<Point> dataPoints = new ArrayList<Point>();
		for (AveragedProjectDiscovery discovery : benchmark.getDiscoveries()) {
			EList<Project> projects = discovery.getOccurrences().get(0).getProjects();
			long totalSizeInBytes = 0;
			for (Project project : projects) {
				totalSizeInBytes += project.getTotalSizeInBytes();
			}
			dataPoints.add(new Point(totalSizeInBytes / BirtGraphHelper.MEBIBYTE, discovery
					.getAverageExecutionTimeInSeconds()));
		}

		// sort on X axis
		Collections.sort(dataPoints, new Comparator<Point>() {
			public int compare(final Point o1, final Point o2) {
				if (o1.x == o2.x) {
					return 0;
				} else if (o1.x < o2.x) {
					return -1;
				} else {
					return 1;
				}
			}
		});

		ArrayList<Double> xAxisValues = new ArrayList<Double>();
		for (Point dataPoint : dataPoints) {
			xAxisValues.add(dataPoint.x);
		}
		NumberDataSet xAxisDataSet = NumberDataSetImpl.create(xAxisValues);

		Series xAxisSeries = SeriesImpl.create();
		xAxisSeries.setDataSet(xAxisDataSet);
		SeriesDefinition xSeriesDefinition = SeriesDefinitionImpl.create();
		xSeriesDefinition.getSeries().add(xAxisSeries);
		xAxis.getSeriesDefinitions().add(xSeriesDefinition);

		Axis yAxis = chart.getPrimaryOrthogonalAxis(xAxis);
		yAxis.setType(AxisType.LINEAR_LITERAL);
		yAxis.setFormatSpecifier(NumberFormatSpecifierImpl.create());
		yAxis.getTitle().setVisible(true);

		// TODO: externalize
		yAxis.getTitle().getCaption().setValue("Discovery time (seconds)"); //$NON-NLS-1$

		ScatterSeries lineSeries = (ScatterSeries) ScatterSeriesImpl.create();
		ArrayList<Double> yAxisValues = new ArrayList<Double>();
		for (Point dataPoint : dataPoints) {
			yAxisValues.add(dataPoint.y);
		}
		NumberDataSet dataSet = NumberDataSetImpl.create(yAxisValues);
		lineSeries.setDataSet(dataSet);

		LineAttributes lineAttr = LineAttributesImpl.create(ColorDefinitionImpl.BLACK(),
				LineStyle.SOLID_LITERAL, 1);
		lineAttr.setVisible(false);
		lineSeries.setLineAttributes(lineAttr);

		Point[] linearRegression = computeLinearRegression(dataPoints);
		LineSeries linearRegressionSeries = (LineSeries) LineSeriesImpl.create();
		ArrayList<Double> regressionYAxisValues = new ArrayList<Double>();
		for (Point point : linearRegression) {
			regressionYAxisValues.add(point.y);
		}
		NumberDataSet linearRegressionDataSet = NumberDataSetImpl.create(regressionYAxisValues);
		linearRegressionSeries.setDataSet(linearRegressionDataSet);
		linearRegressionSeries.getMarkers().clear();

		// line attributes
		LineAttributes lineAttr2 = LineAttributesImpl.create(ColorDefinitionImpl.BLACK(),
				LineStyle.DASHED_LITERAL, 1);
		lineAttr2.setVisible(true);
		linearRegressionSeries.setLineAttributes(lineAttr2);

		// display s/MiB
		Point lastPoint = linearRegression[linearRegression.length - 1];
		LabelBlock labelBlock = (LabelBlock) LabelBlockImpl.create();
		Label label = LabelImpl.create();
		label.setCaption(TextImpl.create(String.format("%.3f s/MiB", lastPoint.y / lastPoint.x))); //$NON-NLS-1$
		labelBlock.setLabel(label);
		labelBlock.setAnchor(Anchor.NORTH_EAST_LITERAL);
		chart.getPlot().add(labelBlock);

		SeriesDefinition ySeriesDefinition = SeriesDefinitionImpl.create();
		ySeriesDefinition.getSeries().add(lineSeries);
		ySeriesDefinition.getSeries().add(linearRegressionSeries);
		yAxis.getSeriesDefinitions().add(ySeriesDefinition);

		PluginSettings ps = PluginSettings.instance();
		IDeviceRenderer render = ps.getDevice("dv.PNG"); //$NON-NLS-1$
		render.setProperty(IDeviceRenderer.FILE_IDENTIFIER, new File(targetFolder,
				"executionTimeByProjectSize.png")); //$NON-NLS-1$
		final int width = 800;
		final int height = 400;
		Bounds bounds = BoundsImpl.create(0, 0, width, height);
		Generator generator = Generator.instance();
		GeneratedChartState state = generator.build(render.getDisplayServer(), chart, bounds, null,
				null, null);
		generator.render(render, state);
	}

	/**
	 * Computes the linear regression of the given list of points, and returns
	 * points on the computed line.
	 *
	 * @param dataPoints
	 *            the points to include in the computation
	 * @return points on the computed approximation line, with the same abscissa
	 *         as the input points
	 */
	private static Point[] computeLinearRegression(final List<Point> dataPoints) {
		// see: http://en.wikipedia.org/wiki/Simple_linear_regression
		double size = dataPoints.size();
		if ((int) size == 0) {
			return new Point[0];
		}
		if ((int) size == 1) {
			Point point = dataPoints.get(0);
			return new Point[] { new Point(point.x, point.y) };
		}
		double sumXY = 0.0;
		double sumX = 0.0;
		double sumY = 0.0;
		double sumXX = 0.0;
		for (Point point : dataPoints) {
			sumX += point.x;
			sumXX += point.x * point.x;
			sumY += point.y;
			sumXY += point.x * point.y;
		}

		// a = (NΣXY - (ΣX)(ΣY)) / (NΣX² - (ΣX)²)
		double a = (size * sumXY - sumX * sumY) / (size * sumXX - sumX * sumX);
		// b = (ΣY - b(ΣX)) / N
		double b = (sumY - a * sumX) / size;

		List<Point> resultPoints = new ArrayList<Point>();
		for (Point point : dataPoints) {
			// y = ax + b
			resultPoints.add(new Point(point.x, a * point.x + b));
		}
		return resultPoints.toArray(new Point[resultPoints.size()]);
	}
}
