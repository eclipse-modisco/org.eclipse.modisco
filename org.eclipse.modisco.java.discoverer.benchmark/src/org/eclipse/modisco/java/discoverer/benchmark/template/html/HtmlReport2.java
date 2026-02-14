/**
 * Copyright (c) 2026 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.modisco.java.discoverer.benchmark.template.html;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.generation.utils.IndentingStringBuilder;
import org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject;

/**
 * HtmlReport2 is a direct Java implementation of
 * /org.eclipse.modisco.java.discoverer.benchmark/src/org/eclipse/modisco/java/discoverer/benchmark/template/html/htmlReport2.mtl
 * avoiding the need to revise for Acceleo4 and indeed avoiding the need for Acceleo at all.
 * 
 * Exerciseable after uncommenting BenchmarkAction and friends from plugin.xml. Then on the
 * org.eclipse.modisco.infra.browser.custom.examples.uml example project:
 * Discover->Actions->Java Benchmark->Benchmark Java Discovery Time
 */
@SuppressWarnings("nls")
public class HtmlReport2
{
	protected final String target;
	private IndentingStringBuilder s = new IndentingStringBuilder();

	public HtmlReport2(String target) {
		this.target = target;
	}

	protected void append(String string) {
		s.append(string);
	}

	protected void popIndentation() {
		s.popIndentation();
	}

	protected void pushIndentation() {
		s.pushIndentation();
	}

/*	public void generate(Monitor monitor) {
	//	appendHtmlReport(benchmark);
		String text = s.toString();
		s.close();
		String name = target.replace(".html", "2.html");
		try {
			FileWriter fw = new FileWriter(name);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} */

