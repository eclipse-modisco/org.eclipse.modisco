/*******************************************************************************
 * Copyright (c) 2012 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.utils.chart.birt.core.tests.internal;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.File;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.modisco.utils.chart.birt.core.internal.exported.BirtGraphHelper;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Chart;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartFactory;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Point;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Serie;
import org.junit.Test;

/**
 * @author Guillaume Doux
 *
 */
public class BirtGraphHelperTest {


	/**
	 *
	 */
	private static final int FIVE = 5;

	/**
	 * Test method for {@link org.eclipse.modisco.utils.chart.birt.core.BirtGraphHelper#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		assertSame(BirtGraphHelper.getInstance(), BirtGraphHelper.getInstance());
	}

	/**
	 * Test method for {@link org.eclipse.modisco.utils.chart.birt.core.BirtGraphHelper#createBirtGraph(org.eclipse.modisco.utils.chart.metamodel.chart.Chart, java.io.File, java.lang.String)}.
	 */
	@Test
	public void testCreateBirtGraph() {
		Chart birtChart = this.createSampleChart();
		String fileName = "testChart";
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject("birttesting");
		NullProgressMonitor monitor = new NullProgressMonitor();
		if (project.exists()) {
			try {
				project.delete(true, monitor);
			} catch (CoreException e) {
				fail("Project deletion failed: " + e.getMessage());
			}
		} else {
			try {
				project.create(monitor);
			} catch (CoreException e) {
				fail("Project creation failed: " + e.getMessage());
			}
		}
		IFile iFile = project.getFile(fileName + ".png");
		if (iFile.exists()) {
			try {
				iFile.delete(true, monitor);
			} catch (CoreException e) {
				fail("Test chart deletion failed: " + e.getMessage());
			}
		}
		String location = project.getLocation().toString().replace("platform:/resource", "");
		File targetFolder = new File(URI.create(location).toString());
		try {
			BirtGraphHelper.getInstance().createBirtGraph(birtChart, targetFolder, fileName);
		} catch (Exception e) {
			fail("Chart creation in birt failed: " + e.getMessage());
		}
		File result = new File(targetFolder.getAbsolutePath() + "/" + fileName + ".png");
		if (result.exists()) {
			result.delete();
		} else {
			fail("Chart is not generated");
		}
	}

	/**
	 * Create a sample chart for the tests
	 * @return the test chart
	 */
	private Chart createSampleChart() {
		Chart birtChart = ChartFactory.eINSTANCE.createChart();
		birtChart.setTitle("TestChart");
		Serie serie = ChartFactory.eINSTANCE.createSerie();
		serie.setName("testSerie");
		birtChart.getSeries().add(serie);
		Axe xaxe = ChartFactory.eINSTANCE.createAxe();
		Axe yaxe = ChartFactory.eINSTANCE.createAxe();
		xaxe.setUnit("x unit");
		xaxe.setLegend("x legend");
		yaxe.setUnit("y unit");
		yaxe.setLegend("y legend");
		birtChart.getAxes().add(xaxe);
		birtChart.getAxes().add(yaxe);
		for (int i = 0; i < FIVE; i++) {
			Point point = this.createPoint(xaxe, yaxe, i, i + 1);
			point.setSerie(serie);
		}
		return birtChart;
	}

	/**
	 * Create a new point
	 * @param xaxe axis for the first coordinate
	 * @param yaxe axis for the second coordinate
	 * @param xval value of the first coordinate
	 * @param yval value of the second coordinate
	 * @return the new point
	 */
	private Point createPoint(final Axe xaxe, final Axe yaxe, final double xval, final double yval) {
		Point point = ChartFactory.eINSTANCE.createPoint();
		Coordinate xcoord = ChartFactory.eINSTANCE.createCoordinate();
		xcoord.setAxe(xaxe);
		xcoord.setValue(xval);
		Coordinate ycoord = ChartFactory.eINSTANCE.createCoordinate();
		ycoord.setAxe(yaxe);
		ycoord.setValue(yval);
		point.getCoordinates().add(xcoord);
		point.getCoordinates().add(ycoord);
		return point;
	}

}
