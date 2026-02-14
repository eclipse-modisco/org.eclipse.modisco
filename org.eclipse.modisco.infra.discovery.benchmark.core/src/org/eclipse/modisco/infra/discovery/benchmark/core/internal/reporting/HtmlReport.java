package org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting.internal.ReportingUtilities;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource;
import org.eclipse.modisco.java.generation.utils.IndentingStringBuilder;

public class HtmlReport
{
	private final String target;
	private IndentingStringBuilder s = null;
	private Map<String, String> file2text = new HashMap<>();

	public HtmlReport(String target) {
		this.target = target;
	}

	protected void append(String string) {
		s.append(string);
	}

	public void generate(Iterable<EObject> values) throws IOException {
		for (EObject value : values) {
			if  (value instanceof Benchmark) {
				appendHtmlReport((Benchmark)value);
			}
		}
		for (String fileKey : file2text.keySet()) {
			String text = file2text.get(fileKey);
			File file = new File(fileKey.replace("\\", "/"));
			File parentFile = file.getParentFile();
			parentFile.mkdirs();
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			fw.close();
		}
	}

	public void popFile(String fileKey) {
		s.close();
		file2text.put(fileKey, s.toString());
		s = null;
	}

	public void popIndentation() {
		s.popIndentation();
	}

	public void pushFile() {
		assert s == null;
		s = new IndentingStringBuilder();
	}

	public void pushIndentation() {
		s.pushIndentation();
	}
	
	public void appendHtmlReport(Benchmark b) {
		appendReportIndex(b);
		for (Discovery discovery : b.getDiscoveries()) {
			appendDiscovererReport(discovery);
		}
		for (Discovery discovery : b.getDiscoveries()) {
			appendDiscoveryReport(discovery);
		}
		for (Resource resource : b.getProjects()) {
			if (resource instanceof Project) {
				appendProjectReport((Project)resource, b);
			}
		}
	}

