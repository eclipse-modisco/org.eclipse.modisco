/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.jee.jsp.generation.files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Entry point of the 'GenerateJsp' generation module.
 *
 * @generated
 */
@SuppressWarnings("all")
@Deprecated /* Use the GenerateJspGenerator and the Acceleo 4.2 API */
public class GenerateJsp extends GenerateJspGenerator
{
	/**
	 * The target folder for the generation.
	 * 
	 * @generated
	 */
	protected final List<EObject> models = new ArrayList<>();

	/**
	 * Allows the public constructor to be used. Note that a generator created
	 * this way cannot be used to launch generations before one of
	 * {@link #initialize(EObject, File, List)} or
	 * {@link #initialize(URI, File, List)} is called.
	 * <p>
	 * The main reason for this constructor is to allow clients of this
	 * generation to call it from another Java file, as it allows for the
	 * retrieval of {@link #getProperties()} and
	 * {@link #getGenerationListeners()}.
	 * </p>
	 *
	 * @generated
	 */
	public GenerateJsp() {
		super(null, null);
    }

	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 *
	 * @param modelURI
	 *            URI where the model on which this generator will be used is
	 *            located.
	 * @param targetFolder
	 *            This will be used as the output folder for this generation :
	 *            it will be the base path against which all file block URLs
	 *            will be resolved.
	 * @param arguments
	 *            If the template which will be called requires more than one
	 *            argument taken from the model, pass them here.
	 * @throws IOException
	 *             This can be thrown in three scenarios : the module cannot be
	 *             found, it cannot be loaded, or the model cannot be loaded.
	 * @generated
	 */
	public GenerateJsp(URI modelURI, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		super(Collections.singletonList(modelURI.toFileString()), targetFolder.getAbsolutePath());
		List<String> resourcePaths = Collections.singletonList(modelURI.toFileString());
		List<Resource> resources = loadResources(new ResourceSetImpl(), resourcePaths, new BasicMonitor());
		for (Resource resource : resources) {
			for (EObject eRoot : resource.getContents()) {
				models.add(eRoot);
				break;
			}
		}
		if ((arguments != null) && (arguments.size() > 0)) {
			System.err.println(getClass().getName() + " ignores " + arguments);
		}
	}

	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 *
	 * @param model
	 *            We'll iterate over the content of this element to find Objects
	 *            matching the first parameter of the template we need to call.
	 * @param targetFolder
	 *            This will be used as the output folder for this generation :
	 *            it will be the base path against which all file block URLs
	 *            will be resolved.
	 * @param arguments
	 *            If the template which will be called requires more than one
	 *            argument taken from the model, pass them here.
	 * @throws IOException
	 *             This can be thrown in two scenarios : the module cannot be
	 *             found, or it cannot be loaded.
	 * @generated
	 */
	public GenerateJsp(EObject model, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		super(null, null);
		throw new UnsupportedOperationException("Use Acceleo 4.2 API");
    //    initialize(model, targetFolder, arguments);
    }

	/**
	 * This can be used to launch the generation from a standalone application.
	 *
	 * @param args
	 *            Arguments of the generation.
	 * @generated
	 */
	public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Arguments not valid : {model, folder}.");
            } else {
                URI modelURI = URI.createFileURI(args[0]);
                File folder = new File(args[1]);
                
                List<String> arguments = new ArrayList<String>();
                
                /*
                 * If you want to change the content of this method, do NOT forget to change the "@generated"
                 * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
                 * of the Acceleo module with the main template that has caused the creation of this class will
                 * revert your modifications.
                 */

                /*
                 * Add in this list all the arguments used by the starting point of the generation
                 * If your main template is called on an element of your model and a String, you can
                 * add in "arguments" this "String" attribute.
                 */
                
                GenerateJsp generator = new GenerateJsp(modelURI, folder, arguments);
                generator.doGenerate(new BasicMonitor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void doGenerate(Monitor monitor) throws IOException {
		generate(monitor != null ? monitor : new BasicMonitor());
    }

	public EObject getModel() {
		return models.size() > 0 ? models.get(0) : null;
	}
}
