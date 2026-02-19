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
package org.eclipse.modisco.jee.jsp.generation.files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.java.generation.utils.JavaUtils;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;

/**
 * This clone of org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator provides similar / reduced API
 * to reduce API breakage by the direct Java re-implementation.
 */
@SuppressWarnings("nls")
abstract class AbstractAcceleoGenerator {
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected List<? extends Object> generationArguments;

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected List<?> generationListeners = null;

	/** The model resource on which to iterate for this generation. */
	protected Resource modelResource;

	/** The model on which to iterate for this generation. */
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected EObject model;

	/** The root element of the generation module for this launcher. */
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected EObject module;

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected List<String> propertiesFiles = new ArrayList<String>(1);

	/** The folder that will be considered "root" of the generated files. */
	protected File targetFolder;

	/**
	 * This will be used to know which resource to <u>not</u> unload from the resourceSet post generation.
	 */
	protected Set<Resource> originalResources = new HashSet<>();

	/**
	 * The properties loader service is used to retrieve properties.
	 */
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected Object acceleoPropertiesLoaderService;

	/**
	 * The original resource factory registry of the resource set containing the model if the generation is
	 * launched from {@link #initialize(EObject, File, List)}. This attribute is used only by the
	 * {@link AbstractAcceleoGenerator} to restore the resource factory registry after the generation. It
	 * should <b>not</b> be used for anything else.
	 */
	protected Resource.Factory.Registry resourceFactoryRegistry;

	/**
	 * The generation ID is a unique identifier describing all the parameters of the generation. It is
	 * computed thanks to
	 * {@link org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil#computeLaunchConfigID(String, String, String, String, List)}
	 * .
	 */
	protected String generationID;

	/**
	 * Allows clients to add a generation listener to this generator instance.
	 * 
	 * @param listener
	 *            The listener that is to be registered for this generator.
	 */
	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public void addGenerationListener(Object listener) {}

	/**
	 * Launches the generation described by this instance.
	 * 
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             This will be thrown if any of the output files cannot be saved to disk.
	 */
	public void doGenerate(Monitor monitor) throws IOException {
		generate(monitor);
	}

	/**
	 * Launches the generation described by this instance.
	 * 
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @return This will return a preview of the generation when the generation strategy feeds it to us.
	 * @throws IOException
	 *             This will be thrown if any of the output files cannot be saved to disk.
	 */
	public Map<String, String> generate(Monitor monitor) throws IOException {
		return generate(monitor, true);
	}

	/**
	 * Launches the generation described by this instance.
	 * 
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @param recursive
	 *            if <code>true</code> the {@link AbstractAcceleoGenerator#getModel() model} will be iterated
	 *            over
	 * @return This will return a preview of the generation when the generation strategy feeds it to us.
	 * @throws IOException
	 *             This will be thrown if any of the output files cannot be saved to disk.
	 * @since 3.5
	 */
	public Map<String, String> generate(Monitor monitor, boolean recursive) throws IOException {
	/*	boolean notificationsState = false;
		if (EMFPlugin.IS_ECLIPSE_RUNNING && !AcceleoPreferences.areNotificationsForcedDisabled()) {
			notificationsState = AcceleoPreferences.areNotificationsEnabled();
			AcceleoPreferences.switchNotifications(true);
		}
		File target = getTargetFolder();
		checkTargetExists(target);
		AcceleoService service = createAcceleoService();
		String[] templateNames = getTemplateNames(); */
		Map<String, String> result = new HashMap<>();

		// Start
	/*	service.doPrepareGeneration(monitor, target);

		acceleoPropertiesLoaderService = getPropertiesLoaderService(service);
		if (acceleoPropertiesLoaderService != null) {
			acceleoPropertiesLoaderService.initializeService(getProperties());
		}

		for (int i = 0; i < templateNames.length; i++) {
			result.putAll(service.doGenerate(getModule(), templateNames[i], getModel(), recursive,
					getArguments(), target, monitor));
		}

		// End
		service.finalizeGeneration();

		postGenerate(getModule().eResource().getResourceSet());
		originalResources.clear();
		service.clearCaches();

		if (!service.hasGenerationOccurred()) {
			if (EMFPlugin.IS_ECLIPSE_RUNNING && AcceleoPreferences.isDebugMessagesEnabled()) {
				AcceleoEnginePlugin.log(AcceleoEngineMessages
						.getString("AcceleoService.NoGenerationHasOccurred"), false); //$NON-NLS-1$				
			} else if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
				System.err.println(AcceleoEngineMessages.getString("AcceleoService.NoGenerationHasOccurred")); //$NON-NLS-1$
			}
		}
		if (EMFPlugin.IS_ECLIPSE_RUNNING && !AcceleoPreferences.areNotificationsForcedDisabled()) {
			AcceleoPreferences.switchNotifications(notificationsState);
		} */
		return result;
	}