	public void appendReportIndex(Benchmark b) {
		pushFile();
		appendHead("MoDisco Java Discover Benchmark");
		append("<h2>System Information</h2>\n");
		pushIndentation();
			append("<table border=\"1\" cellpadding=\"2\" cellspacing=\"0\">\n");
			pushIndentation();
				append("<tr>\n");
				pushIndentation();
					append("<th>OS name</th>\n");
					append("<td>" + b.getOsName() + "</td>\n");
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
		append("<h2>Execution time by project size</h2>\n");
		append("<img src=\"DiscoveryTimeByProjectSizeOverall.png\"/>\n");
		if (b.getDiscoveries().get(0).getIterations().get(0).getMaxUsedMemoryInBytes() != 0) {
			append("<h2>Memory use time by project size</h2>\n");
			append("<img src=\"memoryByProjectSizeOverall.png\"/>\n");
		}
		append("<h2>Results Overview</h2>\n");
		pushIndentation();
			append("<table border=\"1\" cellpadding=\"2\" cellspacing=\"0\">\n");
			pushIndentation();
				append("<tr>\n");
				pushIndentation();
					append("<th>Project</th>\n");
					append("<th>Discoverer</th>\n");
					append("<th>Discoveries</th>\n");
					append("<th>Project size</th>\n");
					append("<th>Average discovery time</th>\n");
					append("<th>Average save time</th>\n");
					append("<th>Number of model elements</th>\n");
				popIndentation();
				append("</tr>\n");
				for (Discovery discovery : b.getDiscoveries()) {
					append("<tr>\n");
					pushIndentation();
						append("<td><a href=\"Report/" + discovery.getProject().getName() + ".html\">" + discovery.getProject().getName() + "</a></td>\n");
						append("<td><a href=\"Report/" + discovery.getDiscovererId() + ".html\">" + discovery.getDiscovererId() + "</a></td>\n");
						append("<td><a href=\"Report/" + discovery.getProject().getName() + '/' + discovery.getDiscovererId() + ".html\">Discoveries</a></td>\n");
						append("<td>" + ((Project)discovery.getProject()).getInputSize() + "" + ((Project)discovery.getProject()).getInputSizeUnit() + "</td>\n");
						append("<td>" + ReportingUtilities.timeWithUnit(0.0 + discovery.getDiscoveryTimeAverageInSeconds()) + " (&sigma; = " + ReportingUtilities.timeWithUnit(0.0 + discovery.getExecutionTimeStandardDeviation()) + "s)</td>\n");
						append("<td>" + ReportingUtilities.timeWithUnit(0.0 + discovery.getSaveTimeAverageInSeconds()) + " (&sigma; = " + ReportingUtilities.timeWithUnit(0.0 + discovery.getSaveTimeStandardDeviation()) + "s)</td>\n");
						append("<td>" + discovery.getNumberOfModelElements() + "</td>\n");
					popIndentation();
					append("</tr>\n");
				}
			popIndentation();
		popIndentation();
		append("</table>\n");
		append("\n");
		if (b.getDiscoveries().get(0).getIterations().size() > 1) {
			append("<h2>Execution times per iteration</h2>\n");
			pushIndentation();
				for (Discovery discovery : b.getDiscoveries()) {
					append("<h3>" + discovery.getProject().getName() + " with <a href=\"Report/" + discovery.getDiscovererId() + discovery.getProject().getName() + ".html\">" + discovery.getDiscovererId() + "</a></h3>\n");
					double maxExecutionTime = ReportingUtilities.maxExecutionTime(discovery.getIterations());
					pushIndentation();
						append("<table width=\"600\" class=\"graph\" cellspacing=\"6\" cellpadding=\"0\">\n");
						pushIndentation();
							append("<tr>\n");
							pushIndentation();
								append("<th>iteration</th><th>relative execution time</th><th>time</th>\n");
							popIndentation();
							append("</tr>\n");
							append("\n");
							int discoveryIterationIndex = 1;
							for (DiscoveryIteration discoveryIteration : discovery.getIterations()) {
								append("<tr>\n");
								pushIndentation();
									append("<td>" + discoveryIterationIndex + "/" + discovery.getIterations().size() + "</td><td class=\"bar\"><div style=\"width: " + discoveryIteration.getDiscoveryTimeInSeconds() / maxExecutionTime * 100.0 + "%\"></div></td><td>" + ReportingUtilities.timeWithUnit((0.0 + discoveryIteration.getDiscoveryTimeInSeconds())) + "</td>\n");
								popIndentation();
								append("</tr>\n");
								discoveryIterationIndex++;
							}
						popIndentation();
						append("</table>\n");
					popIndentation();
					append("\n");
				}
			popIndentation();
			append("\n");
			append("<h2>Save times per iteration</h2>\n");
			for (Discovery discovery : b.getDiscoveries()) {
				pushIndentation();
					append("<h3>" + discovery.getProject().getName() + " with <a href=\"Report/" + discovery.getDiscovererId() + discovery.getProject().getName() + ".html\">" + discovery.getDiscovererId() + "</a></h3>\n");
					pushIndentation();
						double maxSaveTime = ReportingUtilities.maxSaveTime(discovery.getIterations());
						append("<table width=\"600\" class=\"graph\" cellspacing=\"6\" cellpadding=\"0\">\n");
						pushIndentation();
							append("<tr>\n");
							pushIndentation();
								append("<th>iteration</th><th>relative save time</th><th>time(s)</th>\n");
							popIndentation();
							append("</tr>\n");
							int discoveryIterationIndex = 1;
							for (DiscoveryIteration discoveryIteration : discovery.getIterations()) {
								append("<tr>\n");
								pushIndentation();
									append("<td>" + discoveryIterationIndex + "/" + discovery.getIterations().size() + "</td><td class=\"bar\"><div style=\"width: " + discoveryIteration.getSaveTimeInSeconds() / maxSaveTime * 100.0 + "%\"></div></td><td>" + ReportingUtilities.timeWithUnit((0.0 + discoveryIteration.getSaveTimeInSeconds())) + "</td>\n");
								popIndentation();
								append("</tr>\n");
								discoveryIterationIndex++;
							}
						popIndentation();
						append("</table>\n");
					popIndentation();
				popIndentation();
			}
		}
		append("<p/>\n");
		append("<hr/>\n");
		append("<font size=\"-1\"><i>This report has been generated with <a href=\"http://www.eclipse.org/MoDisco/\">MoDisco</a> Java Discoverer Benchmark.</i></font>\n");
		append("</body>\n");
		append("</html>\n");
		popFile(target + "/discoveryReport.html");
	}
	
