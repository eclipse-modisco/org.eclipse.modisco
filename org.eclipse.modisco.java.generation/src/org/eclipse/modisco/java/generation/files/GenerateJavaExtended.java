/*******************************************************************************
 * Copyright (c) 2010, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.aql.evaluation.GenerationResult;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.BasicMonitor.Printing;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.generation.Messages;
import org.eclipse.modisco.java.generation.utils.JavaUtils;

/**
 *
 * Entry point of the 'GenerateJava' generation module with additional post
 * action : Java formatting.
 * 
 * @see GenerateJava
 *
 */
public class GenerateJavaExtended extends GenerateJavaGenerator {

	/**
	 * Constructor.
	 * 
	 * @param resources
	 *            the {@link List} of model resources to load
	 * @param target
	 *            the target folder for the generation
	 * @since 1.6
	 */
	public GenerateJavaExtended(List<String> resources, String target) {
		super(resources, target);
	}

	@Deprecated
	public GenerateJavaExtended() {
	//    super();
		super(null, null);
		throw new UnsupportedOperationException("Use Acceleo 4.x API");
	}

	@Deprecated
	public GenerateJavaExtended(URI modelURI, File targetFolder,
			List<? extends Object> arguments) throws IOException {
    //	super(modelURI, targetFolder, arguments);
		super(null, null);
		throw new UnsupportedOperationException("Use Acceleo 4.x API");
	}

	@Deprecated
	public GenerateJavaExtended(EObject model, File targetFolder,
			List<? extends Object> arguments) throws IOException {
    //	super(model, targetFolder, arguments);
		super(null, null);
		throw new UnsupportedOperationException("Use Acceleo 4.x API");
	}

	@Override
	protected void afterGeneration(GenerationResult generationResult) {
		super.afterGeneration(generationResult);

		// apply default java code formatting to generated files
		JavaUtils.formatJavaCode(new File(this.target));
	}

	@Deprecated
	public void doGenerate(Monitor monitor) throws IOException {
		generate(monitor);
	}

	/**
	 * This can be used to launch the generation from a standalone application.
	 *
	 * @param args
	 *            Arguments of the generation.
	 */
	public static void main(String[] args) {
		if (args.length == 2) {
			final List<String> resources = new ArrayList<>();
			for (String resource : args[0].split(",")) { //$NON-NLS-1$
				resources.add(resource.trim());
			}
			final String target = args[1];
			final GenerateJavaExtended generator = new GenerateJavaExtended(resources, target);
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

}
