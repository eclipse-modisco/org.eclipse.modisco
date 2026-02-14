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
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting;

//Start of user code imports

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor.Printing;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.catalog.CatalogPackage;
import org.eclipse.modisco.infra.discovery.launch.LaunchPackage;

//End of user code

/**
 * Standalone launcher for
 * org::eclipse::modisco::infra::discovery::benchmark::core::internal::reporting::HtmlReport.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public class HtmlReportGenerator {

	/**
	 * The {@link List} of resources to load.
	 */
	protected final List<String> resources;

	/**
	 * The target folder for the generation.
	 */
	protected final String target;
	
	protected HtmlReport reportGenerator;

	/**
	 * Constructor.
	 * 
	 * @param resources the {@link List} of model resources to load
	 * @param target    the target folder for the generation
	 */
	public HtmlReportGenerator(List<String> resources, String target) {
		this.resources = resources;
		this.target = target;
		reportGenerator = new HtmlReport(target);
	}

	/**
	 * Main entry point.
	 * 
	 * @param args resources separated by a comma, target folder
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
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
	public void generate(Monitor monitor) throws IOException {
		if (target != null) {
			List<Resource> eResources = loadResources(new ResourceSetImpl(), resources, monitor);
			List<EObject> values = new ArrayList<>();
			for (Resource eResource : eResources) {
				values.addAll(eResource.getContents());
			}
			reportGenerator.generate(values);
		}
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected List<Object> getTemplates(Object module) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected List<EObject> getValues(Object queryEnvironment,
			Map<EClass, List<EObject>> valuesCache, Object type, ResourceSet resourceSetForModels,
			List<Resource> modelResources, Monitor monitor) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected String getModuleQualifiedName() {
		return "org::eclipse::modisco::infra::discovery::benchmark::core::internal::reporting::HtmlReport";
	}

	/**
	 * Gets the target folder {@link URI}.
	 * 
	 * @param target the target folder {@link String}.
	 * @return the target folder {@link URI}
	 */
	protected URI getTargetURI(String target) {
		return URI.createFileURI(new File(target).getAbsolutePath() + "/");
	}

	/**
	 * Gets the {@link Map} of options for the generation.
	 * 
	 * @return the {@link Map} of options for the generation
	 */
	protected Map<String, String> getOptions() {
		Map<String, String> res = new LinkedHashMap<>();
		return res;
	}

	/**
	 * Creates the default {@link ResourceSet}.
	 * 
	 * @return the created default {@link ResourceSet}
	 */
	protected ResourceSet createDefaultResourceSet() {
		return new ResourceSetImpl();
	}

	/**
	 * Creates the {@link ResourceSet} for models.
	 * 
	 * @param generationKey the generation key
	 * @param options       the {@link Map} of options
	 * @param exceptions    the {@link List} of exceptions
	 * @param resourceSet   the default {@link ResourceSet}
	 * @return the created {@link ResourceSet} for models
	 */
	protected ResourceSet createResourceSetForModel(Object generationKey, Map<String, String> options,
			List<Exception> exceptions, ResourceSet resourceSet) {
		return new ResourceSetImpl();
	}

	/**
	 * Initializes the {@link ResourceSet} for models for standalone use.
	 * 
	 * @param resourceSetForModels the {@link ResourceSet} for models
	 */
	protected void standaloneInitialization(ResourceSet resourceSetForModels) {
		// initialize EPackages
		BenchmarkPackage.eINSTANCE.getName();
		CatalogPackage.eINSTANCE.getName();
		LaunchPackage.eINSTANCE.getName();

		// register default XMI resource factory
		resourceSetForModels.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	}

	/**
	 * Loads {@link Resource} in the given {@link ResourceSet} for models.
	 * 
	 * @param resourceSetForModels the {@link ResourceSet} for models
	 * @param resources            the {@link List} of resource names to load
	 * @param monitor              the progress {@link Monitor}, it must consumes
	 *                             the number of resources
	 * @return the {@link List} of loaded {@link Resource}
	 */
	protected List<Resource> loadResources(ResourceSet resourceSetForModels, List<String> resources, Monitor monitor) {
		final List<Resource> res = new ArrayList<>();

		for (String resource : resources) {
			monitor.subTask("Loading " + resource);
			final Resource loaded = resourceSetForModels.getResource(URI.createURI(resource, true), true);
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

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected Object createAcceleoQueryEnvironment(Map<String, String> options,
			Object resolver, ResourceSet resourceSetForModels) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected Object createAcceleoEvaluator(URI targetURI, Object resolver,
			Object queryEnvironment) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected Object createGenerationStrategy(ResourceSet resourceSetForModels) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void beforeGeneration(Object evaluator, Object queryEnvironment,
			Object module, ResourceSet resourceSetForModels, Object strategy, URI destination,
			URI logURI) {
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void printDiagnostics(Object generationResult) {}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printDiagnostic(PrintStream stream, Diagnostic diagnostic, String indentation) {
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void afterGeneration(Object generationResult) {}
}