	private void appendProjectReport(Project project, Benchmark b) {
		pushFile();
		appendHead(((Project)project).getName());
		append("\n");
		append("<h2>Project information</h2>\n");
		pushIndentation();
			append("<b>Project name</b>: <a href=\"Report/" + ((Project)project).getName() + ".html\">" + ((Project)project).getName() + "</a><br/>\n");
			append("<b>total number of lines</b>: " + ((Project)project).getTotalLines() + "<br/>\n");
			append("<b>average number of lines per files</b>: " + ((Project)project).getAverageLinesPerFile() + "<br/>\n");
			append("<b>average file size in bytes</b>: " + ReportingUtilities.sizeWithUnit(0.0 + ((Project)project).getAverageFileSizeInBytes()) + "<br/>\n");
			append("<b>total size in bytes</b>: " + ReportingUtilities.sizeWithUnit(0.0 + project.getTotalSizeInBytes()) + "<br/>\n");
		popIndentation();
		append("<h2>Discoveries on the project</h2>\n");
		pushIndentation();
			append("<h3>Results Overview</h3>\n");
			pushIndentation();
				append("<table border=\"1\" cellpadding=\"2\" cellspacing=\"0\">\n");
				pushIndentation();
					append("<tr>\n");
					pushIndentation();
						append("<th>Project</th>\n");
						append("<th>Discoverer</th>\n");
						append("<th>Average discovery time</th>\n");
						append("<th>Average save time</th>\n");
						append("<th>Number of model elements</th>\n");
						append("<th>Total size</th>\n");
						append("<th>Average file size</th>\n");
						append("<th>Total lines</th>\n");
						append("<th>Average lines per file</th>\n");
						append("<th>XMI size</th>\n");
					popIndentation();
					append("</tr>\n");
					for (Discovery discovery : b.getDiscoveries()) {
						if (discovery.getProject() == project) {
							append("<tr>\n");
							pushIndentation();
								append("=<td><a href=\"" + discovery.getProject().getName() + ".html\">" + discovery.getProject().getName() + "</a></td>\n");
								append("=<td><a href=\"" + discovery.getProject().getName() + '/' + discovery.getDiscovererId() + ".html\">" + discovery.getDiscovererId() + "</a></td>\n");
								append("<td>" + ReportingUtilities.timeWithUnit(0.0 + discovery.getDiscoveryTimeAverageInSeconds()) + " (&sigma; = " + ReportingUtilities.timeWithUnit(0.0 + discovery.getExecutionTimeStandardDeviation()) + "s)</td>\n");
								append("<td>" + ReportingUtilities.timeWithUnit(0.0 + discovery.getSaveTimeAverageInSeconds()) + " (&sigma; = " + ReportingUtilities.timeWithUnit(0.0 + discovery.getSaveTimeStandardDeviation()) + "s)</td>\n");
								append("<td>" + discovery.getNumberOfModelElements() + "</td>\n");
								append("<td>" + ReportingUtilities.sizeWithUnit(0.0 + ((Project)discovery.getProject()).getTotalSizeInBytes()) + "</td>\n");
								append("<td>" + ReportingUtilities.sizeWithUnit(0.0 + ((Project)discovery.getProject()).getAverageFileSizeInBytes()) + "</td>\n");
								append("<td>" + ((Project)discovery.getProject()).getTotalLines() + "</td>\n");
								append("<td>" + ((Project)discovery.getProject()).getAverageLinesPerFile() + "</td>\n");
								append("<td>" + ReportingUtilities.sizeWithUnit(0.0 + discovery.getXmiSizeInBytes()) + "</td>\n");
							popIndentation();
							append("</tr>\n");
						}
					}
				popIndentation();
				append("</table>\n");
			popIndentation();
			append("<h3>Detailed Information</h3>\n");
			pushIndentation();
				for (Discovery discovery : b.getDiscoveries()) {
					if (discovery.getProject() == project) {
						if (discovery.getIterations().size() > 1) {
							append("<h4>Execution times per iteration</h4>\n");
							pushIndentation();
								append("<h5><a href=\"" + discovery.getProject().getName() + ".html\">" + discovery.getProject().getName() + "</a> with <a href=\"" + discovery.getDiscovererId() + discovery.getProject().getName() + ".html\">" + discovery.getDiscovererId() + "</a></h5>\n");
								pushIndentation();
									double maxExecutionTime = ReportingUtilities.maxExecutionTime(discovery.getIterations());
									append("<table width=\"600\" class=\"graph\" cellspacing=\"6\" cellpadding=\"0\">\n");
									pushIndentation();
										append("<tr>\n");
										pushIndentation();
											append("<th>iteration</th><th>relative execution time</th><th>time</th>\n");
										popIndentation();
										append("</tr>\n");
										int discoveryIterationIndex = 1;
										for (DiscoveryIteration discoveryIteration : discovery.getIterations()) {
											append("<tr>\n");
											pushIndentation();
												append("<td>" + discoveryIterationIndex + "/" + discovery.getIterations().size() + "</td><td class=\"bar\"><div style=\"width: " + discoveryIteration.getDiscoveryTimeInSeconds() / maxExecutionTime * 100.0 + "%\"></div></td><td>" + ReportingUtilities.timeWithUnit(0.0 + discoveryIteration.getDiscoveryTimeInSeconds()) + "</td>\n");
											popIndentation();
											append("</tr>\n");
											discoveryIterationIndex++;
										}
									popIndentation();
									append("</table>\n");
								popIndentation();
							popIndentation();
						}
					}
				}
				for (Discovery discovery : b.getDiscoveries()) {
					if (discovery.getProject() == project) {
						if (discovery.getIterations().size() > 1) {
							append("<h4>Save times per iteration</h4>\n");
							pushIndentation();
								append("<h5><a href=\"" + discovery.getProject().getName() + ".html\">" + discovery.getProject().getName() + "</a> with <a href=\"" + discovery.getDiscovererId() + discovery.getProject().getName() + ".html\">" + discovery.getDiscovererId() + "</a></h5>\n");
								pushIndentation();
									double maxSaveTime = ReportingUtilities.maxSaveTime(discovery.getIterations());
									append("<table width=\"600\" class=\"graph\" cellspacing=\"6\" cellpadding=\"0\">\n");
									pushIndentation();
										append("<tr>\n");
										pushIndentation();
											append("<th>iteration</th><th>relative save time</th><th>time(s)</th>\n");
										popIndentation();
										append("</tr>\n");
										int discoveryIterationIndex = 1;
										for (DiscoveryIteration discoveryIteration : discovery.getIterations()) {
											append("<tr>\n");
											pushIndentation();
												append("<td>" + discoveryIterationIndex + "/" + discovery.getIterations().size() + "</td>\n");
												append("<td class=\"bar\"><div style=\"width: " + discoveryIteration.getSaveTimeInSeconds() / maxSaveTime * 100.0 + "%\"></div></td>\n");
												append("<td>" + ReportingUtilities.timeWithUnit(0.0 + discoveryIteration.getSaveTimeInSeconds()) + "</td>\n");
											popIndentation();
											append("</tr>\n");
											discoveryIterationIndex++;
										}
									popIndentation();
									append("</table>\n");
								popIndentation();
							popIndentation();
						}
					}
				}
				for (Discovery discovery : b.getDiscoveries()) {
					if (discovery.getProject() == project) {
						for (DiscoveryIteration iteration : discovery.getIterations()) {
							if (iteration.getDiscoveryErrors() != null) {
								append("<font color=\"red\">\n");
								append("<h2>discovery errors for <a href=\"" + discovery.getDiscovererId() + discovery.getProject().getName() + ".html\">" + discovery.getDiscovererId() + "</a> on <a href=\"" + discovery.getProject().getName() + ".html\">" + discovery.getProject().getName() + "</a>:</h2>\n");
								/*for (*/String error = iteration.getDiscoveryErrors();/*)*/ {
									append("" + error + "<br/>\n");
									append("</font>\n");
								}
							}
						}
					}
				}
			popIndentation();
		popIndentation();
		append("<p/>\n");
		append("<hr/>\n");
		append("<font size=\"-1\"><i>This report has been generated with <a href=\"http://www.eclipse.org/MoDisco/\">MoDisco</a> Java Discoverer Benchmark.</i></font>\n");
		append("</body></html>\n");
		popFile(target + "/Report/" + project.getName() + ".html");
	}