	public void generate(List<EObject> values) {
		for (EObject value : values) {
			if (value instanceof AveragedMultiDiscoveryBenchmark) {
				appendHtmlReport((AveragedMultiDiscoveryBenchmark) value);
			}
		}
		s.close();
		String text = s.toString();
		try {
			FileWriter fw = new FileWriter(target);
			fw.write(text);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void appendHtmlReport(AveragedMultiDiscoveryBenchmark b) {
		append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
		append("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
		append("<html>\n");
		append("<head>\n");
		
		append("<style type=\"text/css\">\n");
		pushIndentation();
			append(".graph {\n");
			pushIndentation();
				append("background-color: #E0E0E0;\n");
				append("border: solid 1px black;\n");
			popIndentation();
			append("}\n");
			append(".graph td {\n");
			pushIndentation();
				append("font-family: verdana, arial, sans serif;\n");
			popIndentation();
			append("}\n");
			append(".bar {\n");
			pushIndentation();
				append("background-color: white;\n");
				append("text-align: right;\n");
				append("border: solid 1px black;\n");
				append("width: 400px;\n");
			popIndentation();
			append("}\n");
			append(".bar div { \n");
			pushIndentation();
				append("background-color: #A0A0FF;\n");
				append("text-align: right;\n");
				append("float: left;\n");
				append("height: 20px;\n");
			popIndentation();
			append("}\n");
			append("body {\n");
			pushIndentation();
				append("background-color: white;\n");
			popIndentation();
			append("}\n");
			append("td {\n");
			pushIndentation();
				append("text-align: center;\n");
			popIndentation();
			append("}\n");
		popIndentation();
		append("</style>\n");

		append("<title>MoDisco Java Discover Benchmark</title>\n");
		append("</head>\n");

		append("<body>\n");

		append("<h2>Execution time by project size</h2>\n");
		append("<img src=\"executionTimeByProjectSize.png\"/>\n");

		append("<h2>System Information</h2>\n");
		pushIndentation();
			append("<table border=\"1\" cellpadding=\"2\" cellspacing=\"0\">\n");
			pushIndentation();
				append("<tr>\n");
				pushIndentation();
					append(" <th>OS name</th>\n");
					append(" <td>" + b.getOsName() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>OS version</th>\n");
					append("<td>" + b.getOsVersion() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>OS architecture</th>\n");
					append("<td>" + b.getOsArchitecture() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>Number of processor cores</th>\n");
					append("<td>" + b.getProcessorCount() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>Processor name</th>\n");
					append("<td>" + b.getProcessorName() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>Processor description</th>\n");
					append("<td>" + b.getProcessorDescription() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>Processor cache size</th>\n");
					append("<td>" + b.getProcessorCacheSize() + "</td>\n");
				popIndentation();
				append("</tr>\n");
		
				append("<tr>\n");
				pushIndentation();
					append("<th>System memory</th>\n");
					append("<td>" + b.getSystemMemory() + "</td>\n");
				popIndentation();
				append("</tr>\n");
			popIndentation();
			append("</table>\n");
		popIndentation();
		
		append("<h2>Results Overview</h2>\n");
		pushIndentation();
			append("<table border=\"1\" cellpadding=\"2\" cellspacing=\"0\">\n");
			pushIndentation();
				append("<tr>\n");
				pushIndentation();
					append("<th>Project</th>\n");
					append("<th>Average discovery time</th>\n");
					append("<th>Average save time</th>\n");
					append("<th>Number of model elements</th>\n");
					append("<th>Total size</th>\n");
					append("<th>Average file size</th>\n");
					append("<th>Total lines</th>\n");
					append("<th>Average lines per file</th>\n");
					append("<th>XMI size</th>\n");
				popIndentation();
				append(" </tr>\n");
				for (AveragedProjectDiscovery averagedDiscovery : b.getDiscoveries()) {
					ProjectDiscovery projectDiscovery = averagedDiscovery.getOccurrences().get(0);
					append("<tr>\n");
					pushIndentation();
						append("<td>" + projectDiscovery.getName() + "</td>\n");
						append("<td>" + HtmlReportServices.timeWithUnit((0.0 + averagedDiscovery.getAverageExecutionTimeInSeconds())) + " (&sigma; = " + averagedDiscovery.getExecutionTimeStandardDeviation() + "s)</td>\n");
						append("<td>" + HtmlReportServices.timeWithUnit((0.0 + averagedDiscovery.getAverageSaveTimeInSeconds())) + " (&sigma; = " + averagedDiscovery.getSaveTimeStandardDeviation() + "s)</td>\n");
						append("<td>" + projectDiscovery.getNumberOfModelElements() + "</td>\n");
						append("<td>" + HtmlReportServices.sizeWithUnit((0.0 + projectDiscovery.getProjects().get(0).getTotalSizeInBytes())) + "</td>\n");
						append("<td>" + HtmlReportServices.sizeWithUnit((0.0 + projectDiscovery.getProjects().get(0).getAverageFileSizeInBytes())) + "</td>\n");
						append("<td>" + projectDiscovery.getProjects().get(0).getTotalLines() + "</td>\n");
						append("<td>" + projectDiscovery.getProjects().get(0).getAverageLinesPerFile() + "</td>\n");
						append("<td>" + HtmlReportServices.sizeWithUnit((0.0 + projectDiscovery.getXmiSizeInBytes())) + "</td>\n");
					popIndentation();
					append("</tr>\n");
				}
			popIndentation();
			append("</table>\n");
		popIndentation();

		if (b.getDiscoveries().get(0).getOccurrences().size() > 1) {
			append("<h2>Execution times per iteration</h2>\n");
			pushIndentation();
				for (AveragedProjectDiscovery averagedDiscovery : b.getDiscoveries()) {
					append("<h3>" + averagedDiscovery.getOccurrences().get(0).getName() + "</h3>\n");
					pushIndentation();
						double maxExecutionTime = HtmlReportServices.maxExecutionTime(averagedDiscovery.getOccurrences());
				
						append("<table width=\"600\" class=\"graph\" cellspacing=\"6\" cellpadding=\"0\">\n");
						pushIndentation();
							append("<tr>\n");
							pushIndentation();
								append("<th>iteration</th><th>relative execution time</th><th>time</th>\n");
							popIndentation();
							append("</tr>\n");
							int projectDiscoveryIndex = 1;
							for (ProjectDiscovery projectDiscovery : averagedDiscovery.getOccurrences()) {
								append("<tr>\n");
								pushIndentation();
									append("<td>" + projectDiscoveryIndex + "/" + averagedDiscovery.getOccurrences().size() + "</td><td class=\"bar\"><div style=\"width: " + projectDiscovery.getTotalExecutionTimeInSeconds() / maxExecutionTime * 100.0 + "%\"></div></td><td>" + HtmlReportServices.timeWithUnit(0.0 + projectDiscovery.getTotalExecutionTimeInSeconds()) + "</td>\n");
								popIndentation();
								append("</tr>\n");
								projectDiscoveryIndex++;
							}
						popIndentation();
						append("</table>\n");
					popIndentation();
				}
			popIndentation();
		}

		if (b.getDiscoveries().get(0).getOccurrences().size() > 1) {
			append("<h2>Save times per iteration</h2>\n");
			pushIndentation();
			for (AveragedProjectDiscovery averagedDiscovery : b.getDiscoveries()) {
				append("<h3>" + averagedDiscovery.getOccurrences().get(0).getName() + "</h3>\n");
				pushIndentation();
					double maxSaveTime = HtmlReportServices.maxSaveTime(averagedDiscovery.getOccurrences());
					append("<table width=\"600\" class=\"graph\" cellspacing=\"6\" cellpadding=\"0\">\n");
					pushIndentation();
						append("<tr>\n");
						pushIndentation();
							append("<th>iteration</th><th>relative save time</th><th>time(s)</th>\n");
						popIndentation();
						append("</tr>\n");
		
						int projectDiscoveryIndex = 1;
						for (ProjectDiscovery projectDiscovery : averagedDiscovery.getOccurrences()) {
							append("<tr>\n");
							pushIndentation();
								append("<td>" + projectDiscoveryIndex + "/" + averagedDiscovery.getOccurrences().size() + "</td><td class=\"bar\"><div style=\"width: " + projectDiscovery.getSaveTimeInSeconds() / maxSaveTime * 100.0 + "%\"></div></td><td>" + HtmlReportServices.timeWithUnit(0.0 + projectDiscovery.getSaveTimeInSeconds()) + "</td>\n");
							popIndentation();
							append("</tr>\n");
							projectDiscoveryIndex++;
						}
					popIndentation();
				popIndentation();
				append("</table>\n");
			}
			popIndentation();
		}
		
		append("<h2>Detailed Results</h2>\n");
		pushIndentation();
		for (AveragedProjectDiscovery averagedDiscovery : b.getDiscoveries()) {
			append("<h3>" + averagedDiscovery.getOccurrences().get(0).getName() + "</h3>\n");
			pushIndentation();
			String separator = null;
			int i = 1;
			for (ProjectDiscovery projectDiscovery : averagedDiscovery.getOccurrences()) {
				append(separator);
				append("<h4>iteration " + i + "</h4>\n");
				pushIndentation();
				append("<b>name</b>: " + projectDiscovery.getName() + "<br/>\n");
				append("<b>date</b>: " + projectDiscovery.getDicoveryDate() + "<br/>\n");
				append("<b>algorithm</b>: " + safeString(projectDiscovery.getAlgorithmVariant()) + "<br/>\n");
				append("<b>discoverer</b>: " + projectDiscovery.getDiscovererId() + " (" + projectDiscovery.getDiscovererClassName() + ")<br/>\n");
				append("<b>save time</b>: " + HtmlReportServices.timeWithUnit(0.0 + projectDiscovery.getSaveTimeInSeconds()) + "<br/>\n");
				append("<b>execution time</b>: " + HtmlReportServices.timeWithUnit(0.0 + projectDiscovery.getTotalExecutionTimeInSeconds()) + "<br/>\n");
				append("<b>metamodel variant</b>: " + safeString(projectDiscovery.getMetaModelVariant()) + "<br/>\n");
				append("<b>max used memory</b>: " + HtmlReportServices.sizeWithUnit(0.0 + projectDiscovery.getMaxUsedMemoryInBytes()) + "<br/>\n");
				append("<b>number of model elements</b>: " + projectDiscovery.getNumberOfModelElements() + "<br/>\n");
				append("<b>XMI file size</b>: " + HtmlReportServices.sizeWithUnit(0.0 + projectDiscovery.getXmiSizeInBytes()) + "<br/>\n");
				if (projectDiscovery.getDiscoveryError() != null) {
					append("<b>Discovery error</b>:<br/>\n");
					append("<font color=\"red\">" + HtmlReportServices.lfToBr(projectDiscovery.getDiscoveryError()) + "</font>\n");
				}
				separator = "<hr/\n";
				popIndentation();
				i++;
			}
			popIndentation();
		}
		popIndentation();
		
		append("<p/>\n");
		append("<hr/>\n");
		append("<font size=\"-1\"><i>This report has been generated with <a href=\"http://www.eclipse.org/MoDisco/\">MoDisco</a> Java Discoverer Benchmark.</i></font>\n");
		append("</body>\n");
		append("</html>\n");
	}

	protected static String getNames(Discovery discovery) {
		StringBuilder s = new StringBuilder();
		if (discovery instanceof CDODiscovery) {
			s.append("CDO ");
		}
		if (discovery.getAlgorithmVariant() != null) {
			s.append(discovery.getAlgorithmVariant() + " ");
		}
		if (discovery.getMetaModelVariant() != null) {
			s.append(discovery.getMetaModelVariant() + " ");
		}
		if (discovery instanceof CDODiscovery) {
			s.append(((CDODiscovery)discovery).getServerDescription() + " ");
		}
		return s.toString().trim();
	}

	public String safeString(String string) {
		return string != null ? string : "";
	}
		
	@Override
	public String toString() {
		return s.toString();
	}
}