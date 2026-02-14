/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *	Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.jee.jsp.generation.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.java.generation.files.JavaModel2JavaTextSwitch;

/**
 * Entry point of the 'GenerateJsp' generation module.
 */
@SuppressWarnings("nls")
public class GenerateJsp extends AbstractAcceleoGenerator
{
	/**
	 * The name of the module.
	 */
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public static final String MODULE_FILE_NAME = "/org/eclipse/modisco/jee/jsp/generation/files/GenerateJsp"; //$NON-NLS-1$

	/**
	 * The name of the templates that are to be generated.
	 */
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public static final String[] TEMPLATE_NAMES = { "write" }; //$NON-NLS-1$
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
	 */
	public GenerateJsp() {
		// Empty implementation
	}

	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 *
	 * @param modelURI
	 *			URI where the model on which this generator will be used is
	 *			located.
	 * @param targetFolder
	 *			This will be used as the output folder for this generation :
	 *			it will be the base path against which all file block URLs
	 *			will be resolved.
	 * @param arguments
	 *			If the template which will be called requires more than one
	 *			argument taken from the model, pass them here.
	 * @throws IOException
	 *			 This can be thrown in three scenarios : the module cannot be
	 *			 found, it cannot be loaded, or the model cannot be loaded.
	 */
	public GenerateJsp(URI modelURI, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		   initialize(modelURI, targetFolder, arguments);
	}

	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 *
	 * @param model
	 *			We'll iterate over the content of this element to find Objects
	 *			matching the first parameter of the template we need to call.
	 * @param targetFolder
	 *			This will be used as the output folder for this generation :
	 *			it will be the base path against which all file block URLs
	 *			will be resolved.
	 * @param arguments
	 *			If the template which will be called requires more than one
	 *			argument taken from the model, pass them here.
	 * @throws IOException
	 *			 This can be thrown in two scenarios : the module cannot be
	 *			 found, or it cannot be loaded.
	 */
	public GenerateJsp(EObject model, File targetFolder,
			List<? extends Object> arguments) throws IOException {
		   initialize(model, targetFolder, arguments);
	}

	/**
	 * This can be used to launch the generation from a standalone application.
	 *
	 * @param args
	 *			Arguments of the generation.
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

	public EObject getModel() {
		return model;
	}

	/**
	 * @since 1.6
	 */
	protected JspModel2JspTextSwitch createJspModel2JspTextSwitch(String targetFolder) {
		return new JspModel2JspTextSwitch(targetFolder);
	}

	/**
	 * @since 1.6
	 */
	public void doGenerate(Monitor monitor) throws IOException {
		List<Resource> resources = Collections.singletonList(modelResource);
		JspModel2JspTextSwitch javaModel2javaTextSwitch = createJspModel2JspTextSwitch(targetFolder.getAbsolutePath());
		Map<String, String> file2text = javaModel2javaTextSwitch.generate(resources);
		List<String> fileKeys = new ArrayList<>(file2text.keySet());
		Collections.sort(fileKeys);
		for (String fileKey : fileKeys) {
			String fileText = file2text.get(fileKey);
		//	System.out.println("*******************************************");
		//	System.out.println(fileKey);
		//	System.out.println("*******************************************");
		//	System.out.println(fileText);
			File file = new File(fileKey);
			file.getParentFile().mkdirs();
			FileWriter fw = new FileWriter(file);
			fw.append(fileText);
			fw.close();
		}
	}

	@Override
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public String getModuleName() {
		return MODULE_FILE_NAME;
	}

	/**
	 * If the module(s) called by this launcher require properties files, return their qualified path from
	 * here.Take note that the first added properties files will take precedence over subsequent ones if they
	 * contain conflicting keys.
	 * <p>
	 * Properties need to be in source folders, the path that we expect to get as a result of this call are of
	 * the form &lt;package>.&lt;properties file name without extension>. For example, if you have a file
	 * named "messages.properties" in package "org.eclipse.acceleo.sample", the path that needs be returned by
	 * a call to {@link #getProperties()} is "org.eclipse.acceleo.sample.messages".
	 * </p>
	 *
	 * @return The list of properties file we need to add to the generation context.
	 * @see java.util.ResourceBundle#getBundle(String)
	 */
	@Override
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public List<String> getProperties() {
		/*
		 * If you want to change the content of this method, do NOT forget to change the "@generated"
		 * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
		 * of the Acceleo module with the main template that has caused the creation of this class will
		 * revert your modifications.
		 */

		/*
		 * TODO if your generation module requires access to properties files, add their qualified path to the list here.
		 * 
		 * Properties files can be located in an Eclipse plug-in or in the file system (all Acceleo projects are Eclipse
		 * plug-in). In order to use properties files located in an Eclipse plugin, you need to add the path of the properties
		 * files to the "propertiesFiles" list:
		 * 
		 * final String prefix = "platform:/plugin/";
		 * final String pluginName = "org.eclipse.acceleo.module.sample";
		 * final String packagePath = "/org/eclipse/acceleo/module/sample/properties/";
		 * final String fileName = "default.properties";
		 * propertiesFiles.add(prefix + pluginName + packagePath + fileName);
		 * 
		 * With this mechanism, you can load properties files from your plugin or from another plugin.
		 * 
		 * You may want to load properties files from the file system, for that you need to add the absolute path of the file:
		 * 
		 * propertiesFiles.add("C:\Users\MyName\MyFile.properties");
		 * 
		 * If you want to let your users add properties files located in the same folder as the model:
		 *
		 * if (EMFPlugin.IS_ECLIPSE_RUNNING && model != null && model.eResource() != null) { 
		 *	 propertiesFiles.addAll(AcceleoEngineUtils.getPropertiesFilesNearModel(model.eResource()));
		 * }
		 * 
		 * To learn more about Properties Files, have a look at the Acceleo documentation (Help -> Help Contents).
		 */
		return propertiesFiles;
	}

	/**
	 * Adds a properties file in the list of properties files.
	 *
	 * @param propertiesFile
	 *			The properties file to add.
	 * @since 3.1
	 */
	@Override
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public void addPropertiesFile(String propertiesFile) {
		this.propertiesFiles.add(propertiesFile);
	}

	@Override
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public String[] getTemplateNames() {
		return TEMPLATE_NAMES;
	}
}