	private void appendDiscovererReport(Discovery discovery) {
		pushFile();
		append("	<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
		append("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
		append("<html>\n");
		append("<head>\n");
		appendStyle();
		append("<title>" + discovery.getName() + "</title>\n");
		append("</head>\n");
		append("<body>\n");
		append("<h1>" + discovery.getName() + "</h1>\n");
		append("<h2>General discovery information</h2>\n");
		append("<b>name</b>: " + discovery.getName() + "<br/>\n");
		append("<b>discoverer</b>: " + discovery.getDiscovererId() + " (" + discovery.getDiscovererClassName() + ")<br/>\n");
		append("<img src=\"avgTimeBySize_" + discovery.getDiscovererId() + ".png\"/>\n");
		if (discovery.getIterations().get(0).getMaxUsedMemoryInBytes() != 0) {
			append("  <img src=\"avgMemoryByProjectSize_" + discovery.getDiscovererId() + ".png\"/>\n");
		}
		append("<hr/>\n");
		append("<font size=\"-1\"><i>This report has been generated with <a href=\"http://www.eclipse.org/MoDisco/\">MoDisco</a> Java Discoverer Benchmark.</i></font>\n");
		append("</body></html>\n");
		popFile(target + "/Report/" + discovery.getDiscovererId() + ".html");
	}

	private void appendDiscoveryReport(Discovery discovery) {
		pushFile();
		appendHead(discovery.getName() + " on " + discovery.getProject().getName());
		append("<h2>General discovery information</h2>\n");
		append("<b>name</b>: " + discovery.getName() + "<br/>\n");
		append("<b>discoverer</b>: " + discovery.getDiscovererId() + " (" + discovery.getDiscovererClassName() + ")<br/>\n");
		append("<b>average discovery time in seconds</b>: " + ReportingUtilities.timeWithUnit(0.0 + discovery.getDiscoveryTimeAverageInSeconds()) + "<br/>\n");
		append("<b>average save time in seconds</b>: " + ReportingUtilities.timeWithUnit(0.0 + discovery.getSaveTimeAverageInSeconds()) + "<br/>\n");
		append("<b>execution time standard deviation</b>: " + ReportingUtilities.timeWithUnit(0.0 + discovery.getExecutionTimeStandardDeviation()) + "<br/>\n");
		append("<b>save time standard deviation</b>: " + ReportingUtilities.timeWithUnit(0.0 + discovery.getSaveTimeStandardDeviation()) + "<br/>\n");
		append("<b>number of model elements</b>: " + discovery.getNumberOfModelElements() + "<br/>\n");
		append("<b>size of the xmi file in bytes</b>: " + ReportingUtilities.sizeWithUnit(0.0 + discovery.getXmiSizeInBytes()) + "<br/>\n");
		append("<h3>Project information</h3>\n");
		append("<b>Project name</b>: <a href=\"" + discovery.getProject().getName() + ".html\">" + discovery.getProject().getName() + "</a><br/>\n");
		append("<b>total number of lines</b>: " + ((Project)discovery.getProject()).getTotalLines() + "<br/>\n");
		append("<b>average number of lines per files</b>: " + ((Project)discovery.getProject()).getAverageLinesPerFile() + "<br/>\n");
		append("<b>average file size in bytes</b>: " + ReportingUtilities.sizeWithUnit(0.0 + ((Project)discovery.getProject()).getAverageFileSizeInBytes()) + "<br/>\n");
		append("<b>total size in bytes</b>: " + ReportingUtilities.sizeWithUnit(0.0 + discovery.getProject().getTotalSizeInBytes()) + "<br/>\n");
		int iterationIndex = 1;
		for (DiscoveryIteration iteration : discovery.getIterations()) {
			if (iterationIndex > 1) {
				append("<hr/>\n");
			}
			append("<h2>iteration " + iterationIndex + "</h2>\n");
			pushIndentation();
			append("<b>date</b>: " + iteration.getDiscoveryDate() + "<br/>\n");
			append("<b>save time</b>: " + ReportingUtilities.timeWithUnit(0.0 + iteration.getSaveTimeInSeconds()) + "<br/>\n");
			append("<b>discovery time</b>: " + ReportingUtilities.timeWithUnit(0.0 + iteration.getDiscoveryTimeInSeconds()) + "<br/>\n");
			append("<b>max used memory</b>: " + ReportingUtilities.sizeWithUnit(0.0 + iteration.getMaxUsedMemoryInBytes()) + "<br/>\n");
			append("<img src=\"" + discovery.getDiscovererId() + "/memoryByTime-" + (discovery.getIterations().indexOf(iteration)+1) + ".png\"/>\n");
			if (iteration.getDiscoveryErrors() != null) {
				append("<font color=\"red\">\n");
				append("<h3>discovery errors</h3>\n");
				append(iteration.getDiscoveryErrors() + "<br/>\n");
				append("</font>\n");
			}
			iterationIndex++;
			popIndentation();
		}
		append("<hr/>\n");
		append("<font size=\"-1\"><i>This report has been generated with <a href=\"http://www.eclipse.org/MoDisco/\">MoDisco</a> Java Discoverer Benchmark.</i></font>\n");
		append("</body></html>\n");
		popFile(target + "/Report/" + discovery.getProject().getName() + "/" + discovery.getDiscovererId() + ".html");
	}

	private void appendStyle() {
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
			append(".bar div {\n");
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
	}

	private void appendHead(String title) {
		append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
		append("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
		append("<html>\n");
		append("<head>\n");
		appendStyle();
		append("<title>" + title + "</title>\n");
		append("</head>\n");
		append("<body>\n");
		append("<h1>" + title + "</h1>\n");
	}

	@Override
	public String toString() {
		return s.toString();
	}
}