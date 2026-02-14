//Start of user code copyright
/*******************************************************************************
 * Copyright (c) 2026 OBEOSOFT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Yvan Lussaud (OBEOSOFT) - initial API and implementation
 *******************************************************************************/
//End of user code
package org.eclipse.modisco.java.discoverer.benchmark.template.html;

//Start of user code imports

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicMonitor.Printing;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;

//End of user code

/**
 * Standalone launcher for
 * org::eclipse::modisco::java::discoverer::benchmark::template::html::htmlReport.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
@SuppressWarnings("nls")
public class HtmlReportGenerator {

	/**
	 * The {@link List} of resources to load.
	 */
	protected final List<String> resources;

	/**
	 * The target folder for the generation.
	 */
	protected final String target;

	protected final HtmlReport reportGenerator;

	/**
	 * Constructor.
	 * 
	 * @param resources
	 *                      the {@link List} of model resources to load
	 * @param target
	 *                      the target folder for the generation
	 */
	public HtmlReportGenerator(List<String> resources, String target) {
		this.resources = resources;
		this.target = target;
		this.reportGenerator = new HtmlReport(target);
	}

	/**
	 * Main entry point.
	 * 
	 * @param args
	 *                 resources separated by a comma, target folder
	 */
	public static void main(String[] args) {
		if (args.length == 2) {
			final List<String> resources = new ArrayList<>();
			for (String resource : args[0].split(",")) {
				resources.add(resource.trim());
			}
			final String target = args[1];
			final HtmlReportGenerator generator = new HtmlReportGenerator(resources, target);
			generator.generate(getMonitor());
		} else {
			printUsage();
		}

	}

	/**
	 * Print the usage.
	 */
	private static void printUsage() {
		System.out.println("Usage: <resources> <target>");
		System.out.println("Example: model1.xmi,model2.xmi src-gen/");
	}

	/**
	 * Gets the progress {@link Monitor}.
	 * 
	 * @return the progress {@link Monitor}
	 */
	private static Monitor getMonitor() {
		return new Printing(new PrintStream(System.out));
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	public void generate(Monitor monitor) {
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected List<Object> getTemplates(Module module) {
		return null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected List<EObject> getValues(Object queryEnvironment,
			Map<EClass, List<EObject>> valuesCache, Object type,
			ResourceSet resourceSetForModels, List<Resource> modelResources, Monitor monitor) {
		return null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected String getModuleQualifiedName() {
		return "org::eclipse::modisco::java::discoverer::benchmark::template::html::htmlReport";
	}

	/**
	 * Gets the target folder {@link URI}.
	 * 
	 * @param target
	 *                   the target folder {@link String}.
	 * @return the target folder {@link URI}
	 */
	protected URI getTargetURI(String targetString) {
		return URI.createFileURI(new File(targetString).getAbsolutePath() + "/");
	}

	protected Map<String, String> getOptions() {
		Map<String, String> res = new LinkedHashMap<>();
		return res;
	}

	protected ResourceSet createDefaultResourceSet() {
		return new ResourceSetImpl();
	}

	protected ResourceSet createResourceSetForModel(Object generationKey,
			Map<String, String> options, List<Exception> exceptions, ResourceSet resourceSet) {
		return new ResourceSetImpl();
	}

	/**
	 * Initializes the {@link ResourceSet} for models for standalone use.
	 * 
	 * @param resourceSetForModels
	 */
	protected void standaloneInitialization(ResourceSet resourceSetForModels) {
		// initialize EPackages
		JavaBenchmarkPackage.eINSTANCE.getName();
		BenchmarkPackage.eINSTANCE.getName();

		// register default XMI resource factory
		resourceSetForModels.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	}

	/**
	 * Loads {@link Resource} in the given {@link ResourceSet} for models.
	 * 
	 * @param resourceSetForModels
	 *                                 the {@link ResourceSet} for models
	 * @param resources
	 *                                 the {@link List} of resource names to load
	 * @param monitor
	 *                                 the progress {@link Monitor}, it must
	 *                                 consumes the number of resources
	 * @return the {@link List} of loaded {@link Resource}
	 */
	protected List<Resource> loadResources(ResourceSet resourceSetForModels, List<String> resources2,
			Monitor monitor) {
		final List<Resource> res = new ArrayList<>();

		for (String resource : resources2) {
			monitor.subTask("Loading " + resource);
			final Resource loaded = resourceSetForModels.getResource(URI.createURI(resource, true),
					true);
			if (loaded != null) {
				res.add(loaded);
			}
			monitor.worked(1);
			if (monitor.isCanceled()) {
				break;
			}
		}

		return res;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected Object createResolver() {
		return null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected Object createAcceleoQueryEnvironment(
			Map<String, String> options, Object resolver,
			ResourceSet resourceSetForModels) {
		return null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected Object createAcceleoEvaluator(URI targetURI,
			Object resolver, Object queryEnvironment) {
		return null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected Object createGenerationStrategy(
			ResourceSet resourceSetForModels) {
		return null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void beforeGeneration(Object evaluator,
			Object queryEnvironment, Object module,
			ResourceSet resourceSetForModels, Object strategy, URI destination,
			URI logURI) {
		// this is called before the generation starts
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printDiagnostics(Object generationResult) {}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printDiagnostic(PrintStream stream, Diagnostic diagnostic, String indentation) {}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void afterGeneration(Object generationResult) {}
}
