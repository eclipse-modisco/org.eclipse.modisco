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
import java.util.Map;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.CDODiscovery;
import org.eclipse.modisco.java.generation.utils.IndentingStringBuilder;
import org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject;

/**
 * HtmlReport is a direct Java implementation of
 * /org.eclipse.modisco.java.discoverer.benchmark/src/org/eclipse/modisco/java/discoverer/benchmark/template/html/htmlReport.mtl
 * avoiding the need to revise for Acceleo4 and indeed avoiding the need for Acceleo at all.
 * 
 * It may be exercised by Discovery->Discoverers->Java Benchmark->Discover Java Model from Java Project - Benchmark
 */
@SuppressWarnings("nls")
public class HtmlReport
{
	protected final String target;
	private IndentingStringBuilder s = null;
	private final Map<String, String> file2text = new HashMap<>();

	public HtmlReport(String target) {
		this.target = target;
	}

	protected void append(String string) {
		s.append(string);
	}

	protected void popFile(String fileKey) {
		s.close();
		file2text.put(target + "/" + fileKey, s.toString());
		s = null;
	}

	protected void pushFile() {
		assert s == null;
		s = new IndentingStringBuilder();
	}

	public void generate(Iterable<MultiProjectBenchmark> benchmarks, Monitor monitor) {
		for (MultiProjectBenchmark benchmark : benchmarks) {
			appendHtmlReport(benchmark);
		}
		for (String fileKey : file2text.keySet()) {
			String text = file2text.get(fileKey);
			try {
				FileWriter fw = new FileWriter(fileKey);
				fw.write(text);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void appendHtmlReport(MultiProjectBenchmark b) {
		pushFile();
		append("<html>\n");
		append("<title>MoDisco Java Discover Benchmark - " + b.getProjects().get(0).getName() + "</title>\n");
		append("<body>\n");
		append("<h1>MoDisco Java Discover Benchmark - " + b.getProjects().get(0).getName() + "</h1>\n");
		append("<p>Maximum Java heap size = " + b.getJvmMaxHeapInMiB() + " MiB<p>\n");
		append("<p>Java project name = " + b.getProjects().get(0).getName() + "</p>\n");
		append("\n");
		append("<h2>Summary</h2>\n");
		s.pushIndentation();
			append("<table border=\"1\">\n");
			s.pushIndentation();
				append("<tr>\n");
				s.pushIndentation();
					append("<th></th>\n");
					append("<th>Total discovery time (mn)</th>\n");
					append("<th>Save time (mn)</th>\n");
					append("<th>Maximum used memory</th>\n");
					append("<th>Initialization time (mn)</th>\n");
				s.popIndentation();
				append("</tr>\n");
				for (DiscoveredProject project : b.getProjects()) {
					for (Discovery discovery : project.getDiscoveries()) {
						append("<tr>\n");
						s.pushIndentation();
							append("<td><a href=\"#" + discovery.getName() + "\">" + getNames(discovery) + "</a></td>\n");
							append("<td>" + discovery.getTotalExecutionTimeInSeconds() + "</td>\n");
							append("<td>" + discovery.getSaveTimeInSeconds() + "</td>\n");
							append("<td>" + discovery.getMaxUsedMemoryInBytes() + "</td>\n");
							append("<td>");
							if (discovery instanceof CDODiscovery) {
								append("" + ((CDODiscovery)discovery).getInitTimeInSeconds());
							}
							append("</td>\n");
						s.popIndentation();
						append("</tr>\n");
					}
				}
			s.popIndentation();
			append("</table>\n");
		s.popIndentation();
		for (DiscoveredProject project : b.getProjects()) {
			for (Discovery discovery : project.getDiscoveries()) {
				append("<h2><a name=\"" + discovery.getName() + "\"/>" + getNames(discovery) + "</h2>\n");
				s.pushIndentation();
					append("<table>\n");
					s.pushIndentation();
						append("<tr>\n");
						s.pushIndentation();
							append("<td>\n");
							s.pushIndentation();
								append("<p>\n");
								s.pushIndentation();
									append("<a href=\"" + discovery.getName() + ".png\">\n");
									append("<img height=\"300\" src=\"" + discovery.getName() + ".png\"/>\n");
									append("</a>\n");
								s.popIndentation();
								append("</p>\n");
							s.popIndentation();
							append("</td>\n");
							append("<td>\n");
							s.pushIndentation();
								append("<h3>Discovery properties</h3>\n");
								append("total execution time (mn) = " + discovery.getTotalExecutionTimeInSeconds() + "<br/>\n");
								append("save time (mn) = " + discovery.getSaveTimeInSeconds() + "<br/>\n");
								append("algo variant = ");
								if (discovery.getAlgorithmVariant() != null) {
									append(discovery.getAlgorithmVariant());
								}
								append("<br/>\n");
								append("meta-model variant = ");
								if (discovery.getMetaModelVariant() != null) {
									append(discovery.getMetaModelVariant());
								}
								append("<br/>\n");
								append("discoverer class name = " + discovery.getDiscovererClassName() + "<br/>\n");
								append("maximum used memory = " + discovery.getMaxUsedMemoryInBytes() + "<br/>\n");
								if (discovery instanceof CDODiscovery) {
									CDODiscovery cdoConf = (CDODiscovery)discovery;
									append("<h3>CDO properties</h3>\n");
									append("CDO version = " + cdoConf.getVersion() + "<br/>\n");
									append("revised LRU capacity = " + cdoConf.getRevisedLruCapacity() + "<br/>\n");
									append("cache type = " + cdoConf.getCacheType() + "<br/>\n");
									append("server description = " + cdoConf.getServerDescription() + "<br/>\n");
									append("current LRU capacity = " + cdoConf.getCurrentLruCapacity() + "<br/>\n");
									append("comment database initialisation time = __cdoConf.initTime/__<br/>\n");
								}
							s.popIndentation();
							append("</td>\n");
						s.popIndentation();
						append("</tr>\n");
					s.popIndentation();
					append("</table>\n");
				s.popIndentation();
			}
		}
		append("<hr/>\n");
		append("<p>This report has been generated with <a href=\"http://www.eclipse.org/gmt/modisco/\">MoDisco</a> Java Discoverer Benchmark.</p>\n");
		append("</body></html>\n");
		popFile("report.html");
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

	@Override
	public String toString() {
		return s.toString();
	}
}