	/**
	 * Checks that the target folder exists or can be created on disk.
	 * 
	 * @param target
	 *            target folder for this generation.
	 * @throws IOException
	 *             if the folder doesn't exist and cannot be created.
	 * @since 3.6
	 */
	public void checkTargetExists(File target) throws IOException {
		if (!target.exists() && !target.mkdirs()) {
			throw new IOException("target directory " + target + " couldn't be created."); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public List<? extends Object> getArguments() {
		return generationArguments;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public List<?> getGenerationListeners() {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public Object getGenerationStrategy() {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public EObject getModel() {
		return model;
	}

	public Resource getModelResource() {
		return modelResource;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public EObject getModule() {
		return module;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public abstract String getModuleName();

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public List<String> getProperties() {
		return new ArrayList<String>();
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public void addPropertiesFile(String propertiesFile) {}

	/**
	 * If you wish to generate files in another folder than {@link #targetFolder}, alter it here.
	 * 
	 * @return The root directory in which to generate files.
	 */
	public File getTargetFolder() {
		return targetFolder;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public abstract String[] getTemplateNames();

	/**
	 * This will initialize all required information for this generator.
	 * 
	 * @param element
	 *            We'll iterate over the content of this element to find Objects matching the first parameter
	 *            of the template we need to call.
	 * @param folder
	 *            This will be used as the output folder for this generation : it will be the base path
	 *            against which all file block URLs will be resolved.
	 * @param arguments
	 *            If the template which will be called requires more than one argument taken from the model,
	 *            pass them here.
	 * @throws IOException
	 *             This can be thrown in two scenarios : the module cannot be found, or it cannot be loaded.
	 */
	public void initialize(EObject element, File folder, List<? extends Object> arguments) throws IOException {
		addListeners();
		addProperties();

		model = element;
		modelResource = element.eResource();
		targetFolder = folder;
		generationArguments = arguments;

		this.postInitialize();
	}

	/**
	 * This will initialize all required information for this generator.
	 * 
	 * @param modelURI
	 *            URI where the model on which this generator will be used is located.
	 * @param folder
	 *            This will be used as the output folder for this generation : it will be the base path
	 *            against which all file block URLs will be resolved.
	 * @throws IOException
	 *             This can be thrown in three scenarios : the module cannot be found, it cannot be loaded, or
	 *             the model cannot be loaded.
	 */
	public void initialize(URI modelURI, File folder, List<?> zzarguments) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		// make sure that metamodel projects in the workspace override those in plugins
		resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

		registerResourceFactories(resourceSet);
		registerPackages(resourceSet);

		addListeners();
		addProperties();
		modelResource = resourceSet.getResource(modelURI, true);
		for (EObject eObject : modelResource.getContents()) {
			model = eObject;
			break;
		}
		List<Diagnostic> errors = modelResource.getErrors();
		StringBuilder s = null;
		for (Diagnostic diagnostic : errors) {
			if (diagnostic != null) {
				if (s == null) {
					s = new StringBuilder();
					s.append("Failed to load '" + modelURI + "'");
				}
				s.append("\n" + diagnostic.getMessage());
			}
		}
		if (s != null) {
			Logger.logWarning(s.toString(), null);
		}
		// check errors
		targetFolder = folder;
		this.postInitialize();
	}

	/**
	 * This method is called after the initialization of the generator.
	 */
	protected void postInitialize() {
		// do nothing by default
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public boolean isInWorkspace(Class<? extends EPackage> ePackageClass) {
		return EMFPlugin.IS_ECLIPSE_RUNNING;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public void registerPackages(ResourceSet resourceSet) {
	}

	/**
	 * This will update the resource set's resource factory registry with all usual factories.
	 * 
	 * @param resourceSet
	 *            The resource set which registry has to be updated.
	 */
	public void registerResourceFactories(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
	}

	/**
	 * Sets the generation ID.
	 * 
	 * @param generationID
	 *            The generation ID.
	 */
	public void setGenerationID(String generationID) {
		this.generationID = generationID;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void addListeners() {}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void addProperties() {
		// empty implementation
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected Object createAcceleoService() {
		return null;
	}

	/**
	 * This will be called by the engine when the generation stops. By default, we'll use this opportunity to
	 * unload the resources we've loaded in the resource set.
	 * 
	 * @param resourceSet
	 *            The resource set from which to unload resources.
	 */
	protected void postGenerate(ResourceSet resourceSet) {
		List<Resource> unload = new ArrayList<Resource>(resourceSet.getResources());
		unload.removeAll(originalResources);
		for (Resource res : unload) {
			res.unload();
			resourceSet.getResources().remove(res);
		}

		clearPackageRegistry();

		resourceSet.setResourceFactoryRegistry(resourceFactoryRegistry);
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected void clearPackageRegistry() {
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	public Object getPropertiesLoaderService(Object acceleoService) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected URIConverter createURIConverter() {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			return null;
		}
		return new ExtensibleURIConverterImpl() {};
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected URI createTemplateURI(String entry) {
		if (entry.startsWith("file:") || entry.startsWith("jar:")) { //$NON-NLS-1$ //$NON-NLS-2$ 
			return URI.createURI(URI.decode(entry));
		}
		return URI.createFileURI(URI.decode(entry));
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected URL findModuleURL(String moduleName) {
		return null;
	}

	@Deprecated	/* @Deprecated obsolete Acceleo 3 API */
	protected EPackage getOCLStdLibPackage() {
		EcoreEnvironmentFactory factory = new EcoreEnvironmentFactory();
		EcoreEnvironment environment = (EcoreEnvironment)factory.createEnvironment();
		EPackage oclStdLibPackage = (EPackage)EcoreUtil.getRootContainer(environment.getOCLStandardLibrary().getBag());
		environment.dispose();
		return oclStdLibPackage;
	}
}
